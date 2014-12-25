$(function() {
    $('#submit').click(function () {
        var brandId = $("#brandId").val();
        var brandName = $("#brandName").val();
        var creatorId = $("#creatorId").val();
        var userName = $("#userName").val();
        var intro = $("#intro").val();
        var sort = $("#sort").val();
        var url = $("#url").val();
        });

        this.value = "提交中";
        this.disabled = true;
        $.post("addBrands.action", {
            "brandId": brandIde,
            "brandName":brandName,
            "creatorId":creatorIdt,
            "sort": sort,
            "userName":userName,
            "intro":intro,
            "url":url
        }, function (data) {
            if (data.sucflag) {
                window.location.href = "articlement.jsp";
            } else {
                formwarning("#alerterror", "品牌增加失败");
                return false;
            }
        });
    });

    findBrandsById =function(){
        var brandsId= $.query.get('brandsid');
        if(brandsId==""){
            return false;
        }
        $.post("findBrandsByBrandsId.action",{"brandsId":brandsId},function(data){
            if(data.bean!=null){
                $("#sort").val(data.bean.sort);

            }
        });
    };

    updatBrands=function(){

        var brandId = $("#brandId").val();
        var brandName = $("#brandName").val();
        var creatorId = $("#creatorId").val();
        var userName = $("#userName").val();
        var intro = $("#intro").val();
        var sort = $("#sort").val();
        var url = $("#url").val();

        $.post("updateArticlecategory.action", {
            "brandId": brandIde,
            "brandName":brandName,
            "creatorId":creatorIdt,
            "sort": sort,
            "userName":userName,
            "intro":intro,
            "url":url
        },function(data){
            if (data.sucflag) {
                window.location.href = "articlecategoryment.jsp";
            } else {
                formwarning("#alerterror", "品牌更新失败");
                return false;
            }
        });
    }






$(function(){
    var operate= $.query.get("operate");
    if(operate=="edit"){
        findBrandsById();
        return;
    }else{
        return;
    }
});


