//鍟嗗搧璇勮鍒楄〃
$(function() {
    /**
     * 鎼滅储鍟嗗搧
     */
    searchGoodsBygoodsname = function(param) {
        $("#goodsmanagement").flexigrid({
            url : 'searchGoodsBygoodsname.action?goodsname=' + param,
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
                name : '閫夋嫨璇ュ晢鍝佽繘琛岃瘎璁�',
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
            if (com == '閫夋嫨璇ュ晢鍝佽繘琛岃瘎璁�') {
                if ($('.trSelected', grid).length == 1) {
                    var str = "";
                    var name = "";
                    $('.trSelected', grid).each(function() {
                        str = this.id.substr(3);
                    });
                    $(".trSelected td:nth-child(2) div",
                        $('#goodsmanagement')).each(function(i) {
                            name = this.innerHTML;
                        });
                    $("#commentgoods").val(name);
                    $("#hidgoodsid").val(str);
                    return;
                } else {
                    formwarning("#alerterror", "璇烽€夋嫨闇€瑕佽瘎璁虹殑鍟嗗搧");
                    return false;
                }
            }
        }

    },

        findAllGoodsComment = function() {
            $("#goodscommentmanagement").flexigrid({
                url : 'findAllGoodsComment.action',
                dataType : 'json',
                cache : false,
                colModel : [ {
                    display : '琚瘎璁虹殑鍟嗗搧',
                    name : 'goodsname',
                    width : 300,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '鐘舵€�',
                    name : 'state',
                    width : 100,
                    sortable : true,
                    align : 'center'
                }, {
                    display : '鎿嶄綔',
                    name : 'operating',
                    width : 200,
                    sortable : true,
                    align : 'center'
                } ],
                buttons : [ {
                    name : '鏌ョ湅璇ュ晢鍝佹墍鏈夎瘎璁�',
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
                sortname : "posttime",
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
                if (com == '鏌ョ湅璇ュ晢鍝佹墍鏈夎瘎璁�') {
                    if ($('.trSelected', grid).length == 1) {
                        var str = "";
                        var name = "";
                        $('.trSelected', grid).each(function() {
                            str = this.id.substr(3);
                        });
                        $(".trSelected td:nth-child(2) div",
                            $('#goodsmanagement')).each(function(i) {
                                name = this.innerHTML;
                            });
                        window.location.href = "goodscommentlistment.jsp?operate=edit&goodsname="
                        + name + "&goodsid=" + str;
                        return;
                    } else {
                        formwarning("#alerterror", "璇烽€夋嫨涓€鏉′俊鎭�");
                        return false;
                    }
                    return;
                }
            }
        },
        findAllGoodsCommentByGoodsid = function(param) {
            $("#goodscommentlistmanagement")
                .flexigrid(
                {
                    url : 'findAllGoodsCommentListByGoodsId.action?goodsid='
                    + param,
                    dataType : 'json',
                    cache : false,
                    colModel : [ {
                        display : '璇勮鍐呭',
                        name : 'commentcontent',
                        width : 300,
                        sortable : true,
                        align : 'center'
                    }, {
                        display : '璇勮浜�',
                        name : 'replyorcommentusername',
                        width : 150,
                        sortable : true,
                        align : 'center'
                    }, {
                        display : '鍒嗘暟',
                        name : 'score',
                        width : 50,
                        sortable : true,
                        align : 'center'
                    }, {
                        display : '鍥炲鍐呭',
                        name : 'replyorcomment',
                        width : 150,
                        sortable : true,
                        align : 'center'
                    }, {
                        display : '铏氭嫙澧炲姞',
                        name : 'virtualadd',
                        width : 150,
                        sortable : true,
                        align : 'center'
                    }, {
                        display : '鐘舵€�',
                        name : 'state',
                        width : 150,
                        sortable : true,
                        align : 'center'
                    }, {
                        display : '鍙戝竷鏃堕棿',
                        name : 'posttime',
                        width : 180,
                        sortable : true,
                        align : 'center'
                    }, {
                        display : '鎿嶄綔',
                        name : 'operating',
                        width : 200,
                        sortable : true,
                        align : 'center'
                    } ],
                    buttons : [ {
                        name : '澧炲姞璇勮',
                        bclass : 'add',
                        onpress : action
                    }, {
                        name : '缂栬緫',
                        bclass : 'edit',
                        onpress : action
                    }, {
                        name : '瀹℃牳閫氳繃',
                        bclass : 'edit',
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
                    sortname : "posttime",
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
                if (com == "澧炲姞璇勮") {
                    window.location.href = "goodscomment.jsp?operate=add";
                    return;
                } else if (com == '缂栬緫') {
                    if ($('.trSelected', grid).length == 1) {
                        var str = "";
                        var name = "";
                        $('.trSelected', grid).each(function() {
                            str = this.id.substr(3);
                        });
                        window.location.href = "goodscommentdetail.jsp?operate=editdetail&commentid="
                        + str;
                        return;
                    } else {
                        formwarning("#alerterror", "璇烽€夋嫨涓€鏉′俊鎭�");
                        return false;
                    }
                    return;
                } else if (com == '鍒犻櫎') {
                    if ($('.trSelected', grid).length > 0) {
                        var str = "";
                        var name = "";
                        $('.trSelected', grid).each(function() {
                            str = this.id.substr(3)+",";
                        });
                        $.post("delGoodsComment.action",{"commentid":str},function(data){
                            $('#goodscommentlistmanagement').flexReload();
                            forminfo("#alertinfo","鍒犻櫎鍟嗗搧璇勮鎴愬姛");
                        });
                        return;
                    } else {
                        formwarning("#alerterror", "璇烽€夋嫨涓€鏉′俊鎭�");
                        return false;
                    }
                    return;
                }
            }
        }
    /**
     * 鐐瑰嚮鏌ヨ鍟嗗搧
     */
    $("#searchgoods").click(function() {
        var goodsname = $("#goodsname").val();
        if ("" == goodsname) {
            formwarning("#alerterror", "璇疯緭鍏ュ晢鍝佸悕绉板啀鏌ヨ");
            return false;
        }
        searchGoodsBygoodsname(goodsname);
    });
    /**
     * 澧炲姞铏氭嫙璇勮
     */
    savevirtualGoodsComment = function() {
        var goodsid = $("#hidgoodsid").val();
        if ("" == goodsid) {
            formwarning("#alerterror", "璇锋煡璇㈤渶瑕佹坊鍔犺瘎璁虹殑鍟嗗搧");
            return false;
        }
        var goodsname = $("#commentgoods").val();
        var replyorcommentusername = $("#replyorcommentusername").val();
        if ("" == replyorcommentusername) {
            formwarning("#alerterror", "璇峰～鍐欒瘎璁轰汉");
            return false;
        }
        var commentcontent = $("#commentcontent").val();
        if ("" == commentcontent) {
            formwarning("#alerterror", "璇峰～鍐欒瘎璁哄唴瀹�");
            return false;
        }
        var score = $("input[name='score']:checked").val();
        this.value = "鎻愪氦涓�";
        this.disabled = true;
        $
            .post(
            "addvirtualGoodsComment.action",
            {
                "goodsid" : goodsid,
                "goodsname" : goodsname,
                "replyorcommentusername" : replyorcommentusername,
                "commentcontent" : commentcontent,
                "score" : score
            },
            function(data) {

                window.location.href = "goodscommentlistment.jsp?operate=edit&goodsid="
                + goodsid
                + "&goodsname="
                + goodsname;
                return;

            });
    },
    /**
     * 鏍规嵁id鑾峰彇鍟嗗搧璇勮璇︾粏
     */
        findGoodsCommentById = function() {
            var commentid = $.query.get("commentid");
            if (commentid == "") {
                return;
            }
            $.post("findGoodsCommentById.action", {
                "commentid" : commentid
            }, function(data) {

                $("#replyorcommentusername").val(
                    data.bean.replyorcommentusername);
                KE.html("commentcontent", data.bean.commentcontent);
                switch (data.bean.score) {
                    case "1":
                        $("input[name='score']").get(0).checked = true;
                        break;
                    case "2":
                        $("input[name='score']").get(1).checked = true;
                        break;
                    case "3":
                        $("input[name='score']").get(2).checked = true;
                        break;
                    case "4":
                        $("input[name='score']").get(3).checked = true;
                        break;
                    case "5":
                        $("input[name='score']").get(4).checked = true;
                        break;
                    case "6":
                        $("input[name='score']").get(5).checked = true;
                        break;
                    case "7":
                        $("input[name='score']").get(6).checked = true;
                        break;
                    case "8":
                        $("input[name='score']").get(7).checked = true;
                        break;
                    case "9":
                        $("input[name='score']").get(8).checked = true;
                        break;
                    case "10":
                        $("input[name='score']").get(9).checked = true;
                        break;

                }
                $("#hidgoodsid").val(data.bean.goodsid);
                $("#hidgoodsname").val(data.bean.goodsname);
                $("#hidcommentid").val(data.bean.commentid);
                $("#submit").hide();
                $("#update").show();
            });
        },
    /**
     * 鏇存柊璇勮
     */
        updateGoodsComment=function(){
            var commentid=$("#hidcommentid").val();
            var goodsid = $("#hidgoodsid").val();
            var goodsname=$("#hidgoodsname").val();
            var replyorcommentusername = $("#replyorcommentusername").val();
            if ("" == replyorcommentusername) {
                formwarning("#alerterror", "璇峰～鍐欒瘎璁轰汉");
                return false;
            }
            var commentcontent = $("#commentcontent").val();
            if ("" == commentcontent) {
                formwarning("#alerterror", "璇峰～鍐欒瘎璁哄唴瀹�");
                return false;
            }
            var score = $("input[name='score']:checked").val();
            this.value = "鎻愪氦涓�";
            this.disabled = true;
            $.post("updateGoodsComment.action",{
                "replyorcommentusername":replyorcommentusername,
                "commentcontent":commentcontent,
                "score":score,
                "commentid":commentid
            },function(data){
                if(data.sucflag){
                    window.location.href = "goodscommentlistment.jsp?operate=edit&goodsid="
                    + goodsid
                    + "&goodsname="
                    + goodsname;
                    return;
                }
            });
        }


    /**
     * 澧炲姞鍟嗗搧铏氭嫙璇勮
     */
    $("#submit").click(function() {
        savevirtualGoodsComment();
    });
    /**
     * 鏇存柊鍟嗗搧璇勮
     */
    $("#update").click(function(){
        updateGoodsComment();
    });
});
/*
 * ===========================================Gorgeous
 * split-line==============================================
 */
/**
 * main logic
 */
$(function() {
    var operate = $.query.get("operate");
    if (operate == "add") {
        $("#goodstypetnparamsarea").hide();
        return;
    } else if (operate == "edit") {
        var goodsname = $.query.get("goodsname");
        var goodsid = $.query.get("goodsid");
        if (goodsname != "" && goodsid != "") {
            $("#dttitle").text(goodsname + "鐨勬墍鏈夎瘎璁�");
            findAllGoodsCommentByGoodsid(goodsid);
        }
        return;
    } else if (operate == "find") {
        findAllGoodsComment();
    } else if (operate == "editdetail") {
        findGoodsCommentById();
    }
});

/**
 * 鑾峰彇鍟嗗搧璇︾粏鐨勮瘎璁烘暟鎹�
 */
$(function() {
    var goodsid = $.query.get("goodsid");
    if (goodsid == "") {
        return false;
    }
    $.post("getGoodscommentDetails.action", {
        "goodsid" : goodsid
    }, function(data) {
        if (data.sucflag) {
            var temp = "";
            $(".title h5").text(data.beanlist[0].goodsname);
            $.each(data.beanlist,
                function(i, v) {
                    temp += "<h4>" + v.commentcontent + "</h4>";
                    temp += "<ul class='square'>";
                    temp += "<li>" + v.replyorcommentusername + "浜�"
                    + v.posttime + "瀵�" + v.goodsname + "杩涜璇勮</li>";
                    temp += "<li>璇勫垎绛夌骇" + v.score + "</li>";
                    if (v.state == "1") {
                        temp += "<li id='hideview" + v.commentid
                        + "'><input onclick='hidcomment("
                        + v.commentid
                        + ");' type='button' id='hidecomment"
                        + v.commentid + "' name='hidecomment"
                        + v.commentid + "' value='闅愯棌'/></li>";
                    } else {
                        temp += "<li id='showview" + v.commentid
                        + "'><input onclick='showcomment("
                        + v.commentid
                        + ");' type='button' id='showcomment"
                        + v.commentid + "' name='showcomment"
                        + v.commentid + "' value='鏄剧ず'/></li>";
                    }
                    temp += "<input type='hidden' id='hidecommentid'+"
                    + v.commentid + " name='hidecommentid'+"
                    + v.commentid + " value='" + v.commentid
                    + "'/>";
                    temp += "<li><input onclick='openDialog(" + v.commentid
                    + ");' type='button' id='reply" + v.commentid
                    + "' name='reply" + v.commentid
                    + "' value='鍥炲'/></li>";
                    temp += "</ul>";
                });
            $("#detailcomments").html(temp);
        }
    });
});

// 杩欓噷寮€濮嬪啓闅愯棌鍜屾樉绀鸿瘎璁�
function hidcomment(commentid) {
    var state = "0";
    $.post("updateGoodsCommentorReplyByState.action", {
        "state" : state,
        "commentid" : commentid + ","
    }, function(data) {
        $("#hidecomment" + commentid).hide();
        $("#hideview" + commentid).html(
            "<li id='showview" + commentid
            + "'><input onclick='showcomment(" + commentid
            + ");' type='button' id='showcomment" + commentid
            + "' name='showcomment" + commentid
            + "' value='鏄剧ず'/></li>");
    });
}
function showcomment(commentid) {
    var state = "1";
    $.post("updateGoodsCommentorReplyByState.action", {
        "state" : state,
        "commentid" : commentid + ","
    }, function(data) {
        $("#showcomment" + commentid).hide();
        $("#showview" + commentid).html(
            "<li id='hideview" + commentid
            + "'><input onclick='hidcomment(" + commentid
            + ");' type='button' id='hidecomment" + commentid
            + "' name='hidecomment" + commentid
            + "' value='闅愯棌'/></li>");

    });
}