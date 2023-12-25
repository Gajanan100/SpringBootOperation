<%@page import="com.demo.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome cdsm...........</h2>

<%
      List<Product>plist  =  (List<Product>) request.getAttribute("datashow");

%>

	  <table border="1px" >
	  <tr>
	  <th>Id</th>
	  <th>Name</th>
	  <th>Price</th>
	  <th>Action</th>
	  </tr>
	  <%
  for(Product pt:plist){
	  %>
	  
	  <tr>
	  <td><%=pt.getProdid() %></td>
	  <td><%=pt.getProdname() %></td>
	  <td><%=pt.getProdprice() %></td>
	  <td><a href="deleteProduct/<%=pt.getProdid() %>">DELETE</a>
	 <a href="EditProduct/<%=pt.getProdid() %>">EDIT</a></td>
	  

	<%
	} 
	%>
 </tr>
	  
</table>
</body>
</html>