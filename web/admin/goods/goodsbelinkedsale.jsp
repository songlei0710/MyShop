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
    <title>关联销售商品管理</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">关联销售商品信息管理 </a>
    <a class="brand2">编辑关联销售商品信息</a>
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
        <strong>说明</strong>请根据需要编辑关联销售商品信息

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
      <form id="goodsbelinkedsaleform">
      <div class="form-actions">
        <div class="well">
          <h4>商品选择区域</h4>
        </div>
        <div class="form-inline">
          <div id="selectgoodscategory" class="form-inline">
            <span class="label label-required">选择分类: </span> <select
                  id="navid" name="navid"></select>
            <!-- 顶级分类一级分类 -->
            <select id="ltypeid" name="ltypeid"></select>
            <!-- 二级分类 -->
            <select id="stypeid" name="stypeid"></select>
            <!-- 三级分类 -->
            <button id="search" name="search" class="btn btn-primary" type="button">查询</button>
          </div>
        </div>
        <!-- flexigrid -->
        <div id="flexgoodsmanagement">
          <table id="goodsmanagement" style="display: none;"></table>
        </div>
        <div class="line-dotted"></div>
        <div class="well">
          <h4>主商品</h4>
        </div>
        <div class="span12" style="margin-left:0px;">
          <table class="table table-bordered">
            <thead>
            <tr>
              <th>
                货物名称
              </th>
              <th>
                会员价
              </th>
              <th>
                操作
              </th>
            </tr>
            </thead>
            <tbody id="belinkedmaininfo">
            <!-- 主商品标记 -->
            <input type="hidden"  id="maintag" name="maintag" value="" />

            </tbody>
          </table>

          <div class="line-dotted"></div>

          <div class="well">
            <h4>子商品</h4>
          </div>

          <table class="table table-bordered">
            <thead>
            <tr>
              <th>
                货物名称
              </th>
              <th>
                会员价
              </th>
              <th>
                操作
              </th>
            </tr>
            </thead>
            <tbody id="belinkedsubinfo">
            <!-- 子商品标记 -->
            <input type="hidden"  id="subtag" name="subtag" value="" />

            </tbody>
          </table>
        </div>
        <div class="form-inline">
          <label class="label label-submit"></label> <input type="hidden"
                                                            id="hidproductid" name="hidproductid" value="">
          <input type="hidden" id="hidgoodsid" name="hidgoodsid" value="">
          <input type="hidden" id="hidgoodsname" name="hidgoodsname" value="">
          <input
                  class="btn btn-success" type="button" id="submit" name="submit"
                  value="提交" /> <input class="btn btn-success" type="button"
                                       id="update" name="update" value="更新" style="display: none;" />
        </div>
      </div>
      </form>
    </div>

  </div>

</div>
<script type="text/javascript" src="<%=basePath%>admin/js/goods/goodsbelinkedmentjs.js"></script>
<%@include file="/admin/footer.jsp"%>


</body>
</html>
