<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
        <meta charset="UTF-8">
        <title>Simple Receipt</title>
    </head>

    <body >
        <h1>Customer Name: <c:out value="${name}" /></h1>
        <p>Item name: <c:out value="${itemName}" /></p>
        <p>Price: $<c:out value="${price}" /></p>
        <p>Description: <c:out value="${description}" /></p>
        <p>Vendor: <c:out value="${vendor}" /></p>
    </body>

    </html>