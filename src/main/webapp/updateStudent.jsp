<%@page import="com.dto.Student"%>
<%@page import="com.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>

<% 
int id = Integer.parseInt(request.getParameter("id"));
StudentDao sd = new StudentDao();
Student s= sd.findStudentById(id);
%>


<form action="updateStudent">

<fieldset>

<legend>Update Student</legend>
id:<input type="text" name="id" value="<%= s.getId()%>" readonly="readonly"><br><br>
name:<input type="text" name="name" value="<%= s.getName()%>"><br><br>
email:<input type="email" name="email" value="<%= s.getEmail()%>"><br><br>
dateOfbirth:<input type="date" name="dob" value="<%= s.getDob()%>"><br><br>
gender:<input type="text" name="gender" value="<%= s.getGender() %>">


<input type="submit" value="UPDATE">
<input type="reset" value="CANCEL">

</fieldset>

</form>
</body>
</html>