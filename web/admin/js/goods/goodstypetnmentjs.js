


$(function(){
    $('#submit').click(function(){
      var name=$('#name').val();
        if(name==""){
            formwarning("#alerterror","请填写商品类型名称");
            return false;
        }
        $.post("addGoodsType.action",{
            "name":name
        },function(data){
            if(data.sucflag){
                window.location.href="goodstypetnment.jsp";
            }
        });
        this.value = "提交中";
        this.disabled = true;
    });
    findGoodsTypetnById=function(){
        var goodsTypeId= $.query.get('goodsTypeId');
        if(goodsTypeId==""){
            return false;
        }
        $.post("findGoodsTypeBygoodsTypeId.action",{"goodsTypeId":goodsTypeId},function(data){
            if(data.bean!=null){
                $("#name").val(date.bean.name);
            }
        });
    }
    /**
     * 更新文章
     * @returns
     */
    updateGoodsTypeTN=function(){
        var name = $("#name").val();
        $.post("GoodsType.action", {
            "name": name
        },function(data){
            if (data.sucflag) {
                window.location.href = "goodstypetn.jsp";
            } else {
                formwarning("#alerterror", "商品类型及参数更新失败");
                return false;
            }
        });
    }
    $("#update").click(function(){
        updateGoodsTypeTN();
    });
})
/*
 根据地址栏参数判断是添加还是编辑
 */
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findGoodsTypetnById();
        return;
    }else{
        return;
    }
});