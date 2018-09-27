<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Find book page</title>

    <%@ include file="/view/include.jsp" %>
</head>
<body>
    <%@ include file="/view/header.jsp" %>
<div class="container main-container find-book-container">
    <div class="row">
    <form:form id="findBookByTitleForm" modelAttribute="book" action="findingProcess" method="post">
        <table align="center">
            <tr>
                <td><form:label path="bookTitle">Book title:</form:label></td>
                <td><form:input path="bookTitle" id="bookTitleInput" name="bookTitleInput"
                            placeholder="Input book title"/></td>
            </tr>
            <tr>
                <td><form:button id="bookTitleForm" name="bookTitleForm">Find</form:button></td>
            </tr>
        </table>
    </form:form>

    </div>
</div>
    <%@ include file="/view/footer.jsp" %>
</body>
</html>
