<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MVC</title>
</head>
<body>
<h1>${message}</h1>
<h1>The employee ${employee.firstName} ${employee.lastName} has been created with a $${employee.salary}.00 salary</h1>
</body>
</html>

<%--Call using http://localhost:8080/Exercise11/create/salary?firstname=David&lastname=Roth&salary=60000--%>
