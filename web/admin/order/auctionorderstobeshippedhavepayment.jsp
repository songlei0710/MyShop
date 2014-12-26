<%--
  Created by 第四组 IDEA.
  User: Administrator
  Date: 2014/12/16
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>已付款——需发货拍卖订单</title>
</head>
<body data-spy="scroll" data-target=".subnav" data-offset-top="40">
<%@include file="/admin/header.jsp"%>
<div id="navigation" class="navbar">
    <div class="navbar-innert">
        <a class="brand" href="#">
            <img src="<%=basePath%>admin/ui/assets/img/logo.png" width="175" height="30" alt=""></a>
        <a class="brand" href="#">订单设置 </a>
        <a class="brand2">编辑订单 </a>
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
                <strong>说明</strong> 请根据需要编辑订单
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
                        <span class="label label-required">订单名称: </span>
                        <input id="goodsname" name="goodsname" type="text" class="small" required />
                        <span class="label label-info">请输入订单名称</span>
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">户主名称: </span>
                        <input id="username" name="username" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">需要数量: </span>
                        <input id="needquant" name="needquant" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">价格: </span>
                        <input id="price" name="price" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">利润: </span>
                        <input id="favorable" name="favorable" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">改变价格: </span>
                        <input id="changeprice" name="changeprice" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">标记: </span>
                        <input id="points" name="points" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">总计: </span>
                        <input id="subtotal" name="subtotal" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">添加时间: </span>
                        <input id="addtime" name="addtime" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">数量: </span>
                        <input id="quantity" name="quantity" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">图片: </span>
                        <input id="picture" name="picture" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">支付宝账号: </span>
                        <input id="usersetnum" name="usersetnum" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">重量: </span>
                        <input id="weight" name="weight" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                        <span class="label label-required">说明: </span>
                        <input id="state" name="state" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                    <span class="label label-required">网址: </span>
                    <input id="htmlpath" name="htmlpath" type="text" value="" class="medium" />
                </div>
                    <div class="form-inline">
                        <span class="label label-required">附加订单: </span>
                        <input id="orderTag" name="orderTag" type="text" value="" class="medium" />
                    </div>
                    <div class="form-inline">
                    <span class="label label-required">制作者: </span>
                    <input id="productName" name="productName" type="text" value="" class="medium" />
                </div>
                    <div class="form-inline">
                    <span class="label label-required">快递: </span>
                    <input id="cartTag" name="cartTag" type="text" value="" class="medium" />
                </div>
                    <div class="form-inline">
                    <span class="label label-required">购买人: </span>
                    <input id="membername" name="membername" type="text" value="" class="medium" />
                </div>
                    <div class="form-inline">
                        <span class="label label-required">库存: </span>
                        <input id="storeTag" name="storeTag" type="text" value="" class="medium" />
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
<script type="text/javascript" src="<%=basePath%>admin/js/order/auctionorderstobeshippedhavepaymentjs.js"></script>
<%@include file="/admin/footer.jsp"%>
</body>
</html>
