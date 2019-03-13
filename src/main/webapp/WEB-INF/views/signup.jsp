<%--
  Created by IntelliJ IDEA.
  User: iftekhar
  Date: 3/7/19
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>

<h3>Signup</h3>

<form:form method="post" modelAttribute="user">
    <%--<form:input path="userName"></form:input>--%>
    <%--<input type="submit" value="signup"/>--%>

    <table border="0" cellpadding="2" cellspacing="2">
        <tr>
            <td>Username: <form:errors path="userName" /> </td>
            <td><form:input path="userName"/></td>
        </tr>
        <tr>
            <td>First Name: <form:errors path="firstName" /> </td>
            <td><form:input path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name: <form:errors path="lastName" /> </td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Gender: <form:errors path="gender" /> </td>
            <td><form:checkbox path="gender" value="M"/>Male</td>
            <td><form:checkbox path="gender" value="F"/>Female</td>
        </tr>
        <tr>
            <td>Email: <form:errors path="email" /> </td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit" /></td>
        </tr>
    </table>

</form:form>

</body>
</html>
