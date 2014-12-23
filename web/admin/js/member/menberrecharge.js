/**
 * Created by linchunlei on 2014/12/18.
 */
/**李国祥...*/
$(function(){
    $('#submit').click(function(){
        var memberName=$('#memberName').val();
        if(memberName==""){
            formwarning("#alerterror","请填写所选择的会员");
            return false;
        }
        var balance=$('#balance').val();
        var createTime=$('#createTime').val();
        var updateTime=$('#updateTime').val();
        var versionT=$('#versionT').val();
        var sort=$('#sort').val();
        if(sort==""){
            formwarning("# alerterror","请填写排序");
            return false;
        }
        this.value = "提交中";
        this.disabled = true;
        $.post("addMember.action",{
            "memberName":memberName,
            "balance":balance,
            "createTime":createTime,
            "updateTime":updateTime,
            "versionT":versionT,
            "sort":sort
        },function(data){
            if(data.sucflag){
                window.location.href="memberrechargement.jsp";
            }else {
                formwarning("#alerterror", "会员增加失败");
                return false;
            }
        });
    });

});
findMemberRechargeTById=function(){
    var memberName= $.query.get('memberName');
    if(memberName=""){
        return false;
    }
    $.post("findMemberRechargeTById.action",{"memberName":memberName},function(data){
        if(data.bean!=null){
            $("#balance").val(data.bean.balance);
            if("1"==data.bean.memberName){
                $("input[name='memberName']").get(0).checked=true;
            }else{
                $("input[name='memberName']").get(1).checked=true;
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
        findMemberRechargeTById();
        return;
    }else{
        return;
    }
});
