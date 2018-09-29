<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <title>weblib</title>

    <%@ include file="/view/include.jsp" %>

</head>
<body>
<%@ include file="/view/header.jsp" %>
    <h1>Welcome on WebLib!</h1>
    <div class="container main-container">
        <div class="row">
            <c:forEach items="${booksList}" var="book">
                <div class="col-sm-12 book-view">
                    <div class="col-sm-5 book-image">
                        <img src="/resources/images/${book.bookImageLink}" alt="">
                    </div>
                    <div class="col-sm-7 book-prev-info">
                        <h3><a href="/${book.bookID}">${book.bookTitle}</a></h3>
                        <h4>${book.bookAuthor}</h4>
                        <p>${book.bookDescription}</p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
    <%@ include file="/view/footer.jsp" %>
</body>
</html>