
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>test template</title>
</head>
<body>
<table width="800px">
    <thead align="center">
    <th align="center">商品freemarker</th>
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
       
        <#list lists as listing>
             <tr align="center">
                             <td>${listing.listId}</td>
                             <td>${listing.listName}</td>
                             <td>${listing.merchantId}</td>
                             <td>${listing.storeName}</td>
                             <td>${listing.prdId}</td>
                 <td>${listing.creatTime?string('yyyy-MM-dd hh:mm:ss')}</td>
                 <td>${listing.price}&${listing.price /100}</td>
                 <td>${listing.timeDate?time}</td>
                 <td>${listing.timeDate?datetime}</td>
                         </tr>
        </#list>
    </tbody>
</table>
</body>
</html>