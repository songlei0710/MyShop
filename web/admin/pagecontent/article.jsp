<%--
  Created by IntelliJ IDEA.
  User:第一组
  Date: 2014/12/16
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章管理</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
  <div class="navbar-innert">
    <a class="brand" href="#">
      <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
    <a class="brand" href="#">文章设置 </a>
    <a class="brand2">编辑文章 </a>
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
        <strong>说明</strong>请根据需要编辑文章
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
      <form id="articleform">
        <div class="form-actions">
          <div class="form-inline">
            <span class="label label-required">是否外链</span>
            <input type="radio" name="isOutSite" value="1" checked="checked"/>是
            <input type="radio" name="isOutSite" value="0"/>否
          </div>
          <div class="form-inline">
            <span class="label label-required">文章标题: </span>
            <input id="title" name="title" type="text" class="small" required />
            <span class="label label-info">请输入文章标题</span>
          </div>
          <div class="form-inline">
            <span class="label label-required">外联地址: </span>
            <input id="url" name="url" type="text" value="" class="medium" />
          </div>
          <div class="form-inline">
            <span class="label label-required">排序: </span>
            <input id="sort"	name="sort" type="text" value="" class="small" required/>
          </div>
          <div class="form-inline">
            <span class="label label-required">正文: </span>
            <textarea id="contentValue" name="contentValue" cols="50" rows="12" style="width: 100%;height: 600px;visibility: hidden">
            </textarea>
          </div>
          <div class="form-inline">
            <span class="label label-required">主图: </span>
            <div id="uploaderarticlemainpic"></div>
            <div id="triggers"></div>
          </div>
          <div class="form-inline">
            <span class="label label-required">操作: </span>
            <input class="btn btn-success" type="button" id="delpc" name="delpc" value="删除所选图片"/>
          </div>
          <div class="form-inline">
            <label class="label label-submit"></label>
            <input type="hidden" id="hidArticleId" name="hidArticleId" value="" />
            <input class="btn btn-success" type="button" id="submit" name="submit" value="提交" />
            <input class="btn btn-success" type="button" id="update" name="update" value="更新" style="display: none;" />
          </div>
        </div>
      </form>
    </div>
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>admin/js/pagecontent/articlementjs.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/js/plugins/kindeditor/kindeditor-min.js"></script>
<script type="text/javascript">
  KE.show({
    id : 'contentValue',
    imageUploadJson : '<%=basePath%>/admin/js/plugins/kindeditor/jsp/upload_json.jsp',
    fileManagerJson : '<%=basePath%>/admin/js/plugins/kindeditor/jsp/file_manager_json.jsp',
    allowFileManager : true,
    afterCreate : function(id) {
      KE.event.ctrl(document, 13, function() {
        KE.util.setData(id);
      });
    }
  });
</script>
<script type="text/javascript" src="<%=basePath%>admin/js/plugins/uploader/fileuploader.js"></script>
<script type="text/javascript">
  function createUploader(){
    var uploader = new qq.FileUploader({
      element: document.getElementById('uploaderarticlemainpic'),
      action: '<%=basePath%>ajaxFileUploads.action;jsessionid=<%=session.getId()%>',
      debug: true,
      minSizeLimit:1024,
      sizeLimit: 1073741824,
      allowedExtensions: ['jpeg','jpg','gif','png'],
      onComplete: function(id, fileName, responseJSON){
        var pcpath1="<%=basePath%>"+responseJSON.success;
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
