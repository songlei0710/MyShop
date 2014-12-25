$(function() {
    $('#submit').click(function () {
        var isOutSite = $("input[name='isOutSite']:checked").val();
        var isPublication = $("input[name='isPublication']:checked").val();
        var isRecommend = $("input[name='isRecommend']:checked").val();
        var isTop = $("input[name='isTop']:checked").val();
        var isNotice = $("input[name='isNotice']:checked").val();

        var contentValue = $("#contentValue").val();
        var title = $("#title").val();
        var tipContent = $("#tipContent").val();
        var sort = $("#sort").val();
        var metaKeywords = $("#metaKeywords").val();
        var metaDes = $("#metaDes").val();
        var status = $("#status").val();
        var author = $("#author").val();
        var readCount = $("#readCount").val();
        var htmlPath = $("#htmlPath").val();
        var updateTime = $("#updateTime").val();
        var sName = $("#sName").val();
        var fName = $("#fName").val();
        var fTypeId = $("#fTypeId").val();
        var sTypeId = $("#sTypeId").val();
        var outSiteLink = $("#outSiteLink").val();
        var mainPicture = "";
        $(":checkbox[name='pcpath']").each(function () {
            if ($(this).attr("checked")) {
                mainpicture = this.value;
            }
        });

        this.value = "提交中";
        this.disabled = true;
        $.post("addArticle.action", {
            "articleName": articleName,
            "title":title,
            "tipContent":tipContent,
            "sort": sort,
            "metaKeywords":metaKeywords,
            "metaDes":metaDes,
            "status":status,
            "author":author,
            "readCount":readCount,
            "htmlPath":htmlPath,
            "updateTime":updateTime,
            "sName":sName,
            "fName":fName,
            "fTypeId":fTypeId,
            "sTypeId":sTypeId,
            "outSiteLink":outSiteLink
        }, function (data) {
            if (data.sucflag) {
                window.location.href = "articlement.jsp";
            } else {
                formwarning("#alerterror", "文章增加失败");
                return false;
            }
        });
    });

    findArticleById=function(){
        var articleId= $.query.get('articleid');
        if(articleId==""){
            return false;
        }
        $.post("findArticleByArticleId.action",{"articleId":articleId},function(data){
            if(data.bean!=null){
                $("#title").val(data.bean.title);
                $("#sort").val(data.bean.sort);
                if("1"==data.bean.isOutSite){
                    $("input[name='isOutSite']").get(0).checked=true;
                }else{
                    $("input[name='isOutSite']").get(1).checked=true;
                }
                if("1"==data.bean.isPublication){
                    $("input[name='isPublication']").get(0).checked=true;
                }else{
                    $("input[name='isPublication']").get(1).checked=true;
                }
                if("1"==data.bean.isRecommend){
                    $("input[name='isRecommend']").get(0).checked=true;
                }else{
                    $("input[name='isPublication']").get(1).checked=true;
                }
                if("1"==data.bean.isTop){
                    $("input[name='isTop']").get(0).checked=true;
                }else{
                    $("input[name='isTop']").get(1).checked=true;
                }
                if("1"==data.bean.isNotice){
                    $("input[name='isNotice']").get(0).checked=true;
                }else{
                    $("input[name='isNotice']").get(1).checked=true;
                }
                KE.html("contentValue",data.bean.contentValue);
                if(data.bean.mainPicture!=""){
                    var htm= "<img id='logo' src='" + data.basePath+data.bean.mainPicture + "'/>";
                    var checkpc="<input id='logo' name='pcpath' type='checkbox' value='" + data.bean.mainPicture+ "' checked='true' />";
                    $("#triggers").html(htm).append(checkpc);
                }
            }
        });
    };
    /**
     * 更新文章
     * @returns
     */
    updateArticle=function(){
        var isOutSite = $("input[name='isOutSite']:checked").val();
        var isPublication = $("input[name='isPublication']:checked").val();
        var isRecommend = $("input[name='isRecommend']:checked").val();
        var isTop = $("input[name='isTop']:checked").val();
        var isNotice = $("input[name='isNotice']:checked").val();

        var contentValue = $("#contentValue").val();
        var title = $("#title").val();
        var tipContent = $("#tipContent").val();
        var sort = $("#sort").val();
        var metaKeywords = $("#metaKeywords").val();
        var status = $("#status").val();
        var author = $("#author").val();
        var readCount = $("#readCount").val();
        var htmlPath = $("#htmlPath").val();
        var updateTime = $("#updateTime").val();
        var sName = $("#sName").val();
        var fName = $("#fName").val();
        var fTypeId = $("#fTypeId").val();
        var sTypeId = $("#sTypeId").val();
        var outSiteLink = $("#outSiteLink").val();

        var mainPicture = "";
        $(":checkbox[name='pcpath']").each(function () {
            if ($(this).attr("checked")) {
                mainpicture = this.value;
            }
        });
        $.post("updateArticle.action", {
            "articleName": articleName,
            "title":title,
            "tipContent":tipContent,
            "sort": sort,
            "metaKeywords":metaKeywords,
            "metaDes":metaDes,
            "status":status,
            "author":author,
            "readCount":readCount,
            "htmlPath":htmlPath,
            "updateTime":updateTime,
            "tipContent":tipContent,
            "sName":sName,
            "fName":fName,
            "fTypeId":fTypeId,
            "sTypeId":sTypeId,
            "outSiteLink":outSiteLink
        },function(data){
            if (data.sucflag) {
                window.location.href = "articlement.jsp";
            } else {
                formwarning("#alerterror", "文章更新失败");
                return false;
            }
        });
    }


    $("#update").click(function(){
        updateArticle();
    });
});

/*
 根据地址栏参数判断是添加还是编辑
 */
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findArticleById();
        return;
    }else{
        return;
    }
});
