<%--
  User: 宋磊
  Date: 2014/12/1
  Time: 10:05
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8"/>
    <meta name="author" content="hzjxy">
    <title>管理员登录页面</title>
    <link href="<%=basePath%>admin/ui/assets/css/bootstrap.css" rel="stylesheet">
    <link href="<%=basePath%>admin/ui/assets/css/bootstrap-responsive.css" rel="stylesheet">
    <link href="<%=basePath%>admin/ui/assets/css/docs.css" rel="stylesheet">
    <link href="<%=basePath%>admin/ui/assets/js/google-code-prettify/prettify.css" rel="stylesheet">
    <link href="<%=basePath%>admin/ui/assets/css/base.css" rel="stylesheet">

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="<%=basePath%>admin/ui/assets/ico/favicon.ico" />
    <style type="text/css">
        html {
            height: 100%;
        }
        .view-login {
            padding-top: 0;
            background-color: #142849;
            background-image: -webkit-gradient(radial, center center, 0, center center, 460, from(#165387), to(#142849));
            background-image: -webkit-radial-gradient(circle, #165387, #142849);
            background-image: -moz-radial-gradient(circle, #165387, #142849);
            background-image: -o-radial-gradient(circle, #165387, #142849);
            background-repeat: no-repeat;
        }
        .view-login .container {
            width: 300px;
            position: absolute;
            top: 50%;
            left: 50%;
            margin-top: 106px;
            margin-left: -150px;
        }
        .form-signin {
            max-width: 300px;
            padding: 19px 29px 29px;
            margin: 0px auto;
            background-color: #fff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
        }
        .form-signin .form-signin-heading,.form-signin .checkbox {
            margin-bottom: 20px;
        }
        .form-signin input[type="text"],.form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }
    </style>
</head>
<body data-spy="scroll" data-target=".bs-docs-sidebar" class="view-login">
<div class="container">
    <form class="form-signin" action="bk/user/adminlogin.action" method="post">
        <h2 class="form-signin-heading">
            <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="280" height="48">
        </h2>
        <div class="messages">
            <div style="display: none;" id="message-error"
                 class="message message-error">
                <div class="image">
                    <img src="<%=basePath%>admin/ui/assets/img/header/icon-48-alert.png" alt="Error" height="32" />
                    <span>您输入的用户名或者密码错误</span>
                </div>
            </div>
        </div>
        <hr />
        <input id="username" name="username" type="text" class="input-block-level" placeholder="请输入用户名">
        <input id="password" name="password" type="password" class="input-block-level" placeholder="请输入密码">
        <label class="checkbox"><input type="checkbox" value="remember-me">记住我 </label>
        <button class="btn btn-large btn-primary" type="submit">
            <i class="icon-user icon-white"></i> 安全登录
        </button>
    </form>
</div>
<div class="navbar navbar-fixed-bottom">
    <div class="navbar-inner navbar-innerb">
        <div class="pull-right fixed-bottom-cp">&copy;哈尔滨职业技术学院 2014</div>
        <div class="viewsite fixed-bottom-div">
            <a href="http://www.hzjxy.net/" target="_blank"><i class="icon-share-alt"></i> 浏览网站</a>
        </div>
        <div class="loggedin-users fixed-bottom-div">
            <span class="badge">0</span> 访客在线
        </div>
        <div class="backloggedin-users fixed-bottom-div">
            <span class="badge">1</span> 管理在线
        </div>
    </div>
</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="<%=basePath%>admin/ui/assets/js/jquery.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-transition.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-alert.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-modal.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-dropdown.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-scrollspy.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-tab.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-tooltip.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-popover.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-button.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-collapse.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-carousel.js"></script>
<script src="<%=basePath%>admin/ui/assets/js/bootstrap-typeahead.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/js/jquery.query.js"></script>
<script type="text/javascript">
    $(function() {
        //读取登录返回状态并显示提示
        var msg = $.query.get("msg");
        if ("1" == msg) {
            $("#message-error").show();
        } else {
            $("#message-error").hide();
        }
    });
</script>
</body>
</html>
