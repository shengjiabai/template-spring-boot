
<%@ page language="java" pageEncoding="utf-8"
         contentType="text/html;charset=utf-8"%>
<%@ page
        trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><%@ taglib
        uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib
        uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>test template</title>
</head>
<body>
<table width="800px">
    <thead align="center">
    <th align="center">商品信息</th>
    </thead>
    <tbody>
    <tr align="center">
        <td width="25%">商品id</td>
        <td width="25%">商品名称</td>
        <td width="25%">商家id</td>
        <td width="25%">店铺名称</td>
        <td width="25%">pid</td>
        <td width="25%">日期</td>
        <td width="25%">价格</td>
        <td width="25%">创建时间</td>
        <td width="25%">创建时间完美显示</td>
    </tr>
    <c:forEach var="listing" items="${lists}">
        <tr align="center">
            <td>${listing.listId}</td>
            <td>${listing.listName}</td>
            <td>${listing.merchantId}</td>
            <td>${listing.storeName}</td>
            <td>${listing.prdId}</td>
            <td>${listing.timeDate}</td>
            <td>${listing.price}&${listing.price /100}</td>
           <%-- <td>${listing.timeDate.format("yyyy-MM-dd")}</td>
            <td>${listing.timeDate.format("yyyy-MM-dd HH:mm:ss")}</td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>