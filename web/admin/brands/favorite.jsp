<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/18
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>收藏夹管理</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">收藏夹设置 </a>
    <a class="brand2">编辑收藏夹 </a>
  </div>
</div>
<div class="container-fluid containerb">
  <div class="row-fluid">
    <div class="span2">
      <!-- 引入左侧导航 -->
      <%@include file="/admin/left.jsp"%>
    </div>
    <div id="mainlogic" class="span10">
      <div class="alert alert-success">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>说明</strong> 请根据需要编辑收藏夹
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
      <!-- 开始显示商品类型form表单 -->
      <form id="brandsform">
        <div class="form-actions">
          <div class="form-inline">
            <span class="label label-required">收藏夹编号: </span>
            <input id="favoriteId" name="favoriteId" type="text" class="small" required />
            <span class="label label-info">标题：</span>
            <input id="title" name="title" type="text" class="small" required />
            <span class="label label-info">标签：</span>
            <input id="tag" name="tag" type="text" class="small" required />
          </div>
          <div class="form-inline">
            <span class="label label-required">添加时间: </span>
            <input id="addTime" name="addTime" type="text" value="" class="small" />
          </div>
          <div class="form-inline">
            <span class="label label-required">html地址: </span>
            <input id="htmlPath" name="htmlPath" type="text" value="" class="medium" />
          </div>
          <div class="form-inline">
            <label class="label label-submit"></label>
            <input type="hidden" id="hidBrandId" name="hidBrandId" value="" />
            <input class="btn btn-success" type="button" id="submit" name="submit" value="提交" />
            <input class="btn btn-success" type="button" id="update" name="update" value="更新" style="display: none;" />
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>admin/js/brands/brandsmentjs.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>
