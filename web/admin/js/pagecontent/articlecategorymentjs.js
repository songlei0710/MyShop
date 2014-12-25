/**
 * Created by Administrator on 2014/12/25.
 */
$(function() {
    $('#submit').click(function () {
        var grade = $("#grade").val();
        var metaKeywords = $("#metaKeywords").val();
        var metaDes = $("#metaDes").val();
        var name = $("#name").val();
        var status = $("#status").val();
        var sort = $("#sort").val();
        var parentId = $("#parentId").val();
        var parentName = $("#parentName").val();
        var htmlPath = $("#htmlPath").val();
    });
    this.value = "提交中";
    this.disabled = true;
    $.post("addArticlecategory.action", {
        "grade":grade,
        "metaKeywords":metaKeywords,
        "metaDes":metaDes,
        "sort":sort,
        "parentId":parentId,
        "parentName":parentName,
        "htmlPath":htmlPath
    }, function (data) {
           if (data.sucflag) {
            window.location.href = "articlecategoryment.jsp";
           } else {
            formwarning("#alerterror", "文章设置增加失败");
            return false;
           }
        });
    });
    findArticlecategoryById=function(){
         var articlecategoryId= $.query.get('articlecategoryid');
         if(articlecategoryId==""){
          return false;
          }
    $.post("findArticleByArticlecategoryId.action",{"articlecategoryId":articlecategoryId},function(data){
        if(data.bean!=null){
            $("#grade").val(data.bean.grade);
            $("#sort").val(data.bean.sort);
            $("#parentId").val(data.bean.parentId);
        }
    });
        updateArticlecategory=function(){
            var grade = $("#grade").val();
            var metaKeywords = $("#metaKeywords").val();
            var metaDes = $("#metaDes").val();
            var name = $("#name").val();
            var status = $("#status").val();
            var sort = $("#sort").val();
            var parentId = $("#parentId").val();
            var parentName = $("#parentName").val();
            var htmlPath = $("#htmlPath").val();
        $.post("updateArticlecategory.action", {
            "grade":grade,
            "metaKeywords":metaKeywords,
            "metaDes":metaDes,
            "sort":sort,
            "parentId":parentId,
            "parentName":parentName,
            "htmlPath":htmlPath
        },function(data){
            if (data.sucflag) {
                window.location.href = "articlecategoryment.jsp";
            } else {
                formwarning("#alerterror", "文章设置更新失败");
                return false;
            }
        });
     }
    $("#update").click(function(){
            updateArticlecategory();
        });
 }
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findArticlecategoryById();
        return;
    }else{
        return;
    }
});