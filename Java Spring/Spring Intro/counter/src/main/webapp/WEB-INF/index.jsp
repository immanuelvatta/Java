<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
            <link rel="stylesheet" href="css/main.css">
            <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
            <title>Welcome, again</title>
        </head>

        <body data-bs-theme=dark>
            <div class="container min-vh-100 d-flex flex-column justify-content-center">
                <div class="row ">
                    <div class="col text-center">
                        <h1>Welcome User!</h1>
                    </div>
                </div>
                <div class="row ">
                    <div class="col text-center">
                        <a class="btn btn-outline-primary" href="/counter">Counter</a>
                        <a class="btn btn-outline-secondary" href="/reset">Reset</a>
                        <a class="btn btn-outline-success" href="/double">Double</a>
                    </div>
                </div>

            </div>
        </body>

        </html>