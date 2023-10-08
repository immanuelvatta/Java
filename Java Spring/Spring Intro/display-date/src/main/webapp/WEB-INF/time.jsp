<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <script type="text/javascript" src="/js/app.js"></script>
    <link rel="stylesheet" href="/css/style.css">
    <title>Time</title>
</head>

<body>
    <div class="container mx-auto">
        <div class="flex flex-wrap items-center justify-center h-screen space-x-4 ">
            <h1 class="text-yellow-500 text-6xl"><c:out value="${time}" /> </h1>
            <a class="btn btn-outline btn-warning btn-lg btn-wide" href="/">Dashboard</a>
        </div>
    </div>
</body>

</html>