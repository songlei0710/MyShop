$(function(){
    var belinkedproductid="";
    $("#maintag").val("");
    $("#subtag").val("");
    /**
     * 根据GradeZeroone获取商品分类列表
     */
    findGoodsCategoryByGradeZeroone=function(){
        $.ajax({
            url:"findGoodsCategoryByGradeZeroone.action",
            type:"post",
            dataType:'json',
            async:false,
            success:function(data){
                if (data.sucflag) {
                    var header="<option value='-1'>---请选择---</option>";
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
     * 级联读取一级分类的二级栏目
     */
        $('#navid').change(function() {
            var navid = $('#navid').val();
            //navid=0表示顶级分类，navid=-1表示请选择，也就是当都不是这两个条件时执行一级栏目对应的下级栏目的搜索
            //这里再读取二级分类内容
            if (navid != "0" && navid != "-1") {
                $.post("findGoodscategoryByparentId.action",{"parentId":navid}, function(data) {
                    if (data.sucflag) {
                        $('#ltypeid').html(data.goodscategorytwo);
                    }
                });
            }
        });
    /**
     * 级联读取二级分类对应的三级分类
     */
    $('#ltypeid').change(function(){
        var ltypeid = $('#ltypeid').val();
        //parentid=0表示顶级分类，parentid=-1表示请选择，也就是当都不是这两个条件时执行一级栏目对应的下级栏目的搜索
        //这里再读取三级分类内容
        if (ltypeid != "0" && ltypeid != "-1") {
            $.post("findGoodscategoryStypeid.action",{"parentId":ltypeid}, function(data) {
                if (data.sucflag) {
                    $('#stypeid').html(data.stypeidlist).show();

                }
            });
        }
    });


    /**
     *  验证分类选择
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
     * 获取所有商品分类列表
     */
    findAllGoodsByCategory=function(param){
        $("#goodsmanagement").flexigrid({
            url : 'findAllGoodsByCategory.action'+param,
            dataType : 'json',
            cache : false,
            colModel : [ {
                display : '商品名称',
                name : 'goodsname',
                width : 400,
                sortable : true,
                align : 'center'
            }, {
                display : '商品编号',
                name : 'usersetnum',
                width : 150,
                sortable : true,
                align : 'center'
            }, {
                display : '会员价',
                name : 'memberprice',
                width : 120,
                sortable : true,
                align : 'center'
            }, {
                display : '分类',
                name : 'sname',
                width : 150,
                sortable : true,
                align : 'center'
            }, {
                display : '上架',
                name : 'salestate',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '新品',
                name : 'isNew',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '特价',
                name : 'bargainprice',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '热销',
                name : 'hotsale',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '推荐',
                name : 'recommended',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '库存',
                name : 'quantity',
                width : 100,
                sortable : true,
                align : 'center'
            }, {
                display : '操作',
                name : 'operating',
                width : 110,
                sortable : true,
                align : 'center'
            } ],
            buttons : [ {
                name : '标记移动平台',
                bclass : 'add',
                onpress : action
            },{
                name : '重置标记',
                bclass : 'add',
                onpress : action
            }, {
                separator : true
            } ],

            searchitems : [ {
                display : '请选择搜索条件',
                name : 'sc',
                isdefault : true
            }, {
                display : '商品名称',
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
            pagestat : '显示{from}到{to}条，共{total}条记录',
            procmsg : '正在获取数据，请稍候...',
            checkbox : true
        });
        function action(com, grid) {
            if (com == '添加商品') {
                setMainProduct(grid);
                return;

            }else if(com=="添加货物"){
                setSubProduct(grid);
                return;
            }

        }
    },
    /**
     * 删除参数ChildMainInfo
     */
        delParamChildMainInfo=function(rid){
            $('#belinkedmaininfo'+rid).remove();
            $("#maintag").val("");
        },
    /**
     * 删除参数ChildSubInfo
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
     * 设置MainProduct
     */
    setMainProduct=function(grid){
        if($('.trSelected',grid).length==1){
            var maintag=$("#maintag").val();
            if(maintag!==""){
                formwarning("#alerterror", "请选择需要添加货物的商品");
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
            formwarning("#alerterror", "请选择需要添加货物的商品");
            return false;
        }
    },
    /**
     * 编辑SubProduct
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
                    formwarning("#alerterror", "请选择需要编辑货物的商品");
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
                formwarning("#alerterror", "更改商品成功");
                return false;
            }
        }


    saveOrUpdateGoodsBelinkedT=function(){
        var belinkedproductinfo=belinkedproductid.substring(0,belinkedproductid.length-1);
        $.post("saveOrUpdateGoodsBelinkedT.action",{
            "belinkedproductinfo":belinkedproductinfo
        },function(data){
            if(data.sucflag){
                formwarning("#alertinfo", "请选择顶级商品分类");
                return false;
            }
        })
    }

    /**
     * 保存或更改关联销售商品信息
     */
    $("#submit").click(function(){
        saveOrUpdateGoodsBelinkedT();
    }),

    /**
     * 搜索
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
                formwarning("#alerterror", "请选择需要添加货物的商品");
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
                display : '商品名称',
                name : 'goodsname',
                width : 300,
                sortable : true,
                align : 'center'
            }, {
                display : '产品名称',
                name : 'productName',
                width : 600,
                sortable : true,
                align : 'center'
            }, {
                display : '创建时间',
                name : 'createtime',
                width : 150,
                sortable : true,
                align : 'center'
            } ],
            buttons : [ {
                name : '重置标记',
                bclass : 'add',
                onpress : action
            }, {
                name : '删除',
                bclass : 'del',
                onpress : action
            }, {
                separator : true
            } ],

            searchitems : [ {
                display : '请选择搜索条件',
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
            pagestat : '显示{from}到{to}条，共{total}条记录',
            procmsg : '正在获取数据，请稍候...',
            checkbox : true
        });
        function action(com, grid) {
            if (com == '添加商品') {
                window.location.href="goodsbelinkedsale.jsp?operate=add&folder=goods";
                return;
            }else if(com=='添加货物'){
                if($('.trSelected',grid).length>0){
                    var str="";
                    $('.trSelected',grid).each(function(){
                        str+=this.id.substr(3)+",";
                    });
                    $.post("delGoodsBelinked.action",{"id":str},function(data){
                        $('#goodsbelinkedment').flexReload();
                        forminfo("#alertinfo","添加商品成功");
                    });
                    return;
                }else{
                    formwarning("#alerterror", "请选择需要添加货物的商品");
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