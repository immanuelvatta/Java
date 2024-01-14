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
    <title>Books</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script defer src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>

<body>
    <div class="container mt-5">
        <div class="d-flex justify-content-between  align-items-center">
            <div class="card border-0 mb-5">
                <div class="card-body">
                    <h1 class="display-1">Welcome,
                        <c:out value="${user.userName}" />
                    </h1>
                    <h3>Books from everyone's shelves:</h3>
                </div>
            </div>
            <div class="align-items-center">
                <a class="btn btn-outline-secondary" href="/logout">Logout</a>
                <br>
                <a class="btn btn-outline-secondary mt-2" href="/books/new">+ Add to bookshelf</a>
            </div>
        </div>
        <div>
            <div class="card border-secondary mb-3">
                <table class=" table table-striped table-hover table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Id </th>
                            <th scope="col">Title</th>
                            <th scope="col">Author Name</th>
                            <th scope="col">Posted By</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="book" items="${books}">
                            <tr>
                                <th scope="row"><c:out value="${book.id}" /></th>
                                <td><a href="/books/${book.id}"> <c:out value="${book.title}" /> </a> </td>
                                <td><c:out value="${book.author}" /></td>
                                <td><c:out value="${book.user.userName}" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>

</html>