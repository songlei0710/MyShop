<%--
  Created by IntelliJ IDEA.
  User: 第五组--wendy
  Date: 2014/12/11
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户角色设置</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">用户角色设置 </a>
    <a class="brand2">编辑用户角色 </a>
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
        <strong>说明</strong> 请根据需要编辑用户角色
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
      <!-- 开始显示用户类型form表单 -->
      <form id="usersform">
        <div class="form-actions">
          <div class="form-inline">
            <span class="label label-required">用户角色Id: </span>
            <input id="id" name="id" type="text" class="small" required />
            <span class="label label-info">请输入用户角色id</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户id: </span>
            <input id="userid" name="userid" type="text" class="small" required />
            <span class="label label-info">请输入用户id</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">角色id: </span>
            <input id="roleid" name="roleid" type="text" class="small" required />
            <span class="label label-info">请输入角色id</span>
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
<script type="text/javascript" src="<%=basePath%>admin/js/userT/userrolejs.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>