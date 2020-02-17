<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/1/9
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>支付页面</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("input[type=button]").click(function () {
               window.location.href="pay/payForGoods?name="+$("input[name='name']").val()+"&phoneNumber="+$("input[name='phoneNumber']").val()+"&price="+100;
            })
        })
    </script>
</head>
<body>
<div style="align-self: center">
    <table style="text-align: center;margin: auto" border="1">
        <thead>
        <th>订单详情</th>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>手机号：</td>
            <td><input type="text" name="phoneNumber"/></td>
        </tr>
        <tr>
            <td>商品价格：</td>
            <td>100</td>
            <%--<input type="text" name="price"/>--%>
        </tr>
        </thead>
        <tr><td colspan="2"><input type="button" value="提交"/></td></tr>
    </table>
</div>
</body>
</html>
