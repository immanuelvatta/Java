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
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
    <!-- change to match your file/naming structure -->
</head>

<body>
    <div class="container">
        <form action="/survey" method="GET" model="survey">
            <div class="form-group">
                <label for="name">Name</label>
                <input name="name" type="text" class="form-control" id="name" placeholder="">
            </div>
            <div class="form-group">
                <label for="location">Location</label>
                <input name="location" type="text" class="form-control" id="location"
                    placeholder="">
            </div>
            <div class="form-group">
                <label for="language">Language</label>
                <select name="language" class="form-control" id="language">
                    <option>Java</option>
                    <option>Python</option>
                    <option>C#</option>
                    <option>JavaScript</option>
                    <option>C</option>
                </select>
            </div>
            <button type="submit" class="btn btn-success mb-2">Submit</button>
        </form>


        <p>name: <c:out value="${name}"/></p>
        <p>location: <c:out value="${location}"/></p>
        <p>language: <c:out value="${language}"/></p>
    </div>
</body>

</html>