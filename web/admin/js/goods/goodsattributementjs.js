
$(function(){
    $('#submit').click(function(){
        var goodSatTributeName=$('#goodSatTributeName').val();
        if(goodSatTributeName==""){
            formwarning("#alerterror","请填写商品属性名称");
            return false;
        }

        var sort=$('#sort').val();
        if(sort==""){
            formwarning("# alerterror","请填写排序");
            return false;
        }
        $.post("GoodsAttribute.action",{
            "goodSatTributeName":goodSatTributeName,
            "sort":sort
        },function(data){
            if(data.sucflag){
                window.location.href="goodsattributement.jsp";
            }
        });
    });
})
/*
 根据地址栏参数判断是添加还是编辑
 */
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findGoodsAttributeById();
        return;
    }else{
        return;
    }
});