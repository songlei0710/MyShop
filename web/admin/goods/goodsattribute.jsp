<%--
  Created by IntelliJ IDEA.
  User: 第二组
  Date: 2014/12/16
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品属性设置</title>
</head>
<body  data-spy="scroll" data-target=".subnav" data-offset-top="40">
<!--header 包含头部导航-->
<%@include file="/admin/header.jsp"%>
<!-- end header -->
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">商品属性设置 </a>
    <a class="brand2">编辑商品属性 </a>
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
        <strong>说明</strong>请根据需要编辑商品信息
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
      <!-- 开始显示商品属性form表单 -->
     <form id="goodsattributeform">
         <div class="form-inline">
             <div class="form-inline">
                 <span class="label label-required">商品属性名称：</span>
                 <input id="goodSatTributeName" name="goodSatTributeName" type="text" class="small" required=""/>
                 <span class="label label-info">请输入商品属性名称</span>
             </div>
             <div class="form-inline">
                 <span class="label label-info">排序：</span>
                 <input id="sort" name="sort" type="text" value="" class="small" required=""/>
             </div>
             <div class="form-inline">
                 <label class="label label-submit"></label>
                 <input type="hidden" id="hidBrandId" name="hidBrandId" value="" />
                 <input class="btn btn-success" type="button" id="submit" name="submit" value="提交" />
                 <input class="btn btn-success" type="button" id="update" name="update" value="更新" style="display: none;" />
             </div>
         </div>
     </form>
<script type="text/javascript" src="<%=basePath%> admin/js/goods/goodsattributement.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>
