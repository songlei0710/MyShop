
/**
 * Created by wendy on 2014/12/23.
 * 5-温东源
 */
$(function(){
    $('#submit').click(function(){
        var nameA=$('#nameA').val();
        if(nameA==""){
            formwarning("#alerterror","请填写所选择的分组");
            return false;
        }
        var status=$('#status').val();
        var createTime=$('#createTime').val();
        var creatorId=$('#creatorId').val();
        var updateTime=$('#updateTime').val();
        var versionT=$('#versionT').val();
        var attrs=$('#attrs').val();
        var sort=$('#sort').val();
        if(sort==""){
            formwarning("# alerterror","请填写排序");
            return false;
        }
        this.value = "提交中";
        this.disabled = true;
        $.post("addGroup.action",{
            "nameA":nameA,
            "status":status,
            "createTime":createTime,
            "creatorId":creatorId,
            "updateTime":updateTime,
            "versionT":versionT,
            "attrs":attrs,
            "sort":sort
        },function(data){
            if(data.sucflag){
                window.location.href="membergroupment.jsp";
            }else {
                formwarning("#alerterror", "分组增加失败");
                return false;
            }
        });
    });

});
findMemberGroupTById=function(){
    var nameA= $.query.get('nameA');
    if(nameA=""){
        return false;
    }
    $.post("findMemberGroupTById.action",{"nameA":nameA},function(data){
        if(data.bean!=null){
            $("#status").val(data.bean.status);
            if("1"==data.bean.nameA){
                $("input[name='nameA']").get(0).checked=true;
            }else{
                $("input[name='nameA']").get(1).checked=true;
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
        finduserroleId();
        return;
    }else{
        return;
    }
});
