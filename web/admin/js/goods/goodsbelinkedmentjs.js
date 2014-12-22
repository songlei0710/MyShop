$(function(){
    //鍏ㄥ眬鍏宠仈瀛愬晢鍝乮d
    var belinkedproductid="";
    $("#maintag").val("");
    $("#subtag").val("");
    /**
     * 璇诲彇鍟嗗搧涓€绾у垎绫�
     */
    findGoodsCategoryByGradeZeroone=function(){
        $.ajax({
            url:"findGoodsCategoryByGradeZeroone.action",
            type:"post",
            dataType:'json',
            async:false,
            success:function(data){
                if (data.sucflag) {
                    var header="<option value='-1'>---璇烽€夋嫨---</option>";
                    if (data.goodscategoryzero == "") {
                        $('#navid').append(header);
                        $('#ltypeid').hide();
                        $('#stypeid').hide();
                    } else {
                        $('#navid').append(header).append(data.goodscategoryzero);
                        $('#ltypeid').hide();
                        $('#stypeid').hide();
                    }

                }
            }
        });
    },
    /**
     * 绾ц仈璇诲彇涓€绾у垎绫荤殑浜岀骇鏍忕洰
     */
        $('#navid').change(function() {
            var navid = $('#navid').val();
            //navid=0琛ㄧず椤剁骇鍒嗙被锛宯avid=-1琛ㄧず璇烽€夋嫨锛屼篃灏辨槸褰撻兘涓嶆槸杩欎袱涓潯浠舵椂鎵ц涓€绾ф爮鐩搴旂殑涓嬬骇鏍忕洰鐨勬悳绱�
            //杩欓噷鍐嶈鍙栦簩绾у垎绫诲唴瀹�
            if (navid != "0" && navid != "-1") {
                $.post("findGoodscategoryByparentId.action",{"parentId":navid}, function(data) {
                    if (data.sucflag) {
                        $('#ltypeid').html(data.goodscategorytwo);
                    }
                });
            }
        });
    /**
     * 绾ц仈璇诲彇浜岀骇鍒嗙被瀵瑰簲鐨勪笁绾у垎绫�
     */
    $('#ltypeid').change(function(){
        var ltypeid = $('#ltypeid').val();
        //parentid=0琛ㄧず椤剁骇鍒嗙被锛宲arentid=-1琛ㄧず璇烽€夋嫨锛屼篃灏辨槸褰撻兘涓嶆槸杩欎袱涓潯浠舵椂鎵ц涓€绾ф爮鐩搴旂殑涓嬬骇鏍忕洰鐨勬悳绱�
        //杩欓噷鍐嶈鍙栦笁绾у垎绫诲唴瀹�
        if (ltypeid != "0" && ltypeid != "-1") {
            $.post("findGoodscategoryStypeid.action",{"parentId":ltypeid}, function(data) {
                if (data.sucflag) {
                    $('#stypeid').html(data.stypeidlist).show();

                }
            });
        }
    });


    /**
     * 楠岃瘉鍒嗙被閫夋嫨
     */
    $("#navid").change(function() {
        var navid = $('#navid').val();
        var ltypeid = $('#ltypeid').val();
        var stypeid = $('#stypeid').val();
        if (navid == '-1') {
            $('#ltypeid').hide();
            $('#stypeid').hide();
        } else {
            $('#ltypeid').show();
        }
        if (ltypeid == "-1") {
            $('#stypeid').hide();
        }
    });
    /**
     * 鎼滅储鍟嗗搧
     */
    findAllGoodsByCategory=function(param){
        $("#goodsmanagement").flexigrid({
            url : 'findAllGoodsByCategory.action'+param,
            dataType : 'json',
            cache : false,
            colModel : [ {
                display : '鍟嗗搧鍚嶇О',
                name : 'goodsname',
                width : 400,
                sortable : true,
                align : 'center'
            }, {
                display : '鍟嗗搧缂栧彿',
                name : 'usersetnum',
                width : 150,
                sortable : true,
                align : 'center'
            }, {
                display : '浼氬憳浠�',
                name : 'memberprice',
                width : 120,
                sortable : true,
                align : 'center'
            }, {
                display : '鍒嗙被',
                name : 'sname',
                width : 150,
                sortable : true,
                align : 'center'
            }, {
                display : '涓婃灦',
                name : 'salestate',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '鏂板搧',
                name : 'isNew',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '鐗逛环',
                name : 'bargainprice',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '鐑攢',
                name : 'hotsale',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '鎺ㄨ崘',
                name : 'recommended',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '搴撳瓨',
                name : 'quantity',
                width : 100,
                sortable : true,
                align : 'center'
            }, {
                display : '鎿嶄綔',
                name : 'operating',
                width : 110,
                sortable : true,
                align : 'center'
            } ],
            buttons : [ {
                name : '閫夋嫨涓轰富鍟嗗搧',
                bclass : 'add',
                onpress : action
            },{
                name : '閫夋嫨涓哄瓙鍟嗗搧',
                bclass : 'add',
                onpress : action
            }, {
                separator : true
            } ],

            searchitems : [ {
                display : '璇烽€夋嫨鎼滅储鏉′欢',
                name : 'sc',
                isdefault : true
            }, {
                display : '鍟嗗搧鍚嶇О',
                name : 'goodsname'
            } ],
            sortname : "createtime",
            sortorder : "desc",
            usepager : true,
            title : '',
            useRp : true,
            rp : 20,
            rpOptions : [ 5, 20, 40, 100 ],
            showTableToggleBtn : true,
            showToggleBtn : true,
            width : 'auto',
            height : 'auto',
            pagestat : '鏄剧ず{from}鍒皗to}鏉★紝鍏眥total}鏉¤褰�',
            procmsg : '姝ｅ湪鑾峰彇鏁版嵁锛岃绋嶅€�...',
            checkbox : true
        });
        function action(com, grid) {
            if (com == '閫夋嫨涓轰富鍟嗗搧') {
                setMainProduct(grid);
                return;

            }else if(com=="閫夋嫨涓哄瓙鍟嗗搧"){
                setSubProduct(grid);
                return;
            }

        }
    },
    /**
     * 鍒犻櫎涓诲晢鍝�
     */
        delParamChildMainInfo=function(rid){
            $('#belinkedmaininfo'+rid).remove();
            $("#maintag").val("");
        },
    /**
     * 鍒犻櫎瀛愬晢鍝�
     */
        delParamChildSubInfo=function(rid){
            $('#belinkedsubinfo'+rid).remove();
            $("#subtag").val("");
        },
        delParamPChildAndReBelinkedMainInfo=function(goodsid){
            delParamChildMainInfo(goodsid);
        },
        delParamPChildAndReBelinkedSubInfo=function(goodsid){
            delParamChildSubInfo(goodsid);
        }

    /**
     * 璁剧疆鎴愪富鍟嗗搧璐х墿
     */
    setMainProduct=function(grid){
        if($('.trSelected',grid).length==1){
            var maintag=$("#maintag").val();
            if(maintag!==""){
                formwarning("#alerterror", "鍙兘閫夋嫨涓€涓富鍟嗗搧");
                return false;
            }

            var html="";
            var goodsid="";
            var goodsName="";
            var memberprice=0.0;
            $('.trSelected', grid).each(function() {
                goodsid = this.id.substr(3);
            });
            $(".trSelected td:nth-child(2) div", $('#goodsmanagement')).each(function(i){
                goodsName=this.innerHTML;
            });
            $(".trSelected td:nth-child(4) div", $('#goodsmanagement')).each(function(i){
                memberprice=this.innerHTML;
            });
            html+="<tr id='belinkedmaininfo"+goodsid+"' class='success'><td>"+goodsName+"</td><td>"+memberprice+"</td><td><a href='javascript:delParamPChildAndReBelinkedMainInfo("+goodsid+");'>鍒犻櫎</a></td></tr>"
            $("#belinkedmaininfo").append(html);
            $("#maintag").val(goodsid);
        }else{
            formwarning("#alerterror", "璇烽€夋嫨涓€鏉″晢鍝�");
            return false;
        }
    },
    /**
     * 璁剧疆鎴愬瓙鍟嗗搧璐х墿
     */
        setSubProduct=function(grid){
            if($('.trSelected',grid).length==1){

                var html="";
                var goodsid="";
                var goodsName="";
                var memberprice=0.0;
                $('.trSelected', grid).each(function() {
                    goodsid = this.id.substr(3);
                });
                var subtag=$("#subtag").val();
                if(subtag===goodsid){
                    formwarning("#alerterror", "璇蜂笉瑕侀€夋嫨閲嶅鐨勫瓙鍟嗗搧");
                    return false;
                }
                $(".trSelected td:nth-child(2) div", $('#goodsmanagement')).each(function(i){
                    goodsName=this.innerHTML;
                });
                $(".trSelected td:nth-child(4) div", $('#goodsmanagement')).each(function(i){
                    memberprice=this.innerHTML;
                });
                html+="<tr id='belinkedsubinfo"+goodsid+"' class='success'><td>"+goodsName+"</td><td>"+memberprice+"</td><td><a href='javascript:delParamPChildAndReBelinkedSubInfo("+goodsid+");'>鍒犻櫎</a></td></tr>"

                $("#belinkedsubinfo").append(html);
                $("#subtag").val(goodsid);
                belinkedproductid+=goodsid+",";
            }else{
                formwarning("#alerterror", "璇烽€夋嫨涓€鏉″晢鍝�");
                return false;
            }
        }


    saveOrUpdateGoodsBelinkedT=function(){
        var belinkedproductinfo=belinkedproductid.substring(0,belinkedproductid.length-1);
        $.post("saveOrUpdateGoodsBelinkedT.action",{
            "belinkedproductinfo":belinkedproductinfo
        },function(data){
            if(data.sucflag){
                formwarning("#alertinfo", "澧炲姞鍏宠仈鍟嗗搧鎴愬姛");
                return false;
            }
        })
    }

    /**
     * 澧炲姞鏂板叧鑱斿晢鍝佸晢鍝�
     */
    $("#submit").click(function(){
        saveOrUpdateGoodsBelinkedT();
    }),

    /**
     * 鎼滅储鍟嗗搧
     */
        $("#search").click(function(){
            var navid = $('#navid').val();
            var ltypeid = $('#ltypeid').val();
            var stypeid = $('#stypeid').val();
            if(ltypeid==null){
                ltypeid="-1";
            }
            if(stypeid==null){
                stypeid="-1";
            }
            if("-1"==navid&&"-1"==ltypeid&&"-1"==stypeid){
                formwarning("#alerterror", "璇烽€夋嫨鍟嗗搧鍒嗙被");
                return false;
            }else{

                var param="?navid="+navid+"&ltypeid="+ltypeid+"&stypeid="+stypeid+"&folder=goods";
                findAllGoodsByCategory(param);
            }
        });

    findAllGoodsBelinked=function(){
        $("#goodsbelinkedment").flexigrid({
            url : 'findAllGoodsBelinked.action',
            dataType : 'json',
            cache : false,
            colModel : [ {
                display : '涓诲晢鍝佸悕绉�',
                name : 'goodsname',
                width : 300,
                sortable : true,
                align : 'center'
            }, {
                display : '瀛愬晢鍝佸悕绉�',
                name : 'productName',
                width : 600,
                sortable : true,
                align : 'center'
            }, {
                display : '鍒涘缓鏃堕棿',
                name : 'createtime',
                width : 150,
                sortable : true,
                align : 'center'
            } ],
            buttons : [ {
                name : '澧炲姞鍏宠仈鍟嗗搧',
                bclass : 'add',
                onpress : action
            }, {
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
            } ],
            sortname : "createtime",
            sortorder : "desc",
            usepager : true,
            title : '',
            useRp : true,
            rp : 20,
            rpOptions : [ 5, 20, 40, 100 ],
            showTableToggleBtn : true,
            showToggleBtn : true,
            width : 'auto',
            height : 'auto',
            pagestat : '鏄剧ず{from}鍒皗to}鏉★紝鍏眥total}鏉¤褰�',
            procmsg : '姝ｅ湪鑾峰彇鏁版嵁锛岃绋嶅€�...',
            checkbox : true
        });
        function action(com, grid) {
            if (com == '澧炲姞鍏宠仈鍟嗗搧') {
                window.location.href="goodsbelinkedsale.jsp?operate=add&folder=goods";
                return;
            }else if(com=='鍒犻櫎'){
                if($('.trSelected',grid).length>0){
                    var str="";
                    $('.trSelected',grid).each(function(){
                        str+=this.id.substr(3)+",";
                    });
                    $.post("delGoodsBelinked.action",{"id":str},function(data){
                        $('#goodsbelinkedment').flexReload();
                        forminfo("#alertinfo","鍒犻櫎鎴愬姛");
                    });
                    return;
                }else{
                    formwarning("#alerterror", "璇烽€夋嫨瑕佸垹闄ょ殑淇℃伅");
                    return false;
                }
            }

        }
    }
    /**
     * main logic
     */
    var operate = $.query.get("operate");
    if (operate == "add") {
        findGoodsCategoryByGradeZeroone();
    }else if("find"){
        findAllGoodsBelinked();
    }


});