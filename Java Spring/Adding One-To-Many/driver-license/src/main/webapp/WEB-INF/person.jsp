<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Person</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
    <h1>New Person</h1>
    <form:form method="post" action="/persons/create" modelAttribute="person">
        <form:label path="firstName">First Name</form:label>
        <form:input class="form-control" path="firstName" />
        <form:label path="lastName">Last Name</form:label>
        <form:input class="form-control" path="lastName" />
        <input type="submit" class="btn btn-outline-secondary" value="Submit">
    </form:form>
</body>

</html>