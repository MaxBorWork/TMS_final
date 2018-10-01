<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>

    <title>List books</title>

    <%@ include file="/view/include.jsp" %>
</head>
<body>
<%@ include file="/view/header.jsp" %>
<div class="container main-container show-users-container">
    <div class="row">
        <div class="col-sm-12 users-view">
            <table>
                <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.userEmail}</td>
                    <td>${user.userCountry}</td>
                <%  if (session.getAttribute("login") != null) {
                    Login login = (Login) session.getAttribute("login");
                    if (login.getUsername() != null && login.getUsername().equals("admin")) {%>
                <td><a href="<c:url value='/removeUser/${user.id}' />" >Delete</a></td>
                <%}}%>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

<%@ include file="/view/footer.jsp" %>
</body>
</html>
