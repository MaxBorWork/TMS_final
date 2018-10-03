<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Login</title>
    <%@ include file="/view/include.jsp" %>
</head>
<body>
<%@ include file="/view/header.jsp" %>
<div class="container main-container">
    <div class="row">
        <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
            <table align="center">
                <tr>
                    <td>
                        <form:label path="username">Username: </form:label>
                    </td>
                    <td>
                        <form:input path="username" name="username" id="username" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="password">Password:</form:label>
                    </td>
                    <td>
                        <form:password path="password" name="password" id="password" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <form:button id="login" name="login">Login</form:button>
                    </td>
                </tr>
            </table>
        </form:form>
        <div class="login-error">
            <c:if test="${message != null}">${message}</c:if>
        </div>
    </div>
</div>

<%@ include file="/view/footer.jsp" %>
</body>
</html>