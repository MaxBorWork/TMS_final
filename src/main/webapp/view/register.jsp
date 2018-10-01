<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Registration</title>
    <%@ include file="/view/include.jsp" %>
</head>
<body>
<%@ include file="/view/header.jsp" %>
<div class="container main-container">
    <div class="row">
        <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
            <table align="center">
                <tr>
                    <td>
                        <form:label path="username">Username</form:label>
                    </td>
                    <td>
                        <form:input path="username" name="username" id="username" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="password">Password</form:label>
                    </td>
                    <td>
                        <form:password path="password" name="password" id="password" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="userEmail">E-mail</form:label>
                    </td>
                    <td>
                        <form:input path="userEmail" name="userEmail" id="userEmail" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="userCountry">Country</form:label>
                    </td>
                    <td>
                        <form:input path="userCountry" name="userCountry" id="userCountry" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <form:button id="register" name="register">Register</form:button>
                    </td>
                </tr>
            </table>
        </form:form>

        <div class="register-success">
            <c:if test="${successRegistration != null}">${successRegistration}</c:if>
        </div>
    </div>
</div>
<%@ include file="/view/footer.jsp" %>
</body>
</html>