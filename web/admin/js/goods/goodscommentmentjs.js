$(function(){
    $('#submit').click(function(){
        var commentContent=$('#commentContent').val();
      var replyorcommentusername=$('#replyorcommentusername').val();
        if(replyorcommentusername==""){
            formwarning("#alerterror","请填写商品评论");
            return false;
        }
        $.post("addGoodsComment.action",{
            "replyorcommentusername":replyorcommentusername
        },function(data){
            if(data.sucflag){
                window.location.href="goodscomment.jsp";
            }
        });
        this.value = "提交中";
        this.disabled = true;
        $.post("addGoodsComment.action", {
            "replyorcommentusername": replyorcommentusername
        }, function (data) {
            if (data.sucflag) {
                window.location.href = "goodscomment.jsp";
            } else {
                formwarning("#alerterror", "商品评论增加失败");
                return false;
            }
        });
    });
    findGoodsCommentById=function(){
        var commentId= $.query.get('commentId');
        if(commentId==""){
            return false;
        }
        $.post("findArticleByArticleId.action",{"articleId":articleId},function(data){
            if(data.bean!=null){
                $("#replyorcommentusername").val(date.bean.replyorcommentusername);
                KE.html("commentContent",data.bean.commentContent);
            }
        });
    }
    /**
     * 更新文章
     * @returns
     */
    updateGoodsComment=function(){
        var commentContent = $("#commentContent").val();
        var replyorcommentusername = $("#replyorcommentusername").val();
        $.post("updateGoodsComment.action", {
            "replyorcommentusername": replyorcommentusername
        },function(data){
            if (data.sucflag) {
                window.location.href = "goodscomment.jsp";
            } else {
                formwarning("#alerterror", "商品评论更新失败");
                return false;
            }
        });
    }
    $("#update").click(function(){
        updateGoodsComment();
    });
})
/*
 根据地址栏参数判断是添加还是编辑
 */
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findGoodsCommentById();
        return;
    }else{
        return;
    }
});