<%@page import="org.hibernate.hql.internal.ast.DetailedSemanticException"%>
<%@page import="dto.StudentDetails"%>
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
<table border="">
<tr> 
<th>STD_ID</th>
<th>STD_city</th>
<th>STD_name</th>
</tr>
<%List<StudentDetails> list=(List<StudentDetails>)request.getAttribute("key");%>
<%for(StudentDetails details :list){%>

<tr>
<td><%=details.getId() %></td>
<td><%=details.getAddress() %></td>
<td><%=details.getName() %></td>
</tr>
<%} %>

</table>

</body>
</html>