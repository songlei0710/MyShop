<%--
  Created by IntelliJ IDEA.
  User: 第三组-林春蕾
  Date: 2014/12/16
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品规格管理</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
  <div id="navigation" class="navbar">
    <div class="navbar-innert">
      <a class="brand" href="#">
        <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
      <a class="brand" href="#">商品规格设置</a>
      <a class="brand2">商品规格列表 </a>
    </div>
  </div>
<div class="container-fluid containerb">
  <div class="row-fluid">
    <div class="span2">
      <!-- 引入左侧导航 -->
      <%@include file="/admin/left.jsp"%><!--引入该jsp页面 -->
    </div>
    <div id="mainlogic" class="span10">
      <div class="alert alert-success">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>说明</strong> 请根据需要编辑商品规格
      </div>
      <div id="alerterror" style="display: none;" class="alert alert-error"><!--显示错误信息-->
        <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
      </div>
      <div id="alertinfo" style="display: none;" class="alert alert-info">
        <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
      </div>
      <div class="line-dotted"></div>
      <div class="btn-group">
        <button id="btnback" type="button" class="btn btn-success">返回</button>
      </div>
      <!-- 开始显示商品规格form表单 -->
      <form id="brandsform">
        <div  class="form-actions">
          <!--
          <div class="form-inline">
            <span clas="label label-required">规格名称：</span>
            <input id="brandName" name="brandName" class="small" type="text" required="true"/>
            <span class="label label-info">请输入商品的名称</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">品牌官方网址: </span>
            <input id="url" name="url" type="text"  class="medium" />
          </div>
          <div class="form-inline">
            <span class="label label-required">排序: </span>
            <input id="sort" name="sort" type="text"  class="small" required/>
          </div>
          -->
          <div class="form-inline">
            <label class="label label-submit"></label>
            <input type="hidden" id="hidBrandid" name="hidbrandid" value="" /><!--隐藏字段-->
            <input class="btn btn-success" type="button" id="submit" name="submit" value="提交" />
            <input class="btn btn-success" type="button" id="update" name="update" value="更新" style="display: none;" />
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>admin/js/products/productspecification.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>
