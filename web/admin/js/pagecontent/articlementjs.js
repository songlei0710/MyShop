$(function() {
    $('#submit').click(function () {
        var isOutSite = $("input[name='isOutSite']:checked").val();

        var contentValue = $("#contentValue").val();

        var mainPicture = "";
        $(":checkbox[name='pcpath']").each(function () {
            if ($(this).attr("checked")) {
                mainpicture = this.value;
            }
        });

        this.value = "提交中";
        this.disabled = true;
        $.post("addArticle.action", {
            "brandName": brandName,
            "url": url,
            "sort": sort
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
                if("1"==data.bean.isOutSite){
                    $("input[name='isOutSite']").get(0).checked=true;
                }else{
                    $("input[name='isOutSite']").get(1).checked=true;
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

        var contentValue = $("#contentValue").val();

        var mainPicture = "";
        $(":checkbox[name='pcpath']").each(function () {
            if ($(this).attr("checked")) {
                mainpicture = this.value;
            }
        });
        $.post("updateArticle.action", {
            "brandName": brandName,
            "url": url,
            "sort": sort
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
