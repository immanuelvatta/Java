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
    <title></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container mt-5">
        <div class="d-flex justify-content-between  align-items-center">
            <div class="card border-0 mb-5">
                <div class="card-body">
                    <h1 class="display-1">Add a Book to Your Shelf!!</h1>
                </div>
            </div>
            <div class="align-items-center">
                <br>
                <a class="btn btn-outline-secondary" href="/books">Back to the shelves</a>
            </div>
        </div>
        <div class="row">
            <form:form action="/books/create" methods="post" modelAttribute="book">
                <div class="form-floating mb-3">
                    <form:input class="form-control" path="title" placeholder="title" />
                    <form:label class="form-label" path="title">Title:</form:label>
                    <form:errors class="form-text text-warning" path="title" />
                </div>
                <div class="form-floating mb-3">
                    <form:input class="form-control" path="author" placeholder="author" />
                    <form:label class="form-label" path="author">Author:</form:label>
                    <form:errors class="form-text text-warning" path="author" />
                </div>
                <div class="form-floating mb-3">
                    <form:textarea class="form-control" rows="3" path="thoughts" placeholder="thoughts"></form:textarea>
                    <form:label class="form-label" path="thoughts">Thought:</form:label>
                    <form:errors class="form-text text-warning" path="thoughts" />
                </div>
                <div class="d-flex justify-content-end">
                    <input class="btn btn-outline-secondary" type="submit"
                        value="Submit">
                </div>
            </form:form>
        </div>
    </div>
</body>
</html>
