<%@ page import="com.example.jsp_summary_with_crud.Entity.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/23/2025
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customer List</h1>
<%
  List<Customer> dataList = (List<Customer>) request.getAttribute("customers");
  if (dataList != null && !dataList.isEmpty()) {
%>
<table border="1">
  <thead>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Address</th>
    <th>EMail</th>
  </tr>
  </thead>
  <tbody>
  <%
    for (Customer customerDTO : dataList) {
  %>
  <tr>
    <td><%=customerDTO.getId()%></td>
    <td><%=customerDTO.getName()%></td>
    <td><%=customerDTO.getAddress()%></td>
    <td><%=customerDTO.getEmail()%></td>
  </tr>
  <%
    }
  %>
  </tbody>
</table>
<%
  }
%>

</body>
</html>
