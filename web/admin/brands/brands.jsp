<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>品牌管理</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
  <%@include file="/admin/header.jsp"%>
  <div id="navigation" class="navbar">
    <div class="navbar-innert">
      <a class="brand" href="#">
        <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
      <a class="brand" href="#">品牌设置 </a>
      <a class="brand2">编辑品牌 </a>
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
              <span class="label label-required">品牌名称: </span>
              <input id="brandName" name="brandName" type="text" class="small" required />
              <span class="label label-info">请输入商品名称</span>
            </div>
            <div class="form-inline">
              <span class="label label-required">品牌官方网址: </span>
              <input id="url" name="url" type="text" value="" class="medium" />
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
