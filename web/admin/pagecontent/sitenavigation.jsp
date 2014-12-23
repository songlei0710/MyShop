<%--
  Created by IntelliJ IDEA.
  User: 第一组
  Date: 2014/12/16
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>导航设置</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="snid" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="snid" href="#">导航设置 </a>
    <a class="snid2">编辑导航 </a>
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
        <strong>说明</strong> 请根据需要编辑导航
      </div>
      <div id="alerterror" style="display: none;" claass="alert alert-error">
        <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>
      </div>
      <div id="alertinfo" style="display: none;" class="alert alert-info">
        <a class="close" data-dismiss="alert" href="#">&times;</a> <strong></strong>U
      </div>
      <div class="line-dotted"></div>
      <div class="btn-group">
        <button id="btnback" type="button" class="btn btn-success">返回</button>
      </div>
      <!-- 开始显示商品类型form表单 -->
      <form id="brandsform">
        <div class="form-actions">
          <div class="form-inline">
            <span class="label label-required">导航名称: </span>
            <input id="name" name="name" type="text" class="small" required />
          </div>
          <div class="form-inline">
            <span class="label label-required">显示位置:</span>
            <select id="position" name="position">
              <option value="1">
                页面上部
              </option>
              <option value="2">
                页面中部
              </option>
              <option value="3">
                页面下部
              </option>
            </select>
          </div>
          <div class="form-inline">
            <span class="label label-required">新窗口打开:</span>
            <input type="radio" id="isTargetBlank" name="isTargetBlank" value="1" checked="checked" />
            <label for="isTargetBlank">是 </label>
            <input type="radio" id="isTargetBlank2" name="isTargetBlank2" value="0" />
            <label for="isTargetBlank2">否 </label>
          </div>
          <div class="form-inline">
            <span class="label label-required">显示:</span>
            <input type="radio" id="isVisible" name="isVisible" value="1" checked="checked" />
            <label for="isVisible">是 </label> <input type="radio" id="isVisible2" name="isVisible2" value="0" />
            <label for="isVisible2">否 </label>
          </div>
          <div class="form-inline">
            <span class="label label-required">排序: </span>
            <input id="sort"	name="sort" type="text" value="" class="small" required/>
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
