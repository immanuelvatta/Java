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
<html data-bs-theme="dark">
<head>
    <meta charset="UTF-8">
    <title><c:out value="${book.title}"/></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container mt-5">
        <div class="d-flex justify-content-between  align-items-center">
            <div class="card border-0 mb-5">
                <div class="card-body">
                    <h1 class="display-1"><c:out value="${book.title}"/></h1>
                </div>
            </div>
            <div class="align-items-center">
                <br>
                <a class="btn btn-outline-secondary" href="/books">Back to the shelves</a>
            </div>
        </div>
        <div class="card border-secondary mb-3">
            <div class="card-body">
                <h3><c:out value="${book.user.userName}"/> read <c:out value="${book.title}"/> by <c:out value="${book.author}"/></h3>
                <h5 class="mb-5">Here are <c:out value="${book.user.userName}"/>'s thoughts:</h5>
                <p><c:out value="${book.thoughts}"/></p>
            </div>

            <div class="d-flex justify-content-end align-items-center">
                <c:if test="${book.user.userName==user.userName}">
                    <a class="btn btn-outline-success m-3 " href="/books/edit/${book.id}">Edit</a>
                    <form action="/books/delete/${book.id}" method="post">
                        <input type="hidden" name="_method" value="delete">
                        <input class="btn btn-outline-danger m-3" type="submit" value="Delete">
                    </form>
                </c:if>

            </div>

        </div>

    </div>
</body>
</html>
