<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Student</title>
</head>
<body>
<form action="createStudent">

<fieldset>

<legend>Create Student</legend>
name:<input type="text" name="name"><br><br>
email:<input type="email" name="email"><br><br>
password:<input type="password" name="pass"><br><br>
dateOfbirth:<input type="date" name="dob"><br><br>
gender:<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female
<input type="radio" name="gender" value="other">Other<br><br>

<input type="submit" value="CREATE">
<input type="reset" value="CANCEL">

</fieldset>

</form>
</body>
</html>