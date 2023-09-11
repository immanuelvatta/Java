<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
    <script defer type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <div class="container min-vh-100 d-flex flex-column align-items-center justify-content-center">

        <div class="card border-secondary shadow w-50 ">
            <div class="card-body">
                <h1 class="mb-3">New Ninja</h1>
                <form:form method="post" action="/ninjas/create" modelAttribute="ninja">
                    <div class="form-floating mb-3">
                        <form:select class="form-select" path="dojo">
                            <c:forEach var="dojo" items="z">
                                <form:option value="${dojo.id}" path="dojo">
                                    <c:out value="${dojo.name}"/>
                                </form:option>
                            </c:forEach>
                        </form:select>
                        <form:label path="dojo">Dojo: </form:label>
                    </div>
                    <div class="form-floating mb-3 ">
                        <form:input class="form-control" path="firstName" placeholder="firstName" />
                        <form:label path="firstName">First Name: </form:label>
                        <form:errors class="text-danger" path="firstName" />
                    </div>
                    <div class="form-floating mb-3 ">
                        <form:input class="form-control" path="lastName" placeholder="lastName" />
                        <form:label path="lastName">Last Name: </form:label>
                        <form:errors class="text-danger" path="lastName" />
                    </div>
                    <div class="form-floating mb-3 ">
                        <form:input class="form-control" type="number" path="age" placeholder="Age:" />
                        <form:label path="age">Age: </form:label>
                        <form:errors class="text-danger" path="age" />
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
