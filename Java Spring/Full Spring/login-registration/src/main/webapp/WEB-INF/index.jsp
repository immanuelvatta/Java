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
    <title>Login and Registration</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container mt-5 mb-5">
        <h1>Welcome!</h1>
        <h2>Join our growing community.</h2>
        <div class="card shadow border-secondary p-4 mt-5">
            <div class="card-body">
                <div class="card-header mb-3">
                    <h2 class="display-4">Registration</h2>
                </div>
                <form:form action="/register" method="post" modelAttribute="newUser">
                    <div class="form-floating mb-3">
                        <form:input class="form-control" placeholder="userName" path="userName"/>
                        <form:label class="form-label" path="userName">User Name:</form:label>
                        <form:errors class="form-text text-warning" path="userName"/>
                    </div>
                    <div class="form-floating mb-3">
                        <form:input class="form-control" path="email" placeholder ="email"/>
                        <form:label class="form-label" path="email">Email:</form:label>
                        <form:errors class="form-text text-warning" path="email"/>
                    </div>
                    <div class="form-floating mb-3">
                        <form:input class="form-control" type="password" path="password" placeholder ="password"/>
                        <form:label class="form-label" path="password">Password:</form:label>
                        <form:errors class="form-text text-warning" path="password"/>
                    </div>
                    <div class="form-floating mb-3">
                        <form:input class="form-control" type="password" path="confirm" placeholder ="confirm"/>
                        <form:label class="form-label" path="confirm">Confirm Password:</form:label>
                        <form:errors class="form-text text-warning" path="confirm"/>
                    </div>
                    <input class="btn btn-primary" type="submit" value="Register">
                </form:form>
            </div>
        </div>
        <div class="card shadow border-secondary p-4 mt-5">
            <div class="card-body">
                <div class="card-header mb-3">
                    <h2 class="display-4">Login</h2>
                </div>
                <form:form action="/login" method="POST" modelAttribute="newLogin">
                    <div class="form-floating mb-3">
                        <form:input class="form-control" path="email" placeholder="email"/>
                        <form:label class="form-label" path="email">Email</form:label>
                        <form:errors class="form-text text-warning" path="email"></form:errors>
                    </div>
                    <div class="form-floating mb-3">
                        <form:input class="form-control" type="password" path="password" placeholder="password"/>
                        <form:label class="form-label" path="password">Password</form:label>
                        <form:errors class="form-text text-warning" path="password"/>
                    </div>
                    <div class="d-flex justify-content-end">
                        <input class="btn btn-outline-primary" type="submit" value="Login">
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</body>

</html>