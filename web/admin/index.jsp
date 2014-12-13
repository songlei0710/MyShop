<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <meta name="author" content="hzjxy">
  <title>后台首页</title>
</head>
<body>
  <!-- header 包含头部导航-->
  <%@include file="header.jsp"%>
  <div class="navbar">
    <div class="navbar-innert">
      <a class="brand" href="#"><img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
      <a class="brand" href="#">欢迎登录后台管理系统</a>
    </div>
  </div>
  <div class="container-fluid containerb">
    <div class="row-fluid">
      <div class="span2">
        <a href="#" class="thumbnail">
          <%--<img src="<s:property value="#session.admin.headpath"/>" alt="" class="caption"/>--%>
          <img src="<%=basePath%>upload/9922587.png" alt="" class="caption"/>
        </a>
        <div class="well well-small smallt">
          <h4>
            <%--<s:property value="#session.admin.realname"/>--%>宋磊 ，你好！
          </h4>
          <p>欢迎您再次来到<br />MyShop
          </p>
          <button class="btn btn-block btn-primary" type="button">我的工作</button>
        </div>

        <div class="line-dotted"></div>
        <!-- 引入左侧导航 -->
        <%@include file="left.jsp"%>
      </div>
      <div class="span7">
        <div class="row-fluid">
          <ul class="thumbnails">
            <li class="span2">
              <a href="<%=basePath%>admin/goods/goods.jsp?operate=add" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-edit.png" alt="" class="caption">
                <h4>添加商品</h4></a></li>
            <li class="span2">
              <a href="<%=basePath%>admin/pagecontent/articlement.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-article.png" alt="" class="caption">
              <h4>文章管理</h4> </a></li>
            <li class="span2"><a href="<%=basePath%>admin/goods/goodscategoryment.jsp?operate=find" class="thumbnail">
              <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-category.png" alt="" class="caption">
              <h4>分类管理</h4> </a></li>
            <li class="span2"><a href="<%=basePath%>admin/order/normalordersment.jsp?operate=find" class="thumbnail">
              <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-stats.png" alt="" class="caption">
              <h4>订单管理</h4> </a></li>
            <li class="span2"><a href="<%=basePath%>admin/member/membergroupment.jsp?operate=find" class="thumbnail">
              <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-user.png" alt="" class="caption">
              <h4>分组管理</h4> </a></li>
            <li class="span2"><a href="<%=basePath%>admin/setting/basicinfoment.jsp?operate=find" class="thumbnail">
              <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-config.png" alt="" class="caption">
              <h4>基本设置</h4> </a></li>
          </ul>
        </div>
        <!-- 新的模块页面 -->
        <style type="text/css">
          .home,#Profile,#Messages{
            margin-left: 0;
          }
          .home .span2{
            margin-top:1.388%;
            text-align: center;
          }
          .tab-content{
            margin-bottom: 3.6%;
          }
        </style>
        <!-- tag -->
        <ul id="mytab" class="nav nav-tabs">
          <li class="active"><a href="#Home" data-toggle="tab">商品管理</a></li>
        </ul>
        <!-- /tag -->
        <div  class="tab-content">
          <div class="tab-pane fade in active home">
            <li class="span2">
              <a href="<%=basePath%>admin/goods/goodstypetnment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-banner.png"	alt="" class="caption">
                <h4>商品类型</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/goods/goodsattributement.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-banner-categories.png"	alt="" class="caption">
                <h4>商品属性</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/brands/brandsment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-banner-client.png"	alt="" class="caption">
                <h4>品牌设置</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/goods/goodstypetnbrandsment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-banner-tracks.png"	alt="" class="caption">
                <h4>品牌类型</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/products/productspecificationment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-media.png"	alt="" class="caption">
                <h4>商品规格</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/goods/goodscommentment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-levels.png"	alt="" class="caption">
                <h4>商品评论</h4></a>
            </li>
          </div>
        </div>
        <!-- tag -->
        <ul id="mytab" class="nav nav-tabs">
          <li class="active"><a href="#Home" data-toggle="tab">订单管理</a></li>
        </ul>
        <!-- /tag -->
        <div  class="tab-content">
          <div class="tab-pane fade in active home">
            <li class="span2">
              <a href="<%=basePath%>admin/order/normalorderstobeshippedunpayment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-stats.png"	alt="" class="caption">
                <h4>货到付款</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/order/normalorderstobeshippedhavepayment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-stats.png"	alt="" class="caption">
                <h4>需发货</h4></a>
            </li>
          </div>
        </div>
        <!-- tag -->
        <ul id="mytab" class="nav nav-tabs">
          <li class="active"><a href="#Home" data-toggle="tab">会员管理</a></li>
        </ul>
        <!-- /tag -->
        <div  class="tab-content">
          <div class="tab-pane fade in active home">
            <li class="span2">
              <a href="<%=basePath%>admin/member/member.jsp?operate=add" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-user-add.png"	alt="" class="caption">
                <h4>添加会员</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/member/membergroup.jsp?operate=add" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-groups-add.png"	alt="" class="caption">
                <h4>添加会员分组</h4></a>
            </li>
          </div>
        </div>
        <!-- tag -->
        <ul id="mytab" class="nav nav-tabs">
          <li class="active"><a href="#Home" data-toggle="tab">内容管理</a></li>
        </ul>
        <!-- /tag -->
        <div  class="tab-content">
          <div class="tab-pane fade in active home">
            <li class="span2">
              <a href="<%=basePath%>admin/pagecontent/sitenavigationment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-links-cat.png"	alt="" class="caption">
                <h4>导航设置</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/pagecontent/article.jsp?operate=add" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-article-add.png"	alt="" class="caption">
                <h4>添加文章</h4></a>
            </li>
            <li class="span2">
              <a href="<%=basePath%>admin/pagecontent/articlecategoryment.jsp?operate=find" class="thumbnail">
                <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-article-edit.png"	alt="" class="caption">
                <h4>文章分类</h4></a>
            </li>
          </div>
        </div>
      </div>
      <div class="span3">
        <h4>最新需发货订单</h4>
        <ul class="nav nav-list bs-docs-sidenavh">
           <%-- <s:iterator id="bean" value="#session.newestorders" status="newestorders">
            <li><a href="InitOrdersDetail.action?orderid=<s:property value="orderid"/>">
            <s:date name="createtime" format="yyyy-MM-dd hh:mm:ss"/>
            <s:property value="ordername"/></a></li>
          </s:iterator>  --%>
             <li><a href="InitOrdersDetail.action?orderid=1">2014-12-11 10:10:10 iphone6</a></li>
             <li><a href="InitOrdersDetail.action?orderid=2">2014-12-10 10:10:10 小米4</a></li>
        </ul>
        <div class="line-dotted"></div>
      </div>
    </div>
  </div>
  <!-- footer -->
  <%@include file="footer.jsp"%>
</body>
</html>
