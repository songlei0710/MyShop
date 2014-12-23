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
    <title>商品分类管理</title>
</head>
<body  data-spy="scroll" data-target=".subnav" data-offset-top="40">
<!--header 包含头部导航-->
<%@include file="/admin/header.jsp"%>
<!-- end header -->
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">商品分类管理 </a>
    <a class="brand2">编辑商品分类</a>
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
        <strong>说明</strong> 请根据需要编辑商品分类(如果分类下已经包含商品或者夸分类修改请慎重)

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
      <!-- 开始显示商品类型form表单 -->
      <form id="goodscategoryform">
       <div class="form-actions">
        <div class="form-inline">
          <span class="label label-required">选择商品类型: </span> <select
                id="goodsTypeId" name="goodsTypeId">

        </select> <span class="label label-info">请选择一个商品类型</span>
        </div>
        <div class="form-inline">
          <span class="label label-required">选择分类: </span> <select
                id="parentId" name="parentId"></select> <select id="parentId1"
                                                                name="parentId1"></select> <span class="label label-info">请选择一个商品分类</span>
        </div>
        <div id="fater" class="form-inline">
          <span class="label label-required">上级分类: </span> <span id="modfl"><input
                type="text" id="parentName" name="parentName" value="" readonly /></span>
        </div>
        <div class="form-inline">
          <span class="label label-required">分类名称:</span> <input type="text"
                                                                 id="name" name="name" class="small" />
        </div>
        <div class="form-inline">
          <table>
            <tr>
              <td><span class="label label-required">分类图标:</span></td>
              <td>
                <div id="uploadercategorylogo">
                  <noscript>
                    Please enable JavaScript to use file uploader.
                    <!-- or put a simple form for upload here -->
                  </noscript>

                </div>
              </td>
            </tr>
          </table>
          <!-- trigger elements -->
          <div id="triggers"></div>

        </div>
        <div class="form-inline">
          <span class="label label-required">操作:</span> <input
                class="btn btn-success" type="button" id="delpc" name="delpc"
                value="删除所选图片" />
        </div>
        <div class="form-inline">
          <span class="label label-required">静态化标示:</span> <input
                type="text" id="sign" name="sign" class="small" />
        </div>
        <div class="form-inline">
          <span class="label label-required">排序:</span> <input type="text"
                                                               id="sort" name="sort" class="small" />
        </div>
        <div class="form-inline">
          <span class="label label-required">同步移动平台:</span>
          <input type="radio"  name="mobilesync" value="1" checked="checked" />是
          <input type="radio"  name="mobilesync" value="0" />否
        </div>
        <div class="form-inline">
          <span class="label label-required">页面关键字:</span> <input
                type="text" id="metaKeywords" name="metaKeywords" class="small" />
        </div>
        <div class="form-inline">
          <span class="label label-required">页面描述:</span> <input type="text"
                                                                 id="metaDes" name="metaDes" class="medium" />
        </div>
        <div class="form-inline">
          <label class="label label-submit"></label> <input type="hidden"
                                                            id="hidgoodsCategoryTid" name="hidgoodsCategoryTid" value="" />
          <input type="hidden" id="hidgrade" name="hidgrade" value="" />
          <!-- 隐藏二级分类id -->
          <input type="hidden" id="hidparentId" name="hidparentId" value=""/>
          <!-- 隐藏三级分类id -->
          <input type="hidden" id="hidparentId1" name="hidparentId1" value=""/>
          <input class="btn btn-success" type="button" id="submit"
                 name="submit" value="提交" /> <input class="btn btn-success"
                                                    type="button" id="update" name="update" value="更新"
                                                    style="display: none;" />
        </div>
      </div>
      </form>
    </div>

  </div>

</div>
<script type="text/javascript" src="<%=basePath%>admin/js/goods/goodscategorymentjs.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/js/plugins/uploader/fileuploader.js"></script>
<script type="text/javascript">
  function createUploader(){
    var uploader = new qq.FileUploader({
      element: document.getElementById('uploadercategorylogo'),
      action: '<%=basePath%>ajaxFileUploads.action;jsessionid=<%=session.getId()%>',
      debug: true,
      minSizeLimit:1024,
      sizeLimit: 1073741824,
      allowedExtensions: ['jpeg','jpg','gif','png'],
      onComplete: function(id, fileName, responseJSON){
        var pcpath1="<%=basePath%>"+ responseJSON.success;
        var pcpath=responseJSON.success;
        var htm="<img id='"+id+"' src='"+pcpath1+"' rel='#"+fileName+"'/>";
        var checkpc="<input id='"+id+"' name='pcpath' type='checkbox' value='"+pcpath+"' /> ";
        $("#triggers").append(htm).append(checkpc);
      }
    });
  }
  window.onload = createUploader;

</script>
<%@include file="/admin/footer.jsp"%>

</body>
</html>
