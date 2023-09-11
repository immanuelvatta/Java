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
<html data-bs-theme="dark">

<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container min-vh-100 d-flex flex-column align-items-center justify-content-center">

        <div class="card border-secondary shadow w-50 ">
            <div class="card-body">
                <h1>New Dojo</h1>
                <form:form method="post" action="/dojos/create" modelAttribute="dojo">
                    <div class="form-floating mb-3 ">
                        <form:input class="form-control" path="name" placeholder="name" />
                        <form:label path="name">Name: </form:label>
                        <form:errors class="text-danger" path="name" />
                    </div>
                    <div class="d-flex justify-content-end ">
                        <input type="submit" class="btn btn-outline-secondary" value="Create">
                    </div>
                </form:form>
            </div>
        </div>

    </div>
</body>
</html>