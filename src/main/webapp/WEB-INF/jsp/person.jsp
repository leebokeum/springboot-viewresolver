<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Person JSP View!!!</title>
    <style>
        td,
        th {
            border: 1px solid #999;
            padding: 0.2rem;
        }
    </style>
</head>

<body>
<h2>Person JSP View!!!</h2>
<table>
    <tr>
        <td>Person Id</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Age</td>
    </tr>
    <tr>
        <td>${person.personId}</td>
        <td>${person.firstName}</td>
        <td>${person.lastName}</td>
        <td>${person.age}</td>
    </tr>
</table>
</body>

</html>