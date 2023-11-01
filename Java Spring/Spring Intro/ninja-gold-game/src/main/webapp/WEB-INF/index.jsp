<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>

<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
        crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/css/main.css" />
    <title>Demo JSP</title>
</head>

<body>
    <div class="container">
        <div class="row">
            <h3 class="m-5">Your Gold: <c:out value="${total_gold}"/> </h3>
        </div>

        <div class="row d-flex justify-content-evenly">
            <div class="col card border border-info m-5 p-5">
                <h5 class="d-flex justify-content-center">Farm</h5>
                <p class="d-flex justify-content-center"> (earns 10-20 gold)</p>
                <form action="/processMoney" method="post" class="d-flex justify-content-center">
                    <input type="hidden" name="area" value="farm" />
                    <input type="submit" value="Find Gold!" class="btn btn-warning" />
                </form>

            </div>
            <div class="col card border border-primary m-5 p-5">
                <h5 class="d-flex justify-content-center">Cave</h5>
                <p class="d-flex justify-content-center"> (earns 5-10 gold)</p>
                <form action="/processMoney" method="post" class="d-flex justify-content-center">
                    <input type="hidden" name="area" value="cave" />
                    <input type="submit" value="Find Gold!" class="btn btn-warning" />
                </form>
            </div>
            <div class="col card border border-secondary m-5 p-5">
                <h5 class="d-flex justify-content-center">House</h5>
                <p class="d-flex justify-content-center"> (earns 2-5 gold)</p>
                <form action="/processMoney" method="post" class="d-flex justify-content-center">
                    <input type="hidden" name="area" value="house" />
                    <input type="submit" value="Find Gold!" class="btn btn-warning" />
                </form>
            </div>
            <div class="col card border border-success m-5 p-5">
                <h5 class="d-flex justify-content-center">Quest</h5>
                <p class="d-flex justify-content-center text-center"> (earns/takes 
                    <div class="text-center"> 0-50 gold)</div>
                </p>
                <form action="/processMoney" method="post" class="d-flex justify-content-center">
                    <input type="hidden" name="area" value="quest" />
                    <input type="submit" value="Find Gold!" class="btn btn-warning" />
                </form>
            </div>
        </div>
        <div class="row mt-2">
            <div class="col card border border-warning m-5 p-5">
                <h5><u>Activities</u>:</h5>
                <div class="pl-3 mb-2" style="max-height: 150px; overflow-y: auto;"> 
                    <c:forEach var="activity" items="${activities}">
                        <c:choose>
                            <c:when test="${fn:containsIgnoreCase(activity, 'earned')}">
                                <p class="text-success" style="margin: 0px;"><c:out value="${activity}" /></p>
                            </c:when>
                            <c:otherwise>
                                <p class="text-danger" style="margin: 0px;"><c:out value="${activity}" /></p>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </div>
            </div>
        </div>

</body>

</html>