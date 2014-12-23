/**
 * Created by Administrator on 2014/12/24.
 */
$(function(){
    $('#submit').click(function(){
        var name=$("input[name='name']:checked").val();
        if(name==""){
            formwarning("#alerterror","请填写导航名称");
            return false;
        }

        var position=$('#position').val();
        var isTargetBlank=$('#isTargetBlank').val();
        var isVisible=$('#isVisible').val();
        var sort=$('#sort').val();
        if(sort==""){
            formwarning("# alerterror","请填写排序");
            return false;
        }
        this.value = "提交中";
        this.disabled = true;
        $.post("addSitenavigation.action",{
            "name":name,
            "position":position,
            "isTargetBlank":isTargetBlank,
            "isVisible":isVisible,
            "sort":sort
        },function(data){
            if(data.sucflag){
                window.location.href="sitenavigationment.jsp";
            } else {
                formwarning("#alerterror", "导航增加失败");
                return false;
            }
        });
    });

});
findSiteNavigationBysnId=function() {
    var name=$.query.get('name');
  if(name==""){
        return false;
    }
 $.post("findSiteNavigationBysnId.action",{"snId":snId},function(data){
    if(data.bean!=null){
        if("1"==data.bean.name){
        }else{
            $("input[name='name']").get(1).checked=true;
        }
    }
});
};
/*
 根据地址栏参数判断是添加还是编辑
 */
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findSiteNavigationBysnId();
        return;
    }else{
        return;
    }
});
