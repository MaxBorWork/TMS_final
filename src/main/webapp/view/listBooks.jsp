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
    <div class="container main-container show-books-container">
        <div class="row">
            <c:forEach items="${books}" var="book">
                <div class="col-sm-12 book-view">
                    <div class="col-sm-5 book-image">
                        <img src="/resources/images/${book.bookImageLink}" alt="">
                    </div>
                    <div class="col-sm-7 book-prev-info">
                        <h3><a href="/${book.bookID}">${book.bookTitle}</a></h3>
                        <h4>${book.bookAuthor}</h4>
                        <p>${book.bookDescription}</p>
                        <%  if (session.getAttribute("login") != null) {
                            Login login = (Login) session.getAttribute("login");
                            if (login.getUsername() != null && login.getUsername().equals("admin")) {%>
                        <span><a href="<c:url value='/editBook/${book.id}' />" >Edit</a></span>
                        <span><a href="<c:url value='/removeBook/${book.id}' />" >Delete</a></span>
                        <%}}%>
                    </div>
                </div>
            </c:forEach>
            <div class="col-sm-12 noBooks">
                <c:if test="${noBooks != null}">${noBooks}</c:if>
            </div>
        </div>
    </div>

    <%@ include file="/view/footer.jsp" %>
</body>
</html>
