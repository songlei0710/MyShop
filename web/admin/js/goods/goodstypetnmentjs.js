/**
$(function() {
    $("#goodstypetnbrandmanagement").flexigrid( {
        url : 'findAllGoodsTypeBrand.action',
        dataType : 'json',
        colModel : [ {
            display : '鍟嗗搧鍝佺墝鍚嶇О',
            name : 'brandname',
            width : 215,
            sortable : true,
            align : 'center'
        }, {
            display : '鍟嗗搧绫诲瀷鍚嶇О',
            name : 'name',
            width : 115,
            sortable : true,
            align : 'center'
        } ],
        buttons : [ {
            name : '鍒犻櫎',
            bclass : 'del',
            onpress : action
        }, {
            separator : true
        } ],

        searchitems : [ {
            display : '璇烽€夋嫨鎼滅储鏉′欢',
            name : 'sc',
            isdefault : true
        }],
        sortname : "name",
        sortorder : "desc",
        usepager : true,
        title : '',
        useRp : true,
        rp : 20,
        rpOptions : [ 5, 20, 40, 100 ],
        showTableToggleBtn : true,
        width : 'auto',
        height : 'auto',
        pagestat : '鏄剧ず{from}鍒皗to}鏉★紝鍏眥total}鏉¤褰�',
        procmsg : '姝ｅ湪鑾峰彇鏁版嵁锛岃绋嶅€�...',
        checkbox : true
    });

    function action(com, grid) {
        if (com == '鍒犻櫎') {
            if ($('.trSelected', grid).length > 0) {
                var str = "";
                $('.trSelected', grid).each(function() {
                    str += this.id.substr(3) + ",";
                });
                $.post("DelGoodsTypeBrand.action", {
                    "goodsTypeBrandTid" : str
                }, function(data) {
                    $('#goodstypetnbrandmanagement').flexReload();
                    forminfo("#alertinfo","鍒犻櫎鍝佺墝绫诲瀷鍏崇郴鎴愬姛");
                });
                return;
            } else {
                formwarning("#alerterror", "璇烽€夋嫨瑕佸垹闄ょ殑淇℃伅");
                return false;
            }
        }

    }

});
 */



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