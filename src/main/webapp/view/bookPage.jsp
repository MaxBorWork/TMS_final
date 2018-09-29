<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Page</title>

    <%@ include file="/view/include.jsp" %>
</head>
<body>
    <%@ include file="/view/header.jsp" %>
    <div class="container main-container show-book-container">
        <div class="row">
            <div class="col-sm-12 book-view">
                <div class="col-sm-5 book-image">
                    <img src="/resources/images/${book.bookImageLink}" alt="">
                </div>
                <div class="col-sm-7 book-prev-info">
                    <h3>${book.bookTitle}</h3>
                    <h4>${book.bookAuthor}</h4>
                    <h4>${book.yearOfPublish}</h4>
                    <p>${book.bookDescription}</p>
                </div>
            </div>
            <div class="col-sm-6 col-sm-offset-3 download-book">
                <ul>
                    <li><c:if test="${book.bookFileFb != ''}">
                            <a href="/resources/files/${book.bookFileFb}" download class="download-book-item">
                        </c:if>FB2</a></li>
                    <li><c:if test="${book.bookFileEpub != ''}">
                        <a href="/resources/files/${book.bookFileEpub}" download class="download-book-item">
                            </c:if>ePub</a></li>
                    <li><c:if test="${book.bookFilePdf != ''}">
                        <a href="/resources/files/${book.bookFilePdf}" download class="download-book-item">
                            </c:if>PDF</a></li>
                    <li><c:if test="${book.bookFileTxt != ''}">
                        <a href="/resources/files/${book.bookFileTxt}" download class="download-book-item">
                            </c:if>TXT</a></li>
                </ul>
            </div>
        </div>
    </div>

    <%@ include file="/view/footer.jsp" %>
</body>
</html>
