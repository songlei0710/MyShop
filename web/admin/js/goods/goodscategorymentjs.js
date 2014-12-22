
$(function() {
    /*
     * 鍒犻櫎鍥剧墖鎸夐挳
     */
    $("#delpc").click(function() {
        var str = "";
        var sum = 0;
        $(":checkbox[name='pcpath']").each(function() {
            if ($(this).attr("checked")) {
                sum++;
                str += this.id + ",";
            }
        });
        if (sum == 0) {
            alert('鍙湁鍦ㄩ€夋嫨鍥剧墖鍚庢墠鑳藉垹闄�');
            return false;
        }
        var array = new Array();
        array = str.split(",");
        $(array).each(function(k, v) {
            $("#triggers img").remove("img[id=" + v + "]");
            $("#triggers input[name='pcpath']").remove("input[id=" + v + "]");
        });
    });

    /**
     * 璇诲彇鍟嗗搧涓€绾у垎绫�
     */
    findGoodsCategoryByGradeZeroone=function(){
        $('#addfl').show();
        $('#modfl').hide();
        $.ajax({
            url:"findGoodsCategoryByGradeZeroone.action",
            type:"post",
            dataType:'json',
            async:false,
            success:function(data){
                if (data.sucflag) {
                    var header="<option value='-1'>---璇烽€夋嫨---</option><option value='0'>椤剁骇鍒嗙被</option>";

                    if (data.goodscategoryzero == "") {
                        $('#parentId').append(header);
                        $('#parentId1').hide();
                    } else {
                        $('#parentId').append(header).append(data.goodscategoryzero);
                        $('#parentId1').hide();
                    }

                }
            }
        });
    },
    /**
     * 绾ц仈璇诲彇涓€绾у垎绫荤殑浜岀骇鏍忕洰
     */
        $('#parentId').change(function() {
            var parentId = $('#parentId').val();
            //parentid=0琛ㄧず椤剁骇鍒嗙被锛宲arentid=-1琛ㄧず璇烽€夋嫨锛屼篃灏辨槸褰撻兘涓嶆槸杩欎袱涓潯浠舵椂鎵ц涓€绾ф爮鐩搴旂殑涓嬬骇鏍忕洰鐨勬悳绱�
            if (parentId != "0" && parentId != "-1") {
                $.post("findGoodscategoryByparentId.action",{"parentId":parentId}, function(data) {
                    if (data.sucflag) {
                        $('#parentId1').html(data.goodscategorytwo);
                    }
                });
            }
        });
    /**
     * 鑾峰彇鍟嗗搧绫诲瀷涓嬫媺妗�
     */
    findGoodsTypeTNForSelect=function(){
        $.ajax({
            url:"findGoodsTypeTNForSelect.action",
            type:"post",
            dataType:'json',
            async:false,
            success:function(data){
                if(data.goodstypetnlist!=""){
                    var temp = "<option value='1'>閫氱敤鍟嗗搧绫诲瀷</option>";
                    $('#goodsTypeId').html(data.goodstypetnlist+temp);
                }
            }
        });
    },

    /**
     * 楠岃瘉鍒嗙被閫夋嫨
     */
        $("#parentId").change(function() {
            var parentId = $('#parentId').val();
            var parentId1 = $('#parentId1').val();
            var parentId2 = $('#parentId2').val();
            if (parentId == '0') {
                $('#parentId1').hide();
                $('#parentId2').hide();
            } else {
                $('#parentId1').show();
            }
            if (parentId1 == "-1") {
                $('#parentId2').hide();
            }
        });



    /**
     * 澧炲姞鍟嗗搧鍒嗙被
     */
    $('#submit').click(function() {
        var name = $('#name').val();
        if (name == "") {
            formwarning("#alerterror","璇峰～鍐欏垎绫诲悕绉�");
            return false;
        }
        var parentId = $('#parentId').val();
        var parentName = $('#parentId').find("option:selected").text();
        var parentId1 = $('#parentId1').val();
        var parentName1 = $('#parentId1').find("option:selected").text();
        var grade="";
        if (parentId == "0") {
            grade = "0";
        } else if (parentId != "0" && parentId != "-1" && parentId1 == "-1") {
            grade = "1";

        } else if (parentId != "0" && parentId != "-1" && parentId1 != "-1") {
            grade = "2";
        } else if (parentId == "-1") {
            formwarning("#alerterror","璇烽€夋嫨鍒嗙被");
            return false;
        }
        var goodsTypeId = $('#goodsTypeId').val();
        if (goodsTypeId == "0") {
            formwarning("#alerterror","璇烽€夋嫨鍟嗗搧绫诲瀷");
            return false;
        }
        var sort = $('#sort').val();
        if (sort == "") {
            formwarning("#alerterror","璇峰～鍐欐帓搴�");
            return false;
        }
        var sign = $('#sign').val();
        if (sign == "") {
            formwarning("#alerterror","璇峰～鍐欓潤鎬佸寲鏍囩ず");
            return false;
        }
        var metaKeywords = $('#metaKeywords').val();
        var metaDes = $('#metaDes').val();
        // 鑾穕ogo璺緞闆嗗悎
        var logoPath = "";
        $(":checkbox[name='pcpath']").each(function() {
            if($(this).attr("checked")){
                logoPath=this.value;
            }
        });
        var mobilesync=$("input[name='mobilesync']:checked").val();
        if (grade == "0") {
            $.post("addGoodsCategory.action", {
                "grade" : grade,
                "metaKeywords" : metaKeywords,
                "metaDes" : metaDes,
                "name" : name,
                "sort" : sort,
                "sign" : sign,
                "goodsTypeId" : goodsTypeId,
                "logo":logoPath,
                "mobilesync":mobilesync
            }, function(data) {
                if (data.sucflag) {
                    window.location.href = "goodscategoryment.jsp?operate=find&folder=goods";
                } else {
                    formwarning("#alerterror","鍒嗙被鍚嶇О鎴栬€呮爣绀轰笉鑳藉拰鍏朵粬鍒嗙被鍜屾爣绀洪噸澶�");
                    return false;
                }
            });
        } else if (grade=="1") {
            $.post("addGoodsCategoryTwo.action", {
                "parentName" : parentName,
                "parentId" : parentId,
                "grade" : grade,
                "metaKeywords" : metaKeywords,
                "metaDes" : metaDes,
                "name" : name,
                "sort" : sort,
                "sign" : sign,
                "goodsTypeId" : goodsTypeId,
                "logo":logoPath,
                "mobilesync":mobilesync
            }, function(data) {
                if (data.sucflag) {
                    window.location.href = "goodscategoryment.jsp?operate=find&folder=goods";
                } else {
                    formwarning("#alerterror","鍒嗙被鍚嶇О鎴栬€呮爣绀轰笉鑳藉拰鍏朵粬鍒嗙被鍜屾爣绀洪噸澶�");
                    return false;
                }
            });
        } else if (grade=="2") {
            $.post("addGoodsCategoryThree.action", {
                "parentName1" : parentName1,
                "parentId" : parentId,
                "parentId1" : parentId1,
                "grade" : grade,
                "metaKeywords" : metaKeywords,
                "metaDes" : metaDes,
                "name" : name,
                "sort" : sort,
                "sign" : sign,
                "goodsTypeId" : goodsTypeId,
                "logo":logoPath,
                "mobilesync":mobilesync
            }, function(data) {
                if (data.sucflag) {
                    window.location.href = "goodscategoryment.jsp?operate=find&folder=goods";
                } else {
                    formwarning("#alerterror","鍒嗙被鍚嶇О鎴栬€呮爣绀轰笉鑳藉拰鍏朵粬鍒嗙被鍜屾爣绀洪噸澶�");
                    return false;
                }
            });
        }
    });

    /**
     * 鏍规嵁鍟嗗搧鍒嗙被id鑾峰彇鍒嗙被淇℃伅
     */
    findGoodscategoryBygoodscategoryId=function(){
        var goodsCategoryTid = $.query.get('goodsCategoryTid');
        if (goodsCategoryTid == "") {
            return false;
        }
        $.post("findGoodscategoryBygoodscategoryId.action", {
            "goodsCategoryTid" : goodsCategoryTid
        }, function(data) {
            if (data.bean != null) {
                $('#name').attr("value", data.bean.name);
                var grade=data.bean.grade;
                if(grade=="0"){
                    $('#parentName').attr("value", "椤剁骇鍒嗙被");
                }else{
                    $('#parentName').attr("value", data.bean.parentName);
                }
                $("#hidgrade").val(grade);
                $('#goodsTypeId').val(data.bean.goodsTypeId);
                $('#sign').attr("value", data.bean.sign);
                $('#sort').attr("value", data.bean.sort);
                $('#metaKeywords').attr("value", data.bean.metaKeywords);
                $('#metaDes').attr("value", data.bean.metaDes);
                $('#hidgoodsCategoryTid').attr("value", data.bean.goodsCategoryTid);
                if(data.bean.logo!=""){
                    var htm = "<img id='logo' src='" + data.basepath+data.bean.logo + "'/>";
                    var checkpc = "<input id='logo' name='pcpath' type='checkbox' value='" + data.bean.logo+ "' checked='true' />";
                    $("#triggers").html(htm).append(checkpc);
                }
                if(data.bean.mobilesync=="1"){
                    $("input[name='mobilesync']").get(0).checked=true;
                }else{
                    $("input[name='mobilesync']").get(1).checked=true;
                }

                $('#submit').hide();
                $('#addfl').hide();
                $('#modfl').show();//涓婄骇鍒嗙被鏄剧ず鍖哄煙
                $('#update').show();
            }
        });
    },


    /**
     * 鏇存柊鍟嗗搧鍒嗙被
     */
        $('#update').click(function() {
            var name = $('#name').val();
            if (name == "") {
                formwarning("#alerterror","璇峰～鍐欏垎绫诲悕绉�");
                return false;
            }
            var goodsTypeId = $('#goodsTypeId').val();
            if (goodsTypeId == "0") {
                formwarning("#alerterror","璇烽€夋嫨鍟嗗搧绫诲瀷");
                return false;
            }
            var sort = $('#sort').val();
            var sign = $('#sign').val();
            var metaKeywords = $('#metaKeywords').val();
            var metaDes = $('#metaDes').val();
            var goodsCategoryTid = $('#hidgoodsCategoryTid').val();
            // 鑾穕ogo璺緞闆嗗悎
            var logoPath = "";
            $(":checkbox[name='pcpath']").each(function() {
                if($(this).attr("checked")){
                    logoPath=this.value;
                }
            });
            //杩欓噷闇€瑕侀噸鏂板畾涔�
            var parentId = $('#parentId').val();
            var parentName = $('#parentId').find("option:selected").text();
            var parentId1 = $('#parentId1').val();
            var parentName1 = $('#parentId1').find("option:selected").text();
            var grade=$("#hidgrade").val();
            switch(grade){
                case "0":
                    if (parentId == "0") {
                        grade = "0";

                    } else if (parentId != "0" && parentId != "-1" && parentId1 == "-1") {
                        grade = "1";

                        if(parentId===""||parentId==="-1"){
                            parentName=$("#parentName").val();
                        }

                    } else if (parentId != "0" && parentId != "-1" && parentId1 != "-1") {
                        grade = "2";
                        if(parentId===""||parentId==="-1"){
                            parentName1=$("#parentName").val();
                        }
                    } else if (parentId == "-1") {
                        if(grade==""){
                            formwarning("#alerterror","璇烽€夋嫨鍒嗙被");
                            return false;
                        }
                    }
                    break;
                case "1":
                    if (parentId == "0") {
                        grade = "0";

                    } else if (parentId != "0" && parentId != "-1" && parentId1 == "-1") {
                        grade = "1";

                        if(parentId===""||parentId==="-1"){
                            parentName=$("#parentName").val();
                        }

                    } else if (parentId != "0" && parentId != "-1" && parentId1 != "-1") {
                        grade = "2";
                        if(parentId===""||parentId==="-1"){
                            parentName1=$("#parentName").val();
                        }
                    } else if (parentId == "-1") {
                        if(grade==""){
                            formwarning("#alerterror","璇烽€夋嫨鍒嗙被");
                            return false;
                        }
                        parentName=$("#parentName").val();
                    }
                    break;
                case "2":
                    if (parentId == "0") {
                        grade = "0";

                    } else if (parentId != "0" && parentId != "-1" && parentId1 == "-1") {
                        grade = "1";

                        if(parentId===""||parentId==="-1"){
                            parentName=$("#parentName").val();
                        }

                    } else if (parentId != "0" && parentId != "-1" && parentId1 != "-1") {
                        grade = "2";
                        if(parentId===""||parentId==="-1"){
                            parentName1=$("#parentName").val();
                        }
                    } else if (parentId == "-1") {
                        if(grade==""){
                            formwarning("#alerterror","璇烽€夋嫨鍒嗙被");
                            return false;
                        }
                        parentName1=$("#parentName").val();
                    }
                    break;
            }

            var mobilesync=$("input[name='mobilesync']:checked").val();
            if (grade == "0") {
                $.post("updateGoodsCategory.action", {
                    "goodsCategoryTid":goodsCategoryTid,
                    "grade" : grade,
                    "metaKeywords" : metaKeywords,
                    "metaDes" : metaDes,
                    "name" : name,
                    "sort" : sort,
                    "sign" : sign,
                    "goodsTypeId" : goodsTypeId,
                    "logo":logoPath,
                    "mobilesync":mobilesync
                }, function(data) {
                    if (data.sucflag) {
                        window.location.href = "goodscategoryment.jsp?operate=find&folder=goods";
                    } else {
                        formwarning("#alerterror","鍒嗙被鍚嶇О鎴栬€呮爣绀轰笉鑳藉拰鍏朵粬鍒嗙被鍜屾爣绀洪噸澶�");
                        return false;
                    }
                });
            } else if (grade=="1") {
                $.post("updateGoodsCategoryTwo.action", {
                    "goodsCategoryTid":goodsCategoryTid,
                    "parentName" : parentName,
                    "parentId" : parentId,
                    "grade" : grade,
                    "metaKeywords" : metaKeywords,
                    "metaDes" : metaDes,
                    "name" : name,
                    "sort" : sort,
                    "sign" : sign,
                    "goodsTypeId" : goodsTypeId,
                    "logo":logoPath,
                    "mobilesync":mobilesync
                }, function(data) {
                    if (data.sucflag) {
                        window.location.href = "goodscategoryment.jsp?operate=find&folder=goods";
                    } else {
                        formwarning("#alerterror","鍒嗙被鍚嶇О鎴栬€呮爣绀轰笉鑳藉拰鍏朵粬鍒嗙被鍜屾爣绀洪噸澶�");
                        return false;
                    }
                });
            } else if (grade=="2") {
                $.post("updateGoodsCategoryThree.action", {
                    "goodsCategoryTid":goodsCategoryTid,
                    "parentName1" : parentName1,
                    "parentId" : parentId,
                    "parentId1" : parentId1,
                    "grade" : grade,
                    "metaKeywords" : metaKeywords,
                    "metaDes" : metaDes,
                    "name" : name,
                    "sort" : sort,
                    "sign" : sign,
                    "goodsTypeId" : goodsTypeId,
                    "logo":logoPath,
                    "mobilesync":mobilesync
                }, function(data) {
                    if (data.sucflag) {
                        window.location.href = "goodscategoryment.jsp?operate=find&folder=goods";
                    } else {
                        formwarning("#alerterror","鍒嗙被鍚嶇О鎴栬€呮爣绀轰笉鑳藉拰鍏朵粬鍒嗙被鍜屾爣绀洪噸澶�");
                        return false;
                    }
                });
            }
        });
});

/**
 * main logic
 */
$(function(){
    var operate=$.query.get("operate");
    if(operate=="edit"){
        findGoodsTypeTNForSelect();
        findGoodsCategoryByGradeZeroone();
        findGoodscategoryBygoodscategoryId();

    }else if(operate=="add"){
        findGoodsTypeTNForSelect();
        findGoodsCategoryByGradeZeroone();
        return;
    }
});
/*===========================================Gorgeous split-line==============================================*/

/**
 * flexigrid list
 */
$(function() {
    $("#goodscategorymanagement").flexigrid( {
        url : 'findAllGoodsCategoryT.action',
        dataType : 'json',
        cache : false,
        colModel : [{
            display : '鍒嗙被鍚嶇О',
            name : 'name',
            width : 215,
            sortable : true,
            align : 'center'
        }, {
            display : '涓婄骇鍒嗙被',
            name : 'parentName',
            width : 215,
            sortable : true,
            align : 'center'
        }, {
            display : '鍒嗙被绛夌骇',
            name : 'grade',
            width : 115,
            sortable : true,
            align : 'center'
        }, {
            display : '鏍囩ず',
            name : 'sign',
            width : 215,
            sortable : true,
            align : 'center'
        }, {
            display : '鎺掑簭',
            name : 'sort',
            width : 115,
            sortable : true,
            align : 'center'
        }, {
            display : '鍒涘缓鏃堕棿',
            name : 'createtime',
            width : 214,
            sortable : true,
            align : 'center'

        }, {
            display : '鍒涘缓鑰呯紪鍙�',
            name : 'creatorid',
            width : 200,
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
            name : '娣诲姞',
            bclass : 'add',
            onpress : action
        }, {
            name : '缂栬緫',
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
        }, {
            display : '鍒嗙被鍚嶇О',
            name : 'name',
            isdefault : true
        }, {
            display : '鍒嗙被绛夌骇',
            name : 'grade',
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
        width : 'auto',
        height : 'auto',
        pagestat : '鏄剧ず{from}鍒皗to}鏉★紝鍏眥total}鏉¤褰�',
        procmsg : '姝ｅ湪鑾峰彇鏁版嵁锛岃绋嶅€�...',
        checkbox : true
    });
    function action(com, grid) {
        if (com == '娣诲姞') {
            window.location.href = "goodscategory.jsp?operate=add&folder=goods";
            return;
        } else if (com == '缂栬緫') {
            if ($('.trSelected', grid).length == 1) {
                var str = $('.trSelected', grid)[0].id.substr(3);
                window.location.href = "goodscategory.jsp?operate=edit&folder=goods&goodsCategoryTid=" + str;
                return;
            } else {
                formwarning("#alerterror", "璇烽€夋嫨涓€鏉′俊鎭�");
                return false;
            }
        } else if (com == '鍒犻櫎') {
            if ($('.trSelected', grid).length > 0) {
                var str = "";
                $('.trSelected', grid).each(function() {
                    str += this.id.substr(3) + ",";
                });
                $.post("delGoodscategoryT.action", {
                    "goodsCategoryTid" : str
                }, function(data) {
                    if(data.sucflag){
                        $('#goodscategorymanagement').flexReload();
                    }else{
                        formwarning("#alerterror", "璇蜂笉瑕佸垹闄ら《绾у垎绫�,璇烽€氳繃缂栬緫淇敼鍐呭");
                        $('#goodscategorymanagement').flexReload();
                    }
                });
                return;
            } else {
                formwarning("#alerterror", "璇烽€夋嫨瑕佸垹闄ょ殑淇℃伅");
                return false;
            }

        }

    }

});
/*===========================================Gorgeous split-line==============================================*/

