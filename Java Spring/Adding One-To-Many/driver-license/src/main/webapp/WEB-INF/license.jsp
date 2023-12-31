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
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script defer type="text/javascript" src="/js/app.js"></script>
    <!-- change to match your file/naming structure -->
</head>

<body>
    <h1>New Person</h1>
    <form:form method="post" action="/license/create" modelAttribute="license">
        <form:select path="person">
            <c:forEach var="onePerson" items="${persons}">
                <!--- Each option VALUE is the id of the person --->
                <form:option value="${onePerson.id}" path="person">
                    <!--- This is what shows to the user as the option --->
                    <c:out value="${onePerson.firstName}" />
                    <c:out value="${onePerson.lastName}" />
                </form:option>
            </c:forEach>
        </form:select>
        <form:label path="state">state</form:label>
        <form:input class="form-control" path="state" />
        <form:label path="expirationDate">expirationDate</form:label>
        <form:input class="form-control" type="date" path="expirationDate" />
        <input type="submit" class="btn btn-outline-secondary" value="Submit">
    </form:form>
</body>

</html>