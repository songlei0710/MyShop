<%--
  Created by IntelliJ IDEA.
  User: 第五组--郜佳欣
  Date: 2014/12/16
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>功能设置</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<!--header 包含头部导航-->
<%@include file="/admin/header.jsp"%>
<!-- end header -->
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">商品 </a>
    <a class="brand2">所有商品列表 </a>
  </div>
</div>
<div class="container-fluid containerb">
  <div class="row-fluid">
    <div class="span2">
      <!-- 引入左侧导航 -->
      <%@include file="/admin/left.jsp"%>
    </div>
    <div class="span10">
      <div class="alert alert-success">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>说明!</strong> 这里显示了所有系统中的商品信息
      </div>
      <div id="alertinfo" style="display: none;" class="alert alert-info">
        <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
      </div>
      <div id="alerterror" style="display: none;"
           class="alert alert-error">
        <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
      </div>
      <div class="line-dotted"></div>
      <!-- flexigrid -->
      <div id="flexfunctionmanagement">
        <table id="functionmanagement" style="display: none;"></table>
      </div>
      <div class="line-dotted"></div>
      <!-- 提示框 -->
      <div id="functiondelModal" class="modal hide fade">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h3>删除提示</h3>
        </div>
        <div  class="modal-body">
          <p id="contentp">One fine body…</p>
        </div>
        <div class="modal-footer">
          <a href="#" id="functionbtnclose" class="btn">关闭</a>
          <a href="#" id="functionbtnok" class="btn btn-primary">确认删除</a>
        </div>
      </div>
    </div>

  </div>

</div>
<script type="text/javascript" src="<%=basePath%>admin/js/function/functionmentjs.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>
