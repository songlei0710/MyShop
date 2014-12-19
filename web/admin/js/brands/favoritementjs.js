$(function(){
    $('#submit').click(function(){
        var favoriteId=$('#favoriteId').val();
        if(favoriteId==""){
            formwarning("#alerterror","请填写收藏夹Id");
            return false;
        }
        var addTime=$('#addTime').val();
        var htmlPath=$('#htmlPath').val();
        if(title==""){
            formwarning("#alerterror","请填写标题");
            return false;
        }
        if(tag==""){
            formwarning("#alerterror","请填写标签");
            return false;
        }
        $.post("addFavorite.FavoriteAction",{
            "favoriteId":favoriteId,
            "title":title,
            "tag":tag,
            "addTime":addTime,
            "htmlPath":htmlPath
        },function(data){
            if(data.sucflag){
                window.location.href="favoritement.jsp";
            }
        });
    });

});
/*
 根据地址栏参数判断是添加还是编辑
 */
$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findAllFavoriteByUserid();
        return;
    }else{
        return;
    }
});
