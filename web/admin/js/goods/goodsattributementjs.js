$(function(){
    var rid="";
    /*
     * To obtain random rid
     */
    getIdforradom=function(){
        var myDate=new Date();
        rid="1"+myDate.getSeconds().toString()+myDate.getMilliseconds().toString();
    },
        /*
         * Delete Page elements According to rid
         */
        delParamPChild=function(rid){
            $('#add'+rid).remove();
        },
        /*
         * Get Goods Type for select elements
         */
        findGoodsTypeTNForSelect=function(){
            $.ajax({
                url:"findGoodsTypeTNForSelect.action",
                type:"post",
                dataType:'json',
                async:false,
                success:function(data){
                    if(data.goodstypetnlist!=""){
                        $('#goodstypetn').append(data.goodstypetnlist);
                    }
                }
            });
        },
    /**
     * 鏍规嵁鍟嗗搧绫诲瀷缁戝畾灞炴€у苟鏄剧ず
     */
        findGoodsAttributeTByGoodsTypeName=function(goodsTypeName){
            //杩欓噷闇€瑕佺粦瀹氬晢鍝佺被鍨嬨€傛湁寰呭晢姒�
            $.ajax({
                url:"findGoodsAttributeTByGoodsTypeName.action",
                type:"post",
                data:{"goodsTypeName":goodsTypeName},
                dataType:'json',
                async:false,
                success:function(data){
                    if(data.beanlist.length>0){
                        var html="";
                        var rid="";
                        $.each(data.beanlist,function(n,value){
                            if(value.attributeType=="1"){
                                rid=value.goodsattributeid;
                                html+="<tr id='add"+rid+"'>" +
                                "<td class='title'><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute' id='paramlistname"+rid+"' name='paramlistname"+rid+"' value='"+value.goodsattributename+"'/></div></div></div></div></td>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><select class='attribute' id='attributetype"+rid+"' name='attributetype"+rid+"'><option value='0'>绛涢€夐」</option></select></div></div></div></div></td>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='medium' id='attributelists"+rid+"' name='attributelists"+rid+"' value='"+value.attributelist+"'></input></div></div></div></div></td>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute small' id='paramlistsort"+rid+"' name='paramlistsort"+rid+"' value='"+value.sort+"'/></div></div></div></div></td>"+
                                "<input type='hidden' class='attribute' id='paramattributeid' name='paramattributeid' value='"+value.goodsattributeid+"'></input>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input  class='attribute btn btn-success' id='delbutton"+rid+"' name='delbutton"+rid+"' type='button' value='鍒犻櫎' onClick='delParamPChild("+rid+")' style='display:'';' /></div></div></div></div></td>"+
                                "</tr>";
                            }else{
                                rid=value.goodsattributeid;
                                html+="<tr id='add"+rid+"'>" +
                                "<td class='title'><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute' id='paramlistname"+rid+"' name='paramlistname"+rid+"' value='"+value.goodsattributename+"'/></div></div></div></div></td>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><select class='attribute' id='attributetype"+rid+"' name='attributetype"+rid+"'><option value='0' selected>绛涢€夐」</option></select></div></div></div></div></td>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute' id='attributelists"+rid+"' name='attributelists"+rid+"' value='"+value.attributelist+"'></input></div></div></div></div></td>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute small' id='paramlistsort"+rid+"' name='paramlistsort"+rid+"' value='"+value.sort+"'/></div></div></div></div></td>"+
                                "<input type='hidden' class='attribute' id='paramattributeid' name='paramattributeid' value='"+value.goodsattributeid+"'></input>"+
                                "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input  class='attribute btn btn-success' id='delbutton"+rid+"' name='delbutton"+rid+"' type='button' value='鍒犻櫎' onClick='delParamPChild("+rid+")' style='display:'';' /></div></div></div></div></td>"+
                                "</tr>";
                            }
                        });
                        var gtid=data.beanlist[0].goodsTypeId;
                        $('#goodstypetn').val(gtid);
                        $('.table tbody').empty().append(html);
                    }
                }
            });
            //鏄剧ず淇敼鎸夐挳
            $('#updateattrs').show();
            //闅愯棌澧炲姞鎸夐挳
            $('#submitattrs').hide();
        },
    /**
     * 閫夋嫨鍟嗗搧绫诲瀷鍚庡姞杞藉凡缁忔湁鐨勫睘鎬�
     */
        $('#goodstypetn').change(function(){
            var goodsTypeName=$('#goodstypetn').find("option:selected").text();
            //杩欓噷闇€瑕佸厛璇诲彇鍟嗗搧绫诲瀷涓嬪凡缁忔湁鐨勫睘鎬у苟娉ㄥ叆鍒伴〉闈腑
            findGoodsAttributeTByGoodsTypeName(goodsTypeName);
        });
    /**
     * 澧炲姞灞炴€у垪琛�
     */
    $('#addattrs').click(function(){
        var goodstypetn=$('#goodstypetn').val();
        if(goodstypetn=="0"){
            formwarning("#alerterror1","璇烽€夋嫨鍟嗗搧绫诲瀷");
            return false;
        }
        getIdforradom();
        var html="<tr id='add"+rid+"'>" +
            "<td class='title'><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute' id='paramlistname"+rid+"' name='paramlistname"+rid+"' type='text'/></div></div></div></div></td>"+
            "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><select class='attribute' id='attributetype"+rid+"' name='attributetype"+rid+"'><option value='0'>绛涢€夐」</option></select></div></div></div></div></td>"+
            "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute' id='attributelists"+rid+"' name='attributelists"+rid+"'  type='text'></input></div></div></div></div></td>"+
            "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input class='attribute small' id='paramlistsort"+rid+"' name='paramlistsort"+rid+"' type='text' /></div></div></div></div></td>"+
            "<td><div class='form'><div class='fields'><div class='field field-first'><div class='typeinput'><input  class='attribute btn btn-success' id='delbutton"+rid+"' name='delbutton"+rid+"' type='button' value='鍒犻櫎' onClick='delParamPChild("+rid+")'/></div></div></div></div></td>"+
            "</tr>";
        $('.table tbody').append(html);
    });


    checkGoodsAttributeForm=function(){
        var check=true;
        var paramlistname="paramlistname";
        var attributelists="attributelists";
        var paramlistsort="paramlistsort";
        var paramattributeid="paramattributeid";
        $(".attribute").each(function(){
            if(this.name.substring(0,13)==paramlistname){
                if(this.value==""){
                    formwarning("#alerterror1","鍟嗗搧灞炴€у悕绉板繀椤诲～鍐�");
                    check=false;
                }else{
                    var str = this.value;
                    var reg = /[\-\[\{\}\]:"]+/;
                    if((result = reg.exec(str)) !=null){
                        formwarning("#alerterror1",'鍟嗗搧灞炴€у悕绉版湁闈炴硶瀛楃"[","]","{","}",":","-"');
                        check=false;
                    }
                }

            }
            if(this.name.substring(0,14)==attributelists){
                if(this.value==""){
                    formwarning("#alerterror1",'鍟嗗搧鍙€夐」蹇呴』濉啓');
                    check=false;
                }else {
                    var str = this.value;
                    var reg = /[\-\[\{\}\]:"]+/;
                    if((result = reg.exec(str)) !=null){
                        formwarning("#alerterror1",'鍟嗗搧灞炴€у悕绉版湁闈炴硶瀛楃"[","]","{","}",":","-"');
                        check=false;
                    }
                }
            }
            if(this.name.substring(0,13)==paramlistsort){
                if(this.value==""){
                    formwarning("#alerterror1",'鍟嗗搧灞炴€ф帓搴忓繀椤诲～鍐�');
                    check=false;
                }else{
                    var str = this.value;
                    var reg = /\D/;
                    if((result = reg.exec(str)) !=null){
                        formwarning("#alerterror1",'鍟嗗搧灞炴€ф帓搴忓彧鑳芥槸鏁板瓧');
                        check=false;
                    }
                }
            }
            if(this.name.substring(0,16)==paramattributeid){
                if(this.value==""){
                    formwarning("#alerterror1",'鍟嗗搧灞炴€D寮傚父');
                    check=false;
                }
            }
        });
        return check;
    },
        getGoodsAttributeT=function(){
            var goodstypetn=$('#goodstypetn').val();
            if(goodstypetn=="0"){
                formwarning("#alerterror1","璇烽€夋嫨鍟嗗搧绫诲瀷");
                return false;
            }
            var goodsTypeId=$('#goodstypetn').val();
            var goodsTypeName=$('#goodstypetn').find("option:selected").text();
            var paramlistname="paramlistname";
            var attributetype="attributetype";
            var attributelists="attributelists";
            var paramlistsort="paramlistsort";
            var paramattributeid="paramattributeid";
            var delbutton="delbutton";
            var goodsattributename="";
            var attributeType="";
            var attributelist="";
            var goodsattributeid="";
            var sort="";
            var attributeIndex=1;
            var sub="";
            var rjson="";
            if(checkGoodsAttributeForm()){
                $(".attribute").each(function(){
                    if(this.name.substring(0,13)==paramlistname){
                        goodsattributename=this.value;
                    }
                    if(this.name.substring(0,13)==attributetype){
                        attributeType=this.value;
                    }
                    if(this.name.substring(0,14)==attributelists){
                        attributelist=this.value;
                    }
                    if(this.name.substring(0,13)==paramlistsort){
                        sort=this.value;
                    }
                    if(this.name.substring(0,16)==paramattributeid){
                        goodsattributeid=this.value;
                    }
                    if(this.name.substring(0,9)==delbutton){
                        sub+="{\"goodsattributename\":\""+goodsattributename+"\",\"attributeType\":\""+attributeType+"\",\"attributelist\":\""+attributelist+"\",\"sort\":\""+sort+"\",\"goodsattributeid\":\""+goodsattributeid+"\"},";
                        goodsattributename="";
                        attributeType="";
                        attributelist="";
                        goodsattributeid="";
                        sort="";
                    }
                });
                rjson="["+sub.toString().substring(0, sub.length-1)+"]";
                $.post("updateGoodsAttributeT.action",{"rjson":rjson,"goodsTypeId":goodsTypeId,"goodsTypeName":goodsTypeName,"attributeIndex":attributeIndex},function(data){
                    if(data.sucflag){
                        sucflag=true;
                        window.location.href="goodsattributement.jsp?operate=find&folder=goods";
                    }else{
                        sucflag=false;
                        this.disabled="";
                    }
                });
            }



        },

    /**
     * 鎻愪氦灞炴€�
     */
        $('#submitattrs').click(function(){
            getGoodsAttributeT();
        });

    $('#updateattrs').click(function(){
        getGoodsAttributeT();
    });

});
/*===========================================Gorgeous split-line==============================================*/
$(function(){
    var operate = $.query.get("operate");
    if (operate == "add") {
        findGoodsTypeTNForSelect();
        return;
    }else if(operate=="edit"){
        findGoodsTypeTNForSelect();
        var goodsTypeName=$.query.get('goodsTypeName');
        if(goodsTypeName==""){
            return false;
        }else{
            findGoodsAttributeTByGoodsTypeName(goodsTypeName);
            return;
        }

    }
});
/*===========================================Gorgeous split-line==============================================*/

/**
 * flexigrid list
 */
$(function() {
    $("#goodsattributenmanagement").flexigrid( {
        url : 'findAllGoodsAttributeT.action',
        dataType : 'json',
        cache : false,
        colModel : [{
            display:'灞炴€у悕绉�',
            name:'goodsattributename',
            width:315,
            sortable:true,
            align:'center'
        },{
            display:'灞炴€х被鍨�',
            name:'attributeType',
            width:115,
            sortable:true,
            align:'center'
        },{
            display:'灞炴€у垪琛�',
            name:'attributelist',
            width:415,
            sortable:true,
            align:'center'
        },{
            display:'鎺掑簭',
            name:'sort',
            width:115,
            sortable:true,
            align:'center'
        },{
            display:'鍟嗗搧绫诲瀷',
            name:'goodsTypeName',
            width:215,
            sortable:true,
            align:'center'
        },{
            display:'妫€绱�',
            name:'issearch',
            width:115,
            sortable:true,
            align:'center'
        },{
            display:'鍏宠仈',
            name:'issametolink',
            width:115,
            sortable:true,
            align:'center'
        },{ display:'鍒涘缓鏃堕棿',
            name:'createtime',
            width:300,
            sortable:true,
            align:'center'
        }, {
            display : '鎿嶄綔',
            name : 'operate',
            width : 100,
            sortable : true,
            align : 'center'
        }],
        buttons : [ {
            name : '娣诲姞',
            bclass : 'add',
            onpress : action
        }, {
            name : '缂栬緫',
            bclass : 'edit',
            onpress : action
        },{
            name:'鍒犻櫎',
            bclass:'del',
            onpress:action
        },{
            name:'鍚敤妫€绱㈡敮鎸�',
            bclass:'edit',
            onpress:action
        },{
            name:'绂佺敤妫€绱㈡敮鎸�',
            bclass:'edit',
            onpress:action
        },{
            name:'鍚敤鍏宠仈鎼滅储',
            bclass:'edit',
            onpress:action
        },{
            name:'绂佺敤鍏宠仈鎼滅储',
            bclass:'edit',
            onpress:action
        },{
            separator : true
        }],
        searchitems : [{
            display:'璇烽€夋嫨鎼滅储鏉′欢',
            name:'sc',
            isdefault : true
        },{
            display:'鍟嗗搧绫诲瀷鍚嶇О',
            name:'goodsTypeName'
        }],
        sortname : "createtime",
        sortorder : "desc",
        usepager : true,
        title : '',
        useRp : true,
        rp : 20,
        rpOptions : [ 5, 20, 40, 100 ],
        showTableToggleBtn : true,
        width :'auto',
        height :'auto',
        pagestat : '鏄剧ず{from}鍒皗to}鏉★紝鍏眥total}鏉¤褰�',
        procmsg : '姝ｅ湪鑾峰彇鏁版嵁锛岃绋嶅€�...',
        checkbox:true
    });
    function action(com, grid) {
        if (com == '娣诲姞') {
            window.location.href="goodsattribute.jsp?operate=add&folder=goods";
            return;
        }else if(com=='缂栬緫'){
            if($('.trSelected',grid).length==1){
                var str="";
                $(".trSelected td:nth-child(6) div", $('#goodsattributenmanagement')).each(function(i){
                    str=this.innerHTML;
                });
                window.location.href="goodsattribute.jsp?operate=edit&folder=goods&goodsTypeName="+str;
                return;
            }else{
                formwarning("#alerterror1", "璇烽€夋嫨涓€鏉′俊鎭�");
                return false;
            }
        }else if(com=='鍒犻櫎'){
            if($('.trSelected',grid).length>0){
                var str="";
                $('.trSelected',grid).each(function(){
                    str+=this.id.substr(3)+",";
                });
                $.post("delGoodsAttributeT.action",{"goodsattributeid":str},function(data){
                    $('#goodsattributenmanagement').flexReload();
                    forminfo("#alertinfo1","鍒犻櫎鍟嗗搧灞炴€ф垚鍔�");
                });
                return;
            }else{
                formwarning("#alerterror1", "璇烽€夋嫨瑕佸垹闄ょ殑淇℃伅");
                return false;
            }
        }else if(com=='鍚敤妫€绱㈡敮鎸�'){
            if($('.trSelected',grid).length>0){
                var str="";
                var issearch="1";
                $('.trSelected',grid).each(function(){
                    str+=this.id.substr(3)+",";
                });
                $.post("updateGoodsAttributeissearchBygoodsattributeid.action",{"goodsattributeid":str,"issearch":issearch},function(data){
                    $('#goodsattributenmanagement').flexReload();
                    forminfo("#alertinfo1","鍚敤妫€绱㈡敮鎸佹垚鍔�");
                });
                return;
            }else{
                formwarning("#alerterror1", "璇烽€夋嫨瑕佸惎鐢ㄦ绱㈡敮鎸佺殑淇℃伅");
                return false;
            }
        }else if(com=='绂佺敤妫€绱㈡敮鎸�'){
            if($('.trSelected',grid).length>0){
                var str="";
                var issearch="0";
                $('.trSelected',grid).each(function(){
                    str+=this.id.substr(3)+",";
                });
                $.post("updateGoodsAttributeissearchBygoodsattributeid.action",{"goodsattributeid":str,"issearch":issearch},function(data){
                    $('#goodsattributenmanagement').flexReload();
                    forminfo("#alertinfo1","绂佺敤妫€绱㈡敮鎸佹垚鍔�");
                });
                return;
            }else{
                formwarning("#alerterror1", "璇烽€夋嫨瑕佺鐢ㄦ绱㈡敮鎸佺殑淇℃伅");
                return false;
            }
        }else if(com=='鍚敤鍏宠仈鎼滅储'){
            if($('.trSelected',grid).length>0){
                var str="";
                var issametolink="1";
                $('.trSelected',grid).each(function(){
                    str+=this.id.substr(3)+",";
                });
                $.post("updateGoodsAttributeissametolinkBygoodsattributeid.action",{"goodsattributeid":str,"issametolink":issametolink},function(data){
                    $('#goodsattributenmanagement').flexReload();
                    forminfo("#alertinfo1","鍚敤鍏宠仈鎼滅储鎴愬姛");
                });
                return;
            }else{
                formwarning("#alerterror1", "璇烽€夋嫨瑕佸惎鐢ㄥ叧鑱旀悳绱㈢殑淇℃伅");
                return false;
            }
        }else if(com=='绂佺敤鍏宠仈鎼滅储'){
            if($('.trSelected',grid).length>0){
                var str="";
                var issametolink="0";
                $('.trSelected',grid).each(function(){
                    str+=this.id.substr(3)+",";
                });
                $.post("updateGoodsAttributeissametolinkBygoodsattributeid.action",{"goodsattributeid":str,"issametolink":issametolink},function(data){
                    $('#goodsattributenmanagement').flexReload();
                    forminfo("#alertinfo1","绂佺敤鍏宠仈鎼滅储鎴愬姛");
                });
                return;
            }else{
                formwarning("#alerterror1", "璇烽€夋嫨瑕佺鐢ㄥ叧鑱旀悳绱㈢殑淇℃伅");
                return false;
            }
        }
    }
});
/*===========================================Gorgeous split-line==============================================*/