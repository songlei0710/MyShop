<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品分类列表</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<!--header 包含头部导航-->
<%@include file="/admin/header.jsp"%>
<!-- end header -->
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">商品分类设置</a>
    <a class="brand2">所有商品分类列表</a>
  </div>
</div>
<div class="container-fluid containerb">
  <div class="row-fluid">
    <div class="span2">
      <!-- 引入左侧导航 -->
      <%@include file="/admin/left.jsp"%>
    </div>
      <!--开始显示商品属性form表单 -->
      <form id="goodscategorymentform">
        <div id="mainlogic" class="span10">
          <div class="alert alert-success">
            <button type="button" class="close" data-dismiss="alert">×</button>
            <strong>说明</strong> 请根据需要定义商品的分类
          </div>
          <div id="alerterror" style="display: none;" class="alert alert-error">
            <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
          </div>
          <div id="alertinfo" style="display: none;" class="alert alert-info">
            <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
          </div>
          <div class="line-dotted"></div>
          <div class="btn-group">
            <button id="btnback" type="button" class="btn btn-success">返回</button>
          </div>
        </div>
</form>

  </div>

</div>
<script type="text/javascript" src="<%=basePath%> admin/js/goods/goodscategorymentjs.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>
