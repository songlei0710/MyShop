<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div class="well well-small">
  <ul class="nav nav-list">
    <li class="nav-header">自定义快捷菜单</li>
    <li>
      <a href="<%=basePath%>admin/goods/goodstypetnment.jsp?operate=find">商品类型参数设置</a>
    </li>
    <li>
      <a href="<%=basePath%>admin/goods/goodsattributement.jsp?operate=find">商品属性设置</a>
    </li>
    <li>
      <a href="<%=basePath%>admin/products/productspecificationment.jsp?operate=find">商品规格设置</a>
    </li>
    <li>
      <a href="<%=basePath%>admin/goods/goodscategoryment.jsp?operate=find">商品分类设置</a>
    </li>
    <li><a href="<%=basePath%>admin/goods/goodsment.jsp?operate=find">商品列表</a>
    </li>
  </ul>
</div>
<div class="well well-small">
  <ul class="nav nav-list">
    <li class="nav-header">你可以</li>
    <li><a target="_blank"
           href="https://github.com/songlei0710/MyShop">在github上关注我们</a></li>
    <li><a target="_blank" href="http://www.hzjxy.net">访问我们的学校</a></li>
  </ul>
</div>
</body>
</html>
