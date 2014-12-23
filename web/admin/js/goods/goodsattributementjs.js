
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
        var isSearch=$("input[name='isSearch']:checked").val();    //是否支持属性检索
        var isSameToLink=$("input[name='isSameToLink']:checked").val();   //是否开启属性关联
        this.value="提交中";
        this.disable=true;
        $.post("addAttribute.action", {
            "goodSatTributeName": goodSatTributeName,
            "sort":sort
        }, function (data) {
            if (data.sucflag) {
                window.location.href = "goodsattributement.jsp";
            } else {
                formwarning("#alerterror", "商品属性增加失败");
                return false;
            }
        });
    });
    findGoodsAttributeById=function(){
        var goodSatTributeId= $.query.get('goodSatTributeid');
        if(goodSatTributeId==""){
            return false;
        }
        $.post("findGoodsAttributeBygoodSatTributeId.action",{"goodSatTributeId":goodSatTributeId},function(data){
            if(data.bean!=null){
                $("#title").val(data.bean.title);
                if("1"==data.bean.isOutSite){
                    $("input[name='isSearch']").get(0).checked=true;
                }else{
                    $("input[name='isSearch']").get(1).checked=true;
                }
                if("1"==data.bean.isSameToLink){
                    $("input[name='isSameToLink']").get(0).checked=true;
                }else{
                    $("input[name='isSameToLink']").get(1).checked=true;
                }
            }
        });
    };
    /**
     * 更新文章
     * @returns
     */
    updateGoodsAttribute=function(){
        var isSearch = $("input[name='isSearch']:checked").val();
        var isSameToLink = $("input[name='isSameToLink']:checked").val();
        $.post("updateArticle.action", {
            "goodSatTributeName": goodSatTributeName,
            "sort":sort
        },function(data){
            if (data.sucflag) {
                window.location.href = "goodsattributement.jsp";
            } else {
                formwarning("#alerterror", "商品属性更新失败");
                return false;
            }
        });
    }
    $("#update").click(function(){
        updateGoodsAttribute();
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