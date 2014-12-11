<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>jump</title>
    <script type="text/javascript" src="<%=basePath%>admin/js/jquery.js"></script>
    <script type="text/javascript">
      $(document).ready(function() {
        var pathnamearray=window.location.pathname.split("/");
        var pathname=pathnamearray[1]+"/";
        if(pathname=="MyShop/"){
          pathname="";
        }
        window.location.href="http://"+window.location.host+"/"+pathname+"admin/login.jsp";
      });
    </script>
</head>
<body>
    <div id="hidjumptologin">正在跳转请稍后...</div>
</body>
</html>
