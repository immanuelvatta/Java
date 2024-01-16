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
    <div class="container-fluid container-sm mt-5">
        <div class="card border-0 ">
            <div class="card-body">
                <h1 class="display-1">Book Club</h1>
                <h2 class="">A place for friends to share thoughts on books.</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-6 col-md-12 col-sm-12">
                <div class="card shadow border-secondary p-4 mt-5">
                    <div class="card-body">
                        <h2 class="display-3 mb-3">Registration</h2>
                        <form:form action="/register" method="POST" modelAttribute="newUser">
                            <div class="form-floating mb-3">
                                <form:input class="form-control" path="userName"
                                    placeholder="userName" />
                                <form:label class="form-label" path="userName">User Name
                                </form:label>
                                <form:errors class="form-text text-warning" path="userName">
                                </form:errors>
                            </div>
                            <div class="form-floating mb-3">
                                <form:input class="form-control" path="email" placeholder="email" />
                                <form:label class="form-label" path="email">Email</form:label>
                                <form:errors class="form-text text-warning" path="email" />
                            </div>
                            <div class="form-floating mb-3">
                                <form:input class="form-control" path="password" type="password"
                                    placeholder="password" />
                                <form:label class="form-label" path="password">Password</form:label>
                                <form:errors class="form-text text-warning" path="password" />
                            </div>
                            <div class="form-floating mb-3">
                                <form:input class="form-control" path="confirm" type="password"
                                    placeholder="Confirm Password" />
                                <form:label class="form-label" path="confirm">Confirm Password
                                </form:label>
                                <form:errors class="form-text text-warning" path="confirm" />
                            </div>
                            <div class="d-flex justify-content-end">
                                <input class="btn btn-outline-secondary" type="submit"
                                    value="Register">
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
            <div class="col-lg-6 col-md-12 col-sm-12">
                <div class="card shadow border-secondary p-4 mt-5">
                    <div class="card-body">
                        <h2 class="display-3 mb-3">Login</h2>
                        <form:form action="/login" method="POST" modelAttribute="newLogin">
                            <div class="form-floating mb-3">
                                <form:input class="form-control" path="email" placeholder="email" />
                                <form:label class="form-label" path="email">Email</form:label>
                                <form:errors class="form-text text-warning" path="email">
                                </form:errors>
                            </div>
                            <div class="form-floating mb-3">
                                <form:input class="form-control" path="password"
                                    placeholder="password" type="password" />
                                <form:label class="form-label" path="password">Password</form:label>
                                <form:errors class="form-text text-warning" path="password" />
                            </div>
                            <div class="d-flex justify-content-end">
                                <input class="btn btn-outline-secondary" type="submit"
                                    value="Login">
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>