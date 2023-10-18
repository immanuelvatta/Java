<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    <!DOCTYPE html>
    <html>

    <head>
        <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
        <!-- YOUR own local CSS -->
        <link rel="stylesheet" href="/css/main.css"/>
        <!-- For any Bootstrap that uses JS -->
        <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        <meta charset="UTF-8">
        <title>Fruit Store</title>
    </head>

    <body >
        <div class="container min-vh-100 d-flex flex-column justify-content-center">
            <h1 class="text-center">Fruit Store</h1>
            <div class="p-2 container bg-secondary">
                <table class="table table-striped table-bordered border-primary table-dark table-hover m-0">
                    <thead>
                        <tr>
                            <th class="text-body border-color-primary" scope="col">#</th>
                            <th class="text-body" scope="col">Name</th>
                            <th class="text-body" scope="col">Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${fruits}" varStatus="status">
                            <tr>
                                <th scope="row">${status.index + 1}</th>
                                <c:choose>
                                    <c:when test="${item.name.startsWith('G')}">
                                        <td class= "text-success"><c:out value="${item.name}" /></td>
                                    </c:when>
                                    <c:otherwise>
                                        <td><c:out value="${item.name}" /></td>
                                    </c:otherwise>
                                </c:choose>
                                <td><c:out value="${item.price}" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    
    
                </table>
            </div>
        </div>
    </body>

    </html>