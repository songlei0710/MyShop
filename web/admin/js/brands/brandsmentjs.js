$(function(){
    $('#submit').click(function(){
        var brandName=$('#brandName').val();
        if(brandName==""){
            formwarning("#alerterror","请填写品牌名称");
            return false;
        }
        var url=$('#url').val();
        var sort=$('#sort').val();
        if(sort==""){
            formwarning("#alerterror","请填写排序");
            return false;
        }
        $.post("addBrand.action",{
            "brandName":brandName,
            "url":url,
            "sort":sort
        },function(data){
            if(data.sucflag){
                window.location.href="brandsment.jsp";
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
        findBrandById();
        return;
    }else{
        return;
    }
});
