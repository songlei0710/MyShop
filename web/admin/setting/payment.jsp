<%--
  Created by IntelliJ IDEA.
  User: 第五组--白玉鑫
  Date: 2014/12/16
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>账单</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">付费设置 </a>
    <a class="brand2">编辑付费 </a>
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
        <strong>说明</strong> 请根据需要编辑品牌
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
            <span class="label label-required">付费设置: </span>
            <input id="payment" name="payment" type="text" class="small" required />
            <span class="label label-info">付费设置ID</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">付费密码: </span>
            <input id="paymentCode" name="paymentCode" type="text" value="" class="medium" />
          </div>
          <div class="form-inline">
            <span class="label label-required">自由支付: </span>
            <input id="paymentFree"	name="paymentFree" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">支出: </span>
            <input id="paymentInterface"	name="paymentInterface" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">账户: </span>
            <input id="account"	name="account" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">实模式: </span>
            <input id="safecode"	name="safecode" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">合作伙伴: </span>
            <input id="partnerid"	name="partnerid" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">的: </span>
            <input id="des"	name="des" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">快: </span>
            <input id="isFast"	name="isFast" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">状态: </span>
            <input id="state"	name="state" type="text" value="" class="small" required/>
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

