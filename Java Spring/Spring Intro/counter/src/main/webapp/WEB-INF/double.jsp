<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/main.css">
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <title>Double Current visit count</title>
</head>

<body data-bs-theme=dark>
    <div class="container min-vh-100 d-flex flex-column justify-content-center">
        <div class="row ">
            <div class="col ">
                <h1 class=>You have visited <a href="http://localhost:8080/">http://localhost:8080/</a>
                    <c:out value="${count}" /> times.
                </h1>
                <a href="http://localhost:8080/">
                    <h1>Take another visit?</h1>
                </a>
            </div>
        </div>
    </div>
</body>

</html>