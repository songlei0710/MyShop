<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关联销售商品列表</title>
</head>
<body  data-spy="scroll" data-target=".subnav" data-offset-top="40">
<!--header 包含头部导航-->
<%@include file="/admin/header.jsp"%>
<!-- end header -->
<div class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#"><img  src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt="" width="175"
            height="30" alt=""></a> <a class="brand" href="#">关联销售商品</a> <a
          id="dttitle" class="brand2">所有关联销售商品列表</a>
  </div>

</div>
<div class="container-fluid containerb">

  <div class="row-fluid">

    <div class="span2">
      <!-- 引入左侧导航 -->
      <%@include file="/admin/left.jsp"%>
    </div>
    <form id="goodsbelinkedsalementform">
    <div class="span10">
      <div class="alert alert-success">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>说明</strong> 请根据需要定义关联销售商品
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
      <div id="flexgoodsbelinkedment">
        <table id="goodsbelinkedment" style="display: none;"></table>
      </div>
      <div class="line-dotted"></div>
      <!-- 提示框 -->
      <div id="goodscommentdelModal" class="modal hide fade">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h3>删除提示</h3>
        </div>
        <div  class="modal-body">
          <p id="contentp">One fine body…</p>
        </div>
        <div class="modal-footer">
          <a href="#" id="goodscommentbtnclose" class="btn">关闭</a>
          <a href="#" id="goodscommentbtnok" class="btn btn-primary">确认删除</a>
        </div>
      </div>

    </div>
    </form>
  </div>

</div>
<script type="text/javascript" src="<%=basePath%>admin/js/goods/goodsbelinkedmentjs.js"></script>
<%@include file="/admin/footer.jsp"%>

</body>
</html>
