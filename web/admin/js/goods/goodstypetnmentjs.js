
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