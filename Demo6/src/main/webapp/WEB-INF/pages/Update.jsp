<%@page import="com.demo.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
       
        Product p=  (Product)request.getAttribute("edit");
%>
<h>${edit }</h2>
<form action="/updatedata">
enter a prodid<input type="text" name="prodid" value="<%=p.getProdid()%>"><br><br>
enter a prodname<input type="text" name="prodname" value="<%=p.getProdname()%>"><br><br>
enter a prodprice<input type="text" name="prodprice" value="<%=p.getProdprice()%>"><br><br>
<input type="submit">


</form>

</body>
</html>