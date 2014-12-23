<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>会员分组设置 </title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="group" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="group" href="#">会员分组设置 </a>
    <a class="group2">编辑会员分组 </a>
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
        <strong>说明</strong> 请根据需要编辑会员分组
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
      <div class="form-actions">
          <form>
        <div class="form-inline">
          <span class="label label-required">分组名称: </span> <input
                id="nameA" name="nameA" type="text" value=""
                class="small" />
        </div>
        <div class="form-inline">
          <span class="label label-required">显示:</span>
            <input type="radio" id="status" name="status" value="1" checked="checked" /> <label for="status">是 </label>
            <input type="radio" id="status2" name="status2" value="0" /> <label for="status2">否 </label>
        </div>
            <div class="form-inline">
              <span class="label label-required">创建时间: </span>
              <input id="createTime"	name="createTime" type="text" value="" class="small" required/>
            </div>

            <div class="form-inline">
              <span class="label label-required">创建编号: </span>
              <input id="creatorId" name="creatorId" type="text" value="" class="small" required/>
            </div>

            <div class="form-inline">
              <span class="label label-required">更新时间: </span>
              <input id="updateTime"	name="updateTime" type="text" value="" class="small" required/>
            </div>
            <div class="form-inline">
              <span class="label label-required">版本: </span>
              <input id="versionT"	name="versionT" type="text" value="" class="small" required/>
            </div>
            <div class="form-inline">
              <span class="label label-required">属性: </span>
              <input id="attrs" name="attrs" type="text" value="" class="small" required/>
            </div>


          <div class="form-inline">
            <span class="label label-required">排序: </span>
            <input id="sort" name="sort" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <label class="label label-submit"></label>
            <!--<input type="hidden" id="hidBrandId" name="hidBrandId" value="" />-->
              <input class="btn btn-success" type="button" id="submit" name="submit" value="提交" />
              <input class="btn btn-success" type="button" id="update" name="update" value="更新" style="display: none;" />
          </div>
        </form>
      </div>
    </div>
  </div>
  <script type="text/javascript" src="<%=basePath%>admin/js/member/menbergroupmentjs.js"></script>
  <%@include file="/admin/footer.jsp"%>
</body>
</html>

