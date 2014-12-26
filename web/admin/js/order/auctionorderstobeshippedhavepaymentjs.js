$(function(){
    $('#submit').click(function(){
        var goodsname=$('#goodsname').val();
        if(goodsname==""){
            formwarning("#alerterror","请填写订单名称");
            return false;
        }
        var username=$('#username').val();
        if(username==""){
            formwarning("# alerterror","请填写户主名称");
            return false;
        }
        var needquant=$('#needquant').val();
        if(needquant==""){
            formwarning("# alerterror","请填写需要数量");
            return false;
        }
        var price=$('#price').val();
        if(price==""){
            formwarning("# alerterror","请填写价格");
            return false;
        }
        var favorable=$('#favorable').val();
        if(favorable==""){
            formwarning("# alerterror","请填写利润");
            return false;
        }
        var changeprice=$('#changeprice').val();
        if(changeprice==""){
            formwarning("# alerterror","请填写改变价格");
            return false;
        }
        var points=$('#points').val();
        if(points==""){
            formwarning("# alerterror","请填写标记");
            return false;
        }
        var subtotal=$('#subtotal').val();
        if(subtotal==""){
            formwarning("# alerterror","请填写总计");
            return false;
        }
        var addtime=$('#addtime').val();
        if(addtime==""){
            formwarning("# alerterror","请填写添加时间");
            return false;
        }
        var 数量=$('#数量').val();
        if(数量==""){
            formwarning("# alerterror","请填写数量");
            return false;
        }
        var picture=$('#picture').val();
        if(picture==""){
            formwarning("# alerterror","请填加图片");
            return false;
        }
        var usersetnum=$('#usersetnum').val();
        if(usersetnum==""){
            formwarning("# alerterror","请填写支付宝账号");
            return false;
        }
        var weight=$('#weight').val();
        if(weight==""){
            formwarning("# alerterror","请填写重量");
            return false;
        }
        var state=$('#state').val();
        if(state==""){
            formwarning("# alerterror","请填写说明");
            return false;
        }
        var htmlpath=$('#htmlpath').val();
        if(htmlpath==""){
            formwarning("# alerterror","请填写网址");
            return false;
        }
        var orderTag=$('#orderTag').val();
        if(orderTag==""){
            formwarning("# alerterror","请填写附加订单");
            return false;
        }

        var productName=$('#productName').val();
        if(productName==""){
            formwarning("# alerterror","请填写制作者");
            return false;
        }
        var cartTag=$('#cartTag').val();
        if(cartTag==""){
            formwarning("# alerterror","请填写快递");
            return false;
        }

        var membername=$('#membername').val();
        if(membername==""){
            formwarning("# alerterror","请填写购买人");
            return false;
        }

        var storeTag=$('#storeTag').val();
        if(storeTag==""){
            formwarning("# alerterror","请填写库存");
            return false;
        }



        $.post("addlorderr.action",{
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
