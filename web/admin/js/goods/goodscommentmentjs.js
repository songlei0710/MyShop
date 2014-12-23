$(function(){
    $('#submit').click(function(){
      var replyorcommentusername=$('#replyorcommentusername').val();
        if(replyorcommentusername==""){
            formwarning("#alerterror","请填写商品评论");
            return false;
        }
        $.post("addGoodsComment.action",{
            "replyorcommentusername":replyorcommentusername
        },function(data){
            if(data.sucflag){
                window.location.href="goodscommentment.jsp";
            }
        });

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