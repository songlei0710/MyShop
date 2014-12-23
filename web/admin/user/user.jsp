<%--
  Created by IntelliJ IDEA.
  User: 第五组--wendy
  Date: 2014/12/11
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>用户管理</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">用户设置 </a>
    <a class="brand2">编辑用户 </a>
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
        <strong>说明</strong> 请根据需要编辑用户
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
            <span class="label label-required">用户名称: </span>
            <input id="userName" name="userName" type="text" class="small" required />
            <span class="label label-info">请输入用户名称</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户真实名称: </span>
            <input id="realName" name="realName" type="text" class="small" required />
            <span class="label label-info">请输入用户真实名称</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">email邮箱: </span>
            <input id="email" name="email" type="text" class="small" required />
            <span class="label label-info">请输入用户emai信息</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户固定电话信息: </span>
            <input id="telNo" name="telNo" type="text" class="small" required />
            <span class="label label-info">请输入用户固定电话信息</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户手机信息: </span>
            <input id="mobile" name="mobile" type="text" class="small" required />
            <span class="label label-info">请输入用户手机信息</span>
          </div> <div class="form-inline">
          <span class="label label-required">用户安全问题: </span>
          <input id="question" name="question" type="text" class="small" required />
          <span class="label label-info">请输入用户安全问题</span>
        </div>
          <div class="form-inline">
            <span class="label label-required">用户安全问题答案: </span>
            <input id="answer" name="answer" type="text" class="small" required />
            <span class="label label-info">请输入用户安全问题答案</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户密码: </span>
            <input id="password" name="password" type="text" class="small" required />
            <span class="label label-info">请输入用户密码</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户状态: </span>
            <input id="userState" name="userState" type="text" class="small" required />
            <span class="label label-info">请输入用户状态</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户所属部门id: </span>
            <input id="sectionId" name="sectionId" type="text" class="small" required />
            <span class="label label-info">请输入用户所属部门Id</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户所属职位ID: </span>
            <input id="positionId" name="posiId" type="text" class="small" required />
            <span class="label label-info">请输入用户所属职位Id</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户所属组别Id: </span>
            <input id="groupId" name="groupId" type="text" class="small" required />
            <span class="label label-info">请输入用户所属组别Id</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户qq: </span>
            <input id="qq" name="qq" type="text" class="small" required />
            <span class="label label-info">请输入用户qq</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户新浪微博: </span>
            <input id="siNaWeiBo" name="siNaWeiBo" type="text" class="small" required />
            <span class="label label-info">请输入用户新浪微博</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户所属角色名称: </span>
            <input id="rolEmName" name="rolEmName" type="text" class="small" required />
            <span class="label label-info">请输入用户所属角色名称</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户所属角色ID: </span>
            <input id="rolEmId" name="rolEmId" type="text" class="small" required />
            <span class="label label-info">请输入用户所属角色ID</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户类型: </span>
            <input id="state" name="state" type="text" class="small" required />
            <span class="label label-info">请输入用户类型</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户所属头像地址: </span>
            <input id="headPash" name="headPash" type="text" class="small" required />
            <span class="label label-info">请输入用户头像地址</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户微信: </span>
            <input id="weiXin" name="weiXin" type="text" class="small" required />
            <span class="label label-info">请输入用户微信</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户创建时间: </span>
            <input id="createTime" name="createTime" type="text" class="small" required />
            <span class="label label-info">请输入用户创建时间</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">用户更新时间: </span>
            <input id="updateTime" name="updateTime" type="text" class="small" required />
            <span class="label label-info">请输入用户更新时间</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">创建人Id: </span>
            <input id="creatorId" name="creatorId" type="text" class="small" required />
            <span class="label label-info">创建人Id</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">发帖数: </span>
            <input id="postingCount" name="postingCount" type="text" class="small" required />
            <span class="label label-info">发帖数</span>
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
<script type="text/javascript" src="<%=basePath%>admin/js/userT/usermentjs.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>
