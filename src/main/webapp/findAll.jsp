<%@page import="com.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find All</title>
</head>
<body>
<%
	List<Student> list = (List<Student>) session.getAttribute("listofstudent");
	%>

	<table border="1px solid black" cellspacing="2px" cellpadding="2px" width="100%">
		<tr>
			<th>SNO</th>
			<th>Student_Id</th>
			<th>Student_Name</th>
			<th>Student_Email</th>
			<th>Student_Dob</th>
			<th>Student_Gender</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>

		<%
		int i=1;
		for (Student s : list) {
		%>

			<tr>
			<td><%=i++ %></td>
			<td><%=s.getId() %></td>
			<td><%=s.getName()%></td>
			<td><%=s.getEmail() %></td>
			<td><%=s.getDob() %></td>
			<td><%=s.getGender() %></td>
			<td><a href="updateStudent.jsp?id=<%=s.getId() %>"><button>EDIT</button></a></td>
			<td><a href="deleteStudent?id=<%=s.getId() %>"><button>DELETE</button></a></td>
			</tr>


		<%
		}
		%>



	</table>
	
	<a href="AdminDashboard.jsp"><button>Back</button></a>
</body>
</html>