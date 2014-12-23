/**
 * Created by SHY on 2014/12/19.
 */
/**
 * flexigrid list
 */
$(function() {
    $().button('loading');
    /**
     * ui
     */
    $('input').iCheck({
        checkboxClass: 'icheckbox_square-blue',
        radioClass: 'iradio_square-blue',
        increaseArea: '20%' // optional
    });

    $("#searchproduct").click(function(){
        var productName=$("#productName").val();
        if(productName==""){
            formwarning("#alerterror", "选择订单商品");
            return false;
        }else{
            findProducts(productName);
        }

    });
    /**
     *
     */
    recaluatemneedquantity=function(){
        //
        var oldneedquantity=$("#needquantity").text()*1;
        $("#needquantity").text(oldneedquantity-1);

    },
    /**
     *
     */
        recaluatememberprice=function(memberprice){
            var oldamount=$("#amount").text()*1.0;
            $("#amount").text(oldamount-memberprice*1.0)
        },
    /**
     *
     */
        recaluateshouldpay=function(memberprice){
            var oldshouldpay=$("#shouldpayspan").text()*1.0;
            $("#shouldpayspan").text(oldshouldpay-memberprice*1.0);
            $("#shouldpay").val(oldshouldpay-memberprice*1.0);
        },


        /*
         * Delete Page elements According to rid
         */
        delParamPChild=function(rid){
            $('#orderinfo'+rid).remove();
        },

    /**
     *
     */
        delParamPChildAndReOrderInfo=function(productSn,memberprice){
            delParamPChild(productSn);
            recaluatemneedquantity();
            recaluatememberprice(memberprice);
            recaluateshouldpay(memberprice);
        }

    /**
     *选择订单商品
     */
    findProducts=function(param){
        $("#productsmanagement").flexigrid({
            url : "findProductByproductName.action?productName="+param,
            dataType : 'json',
            cache : true,
            colModel : [ {
                display : '货号',
                name : 'productSn',
                width : 100,
                sortable : true,
                align : 'center'
            }, {
                display : '货物名称',
                name : 'productName',
                width : 500,
                sortable : true,
                align : 'center'
            }, {
                display : '市场价',
                name : 'price',
                width : 80,
                sortable : true,
                align : 'center'
            }, {
                display : '会员价',
                name : 'memberprice',
                width : 80,
                sortable : true,
                align : 'center'
            }, {
                display : '成本价',
                name : 'cost',
                width : 80,
                sortable : true,
                align : 'center'
            }, {
                display : '销售价',
                name : 'saleprice',
                width : 80,
                sortable : true,
                align : 'center'
            }, {
                display : '预警库存',
                name : 'freezeStore',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '库存',
                name : 'store',
                width : 60,
                sortable : true,
                align : 'center'
            }, {
                display : '重量',
                name : 'weight',
                width : 40,
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
                name : '查询',
                bclass : 'add',
                onpress : action
            }, {
                separator : true
            } ],

            searchitems : [ {
                display : '璇烽€夋嫨鎼滅储鏉′欢',
                name : 'sc',
                isdefault : true
            }],
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
            if (com == '鍔犲叆璁㈠崟') {
                setGoodsToOrderForm(grid);
            }
        }
    },
    /**
     * 订单商品选择
     * @param grid
     * @returns
     */
        setGoodsToOrderForm=function(grid){
            if($('.trSelected',grid).length==1){
                var html="";
                var productId="";
                var productSn="";
                var productName="";
                var memberprice=0.0;
                var store="";
                var needquantity=1;
                $('.trSelected', grid).each(function() {
                    productId = this.id.substr(3);
                });
                $(".trSelected td:nth-child(2) div", $('#productsmanagement')).each(function(i){
                    productSn=this.innerHTML;
                });
                $(".trSelected td:nth-child(3) div", $('#productsmanagement')).each(function(i){
                    productName=this.innerHTML;
                });
                $(".trSelected td:nth-child(4) div", $('#productsmanagement')).each(function(i){
                    memberprice=this.innerHTML;
                });
                $(".trSelected td:nth-child(8) div", $('#productsmanagement')).each(function(i){
                    store=this.innerHTML;
                });
                html+="<tr id='orderinfo"+productSn+"' class='success'><td >"+productSn+"</td><td>"+productName+"</td><td>"+memberprice+"</td><td>1</td><td>"+store+"</td><td><a href='javascript:delParamPChildAndReOrderInfo("+productSn+","+memberprice+");'>鍒犻櫎</a></td></tr>"
                $("#orderinfo").append(html);
                var oldproductid=$("#hidproductid").val();
                $("#hidproductid").val(oldproductid+productId+",");
                var oldneedquantity=$("#needquantity").text()*1;
                if(oldneedquantity==0){
                    $("#needquantity").text(needquantity);
                }else{
                    $("#needquantity").text(oldneedquantity+needquantity);
                }
                var oldamount=$("#amount").text()*1.0;
                if(oldamount==0.0){
                    $("#amount").text(memberprice);
                }else{
                    $("#amount").text(oldamount+memberprice*1);
                }
                var oldshouldpay=$("#shouldpayspan").text()*1.0;
                if(oldshouldpay==0.0){
                    $("#shouldpayspan").text(memberprice);
                }else{
                    $("#shouldpayspan").text(oldshouldpay+memberprice*1);
                }

                //订单名称
                var ordername=$("#ordername").val();
                if(ordername==""){
                    $("#ordername").val(productName);
                }
                //运费
                var freightspan=$("#freightspan").text()*1.0;
                $("#freight").val(freightspan);
                //订单总价
                $("#shouldpay").val(freightspan+$("#shouldpayspan").text()*1.0);


            }else{
                formwarning("#alerterror", "出错了");
                return false;
            }
        },

    /**
     *
     */
        findDeliverAddressBymemberName=function(membername){
            $("#deliveraddressmanagement").flexigrid( {
                url : 'findDeliverAddressBymemberName.action?membername='+membername,
                dataType : 'json',
                cache : false,
                colModel : [{
                    display : '收货人�',
                    name : 'shippingusername',
                    width : 100,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '国家',
                    name : 'country',
                    width : 80,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '省份',
                    name : 'province',
                    width : 80,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '城市',
                    name : 'city',
                    width : 80,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '区/县',
                    name : 'district',
                    width : 80,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '详细地址',
                    name : 'street',
                    width : 150,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '邮政编码',
                    name : 'postcode',
                    width : 80,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '手机号码',
                    name : 'mobile',
                    width : 100,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '固定电话�',
                    name : 'state',
                    width : 100,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '固定电话',
                    name : 'memberid',
                    width : 100,
                    sortable : true,
                    align : 'center'
                },{
                    display : '创建时间',
                    name : 'createtime',
                    width : 100,
                    sortable : true,
                    align : 'center'
                }],
                buttons : [ {
                    separator : true
                } ],
                buttons:[{
                    name:'保存发货地址',
                    bclass:'add',
                    onpress:action
                }],
                searchitems : [ {
                    display : '璇烽€夋嫨鎼滅储鏉′欢',
                    name : 'sc',
                    isdefault : true
                }],
                sortname : "createtime",
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
                checkbox:true
            });
            function action(com,grid){
                if(com=="閫夋嫨杩欎釜鏀惰揣鍦板潃"){
                    if($('.trSelected',grid).length==1){
                        var str="";
                        $('.trSelected',grid).each(function(){
                            str=this.id.substr(3);
                        });
                        $("#hidshippingaddressid").val(str);
                        var str1="";
                        $(".trSelected td:nth-child(11) div", $('#deliveraddressmanagement')).each(function(i){
                            str1=this.innerHTML;
                        });
                        $("#hidmemberid").val(str1);
                        return;
                    }else{
                        formwarning("#alerterror", "璇烽€夋嫨涓€鏉″彂璐у湴鍧€淇℃伅");
                        return false;
                    }

                }
            }
        },



    /**
     * 澧炲姞鏅€氳鍗�
     */
        saveNormalOrder=function(){
            //鑾峰彇璐х墿id瀛楃涓�
            var productid=$("#hidproductid").val();
            productid=productid.substring(0,productid.length-1);
            //妫€鏌ユ槸鍚﹂€夋嫨浜嗗彂璐у湴鍧€
            var hidshippingaddressid=$("#hidshippingaddressid").val();
            if(hidshippingaddressid==""){
                formwarning("#alerterror","璇峰厛鎼滅储骞堕€夋嫨鍙敤鐨勫彂璐у湴鍧€");
                return false;
            }
            //鑾峰彇闅愯棌鐨勪細鍛榠d閫氳繃鎼滅储鍙戣揣鍦板潃鑾峰彇
            var memberid=$("#hidmemberid").val();
            //鑾峰彇鎼滅储鏀惰揣鍦板潃濉啓鐨勪細鍛樺悕绉�
            var membername=$("#membername").val();
            //鑾峰彇閫夋嫨鐨勬敮浠樻柟寮�
            var paymentid=$("input[name='paystate']:checked").val();
            //鑾峰彇鐗╂祦鍟唅d
            var logisticsid=$("input[name='delivermode']:checked").val();
            //鑾峰彇杩愯垂
            var freight=$("#freight").val()*1.0;
            //鑾峰彇鎬婚噾棰�
            var amount=$("#amount").text()*1.0;
            //鑾峰彇鏄惁寮€绁�
            var isinvoice=$("input[name='isinvoice']:checked").val();
            //鑾峰彇璁㈠崟澶囨敞
            var customerordernotes=$("#customerordernotes").val();
            if(customerordernotes==""){
                customerordernotes="";
            }
            //鑾峰彇璁㈠崟绫诲瀷
            var orderTag=$("input[name='orderTag']:checked").val();
            //鑾峰彇搴旀敮浠橀噾棰�
            var shouldpay=$("#shouldpay").val()*1.0;
            //鑾峰彇璁㈠崟鍚嶇О
            var ordername=$("#ordername").val();
            //鑾峰彇鍙戠エ鐩稿叧淇℃伅
            var invPayee=$("#invPayee").val();
            $.post("InitNormalOrderNeedInfoBack.action",{
                "productid":productid,
                "hidshippingaddressid":hidshippingaddressid,
                "memberid":memberid,
                "membername":membername,
                "paymentid":paymentid,
                "logisticsid":logisticsid,
                "freight":freight,
                "amount":amount,
                "isinvoice":isinvoice,
                "customerordernotes":customerordernotes,
                "orderTag":orderTag,
                "shouldpay":shouldpay,
                "ordername":ordername,
                "invPayee":invPayee
            },function(data){
                if(data.sucflag){
                    window.location.href = "normalordersment.jsp?operate=find&folder=orders";
                    return;
                }
            })


        }
    /**
     * 鐐瑰嚮鎻愪氦璁㈠崟
     */
    $("#submitorder").click(function(){
        saveNormalOrder();
    });

    /**
     * 鐐瑰嚮淇敼璁㈠崟鎬讳环
     */
    $("#tomodifyshouldpay").click(function(){
        $("#modifyshouldpay").show();
    });
    /**
     * 鏄剧ず鏄惁纭淇敼璁㈠崟浠锋牸绌洪棿
     */
    $("#confirmtoupdateshouldpay").click(function(){
        $('#myModal').modal('hide');
        //鎶婂～鍐欑殑淇敼璁㈠崟浠锋牸鍐欏叆鍒伴〉闈�
        var mshouldpay=$("#mshouldpay").val();
        $("#shouldpay").val(mshouldpay);
    });
    /**
     * 鐐瑰嚮鎼滅储鍙敤鍙戣揣鍦板潃
     */
    $("#searchdeliveraddress").click(function(){
        var membername=$("#membername").val();
        if(membername==""){
            $("#accountcheckinfo").text("璇疯緭鍏ヨ处鍙�");
            return false;
        }
        findDeliverAddressBymemberName(membername);

    });
    /**
     * 鑾峰彇绯荤粺涓殑鐗╂祦鍟嗕俊鎭～鍏呭埌椤甸潰涓幓
     */
    findAllLogisticsBusinessForbsOrder=function(){
        $.get("findAllLogisticsBusinessForbsOrder.action",function(data){
            if(data.sucflag){
                var html="";
                $.each(data.logisticsbusiness,function(k,v){
                    html+="<input type='radio' id='delivermode' name='delivermode' value='"+v.logisticsid+"' />" +
                    "<label for='radio-1'>"+v.logisticsname+"</label>";
                });
                $("#delivermodearea").html(html);

            }
        });
    },
    /**
     * 鑾峰彇绯荤粺涓殑鏀粯鏀寔淇℃伅濉厖鍒伴〉闈腑鍘�
     */
        findAllPaymentForbsOrder=function(){
            $.get("findAllPaymentForbsOrder.action",function(data){
                if(data.sucflag){
                    var html="";
                    $.each(data.beanlist,function(k,v){
                        html+="<input type='radio' id='paystate' name='paystate' value='"+v.paymentid+"' />" +
                        "<label for='radio-1'>"+v.paymentname+"</label>";
                    });
                    $("#paystatearea").html(html);
                }
            });
        }
    /**
     * 删除发货地址
    $("#savedeliveraddress").click(function(){
        var membername=$("#membername").val();
        if(membername==""){
            formwarning("#alerterror","璇峰～鍐欎竴涓細鍛樺悕绉颁互渚挎柊澧炵殑鏀惰揣鍦板潃鍙互鎴愬姛澧炲姞");
            return false;
        }
        var shippingusername=$("#shippingusername").val();
        if(shippingusername==""){
            formwarning("#alerterror","璇峰～鍐欎竴涓敹璐т汉");
            return false;
        }
        var country=$("#country").val();
        if(country==""){
            formwarning("#alerterror","璇峰～鍐欏浗瀹�");
            return false;
        }
        var province=$("#province").val();
        if(province==""){
            formwarning("#alerterror","璇峰～鍐欑渷浠�");
            return false;
        }
        var city=$("#city").val();
        if(city==""){
            formwarning("#alerterror","璇峰～鍐欏煄甯�");
            return false;
        }
        var district=$("#district").val();
        var street=$("#street").val();
        if(street==""){
            formwarning("#alerterror","璇峰～鍐欒缁嗗湴鍧€");
            return false;
        }
        var postcode=$("#postcode").val();
        var mobile=$("#mobile").val();
        if(mobile==""){
            formwarning("#alerterror","璇峰～鍐欐墜鏈哄彿鐮�");
            return false;
        }
        var telno=$("#telno").val();
        var email=$("#email").val();
        this.value="鎻愪氦涓�";
        $.post("saveDeliverAddressbsOrder.action",{
            "membername":membername,
            "shippingusername":shippingusername,
            "country":country,
            "province":province,
            "city":city,
            "street":street,
            "postcode":postcode,
            "mobile":mobile,
            "telno":telno,
            "email":email,
            "district":district
        },function(data){
            if(data.sucflag){
                $("#deliveraddressmanagement").flexReload();
            }
        });
    });


    /**
     * main logic
     */
    var operate = $.query.get("operate");
    if (operate == "add") {
        findAllLogisticsBusinessForbsOrder();
        findAllPaymentForbsOrder();
    }else if(operate=="edit"){

    }else if(operate=="find"){

    }
});