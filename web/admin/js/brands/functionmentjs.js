$(function(){
    $('#submit').click(function(){
        var Id=$('#Id').val();
        if(Id==""){
            formwarning("#alerterror","请填写功能系统模块");
            return false;
        }
        var visitUrl=$('#visitUrl').val();
        var visitMethodName=$('#visitMethodName').val();
        var moduleId=$('#moduleId').val();
        if(functionName==""){
            formwarning("#alerterror","请填写功能名称");
            return false;
        }
        $.post("addFavorite.FavoriteAction",{
            "Id":Id,
            "visitUrl":visitUrl,
            "visitMethodName":visitMethodName,
            "moduleId":moduleId,
            "functionName":functionName
        },function(data){
            if(data.sucflag){
                window.location.href="functionment.jsp";
            }
        });
    });

});
/*
 根据地址栏参数判断是添加还是编辑
 */
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findFunctionMById;
        return;
    }else{
        return;
    }
});
