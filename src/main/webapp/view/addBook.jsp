<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>

    <title>Add book</title>

    <%@ include file="/view/include.jsp" %>

</head>
<body>
    <%@ include file="/view/header.jsp" %>
    <div class="container main-container add-book-container">
        <div class="row">
        <form:form id="addBookForm" modelAttribute="book" action="addingProcess" method="post">
            <table align="center">
                <tr>
                    <td>
                        <form:label path="bookTitle">Book Title</form:label>
                    </td>
                    <td>
                        <form:input path="bookTitle" name="bookTitle" id="bookTitle"
                                    placeholder="Input book title"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="bookID">Book ID</form:label>
                    </td>
                    <td>
                        <form:input path="bookID" name="bookID" id="bookID"
                                    placeholder="Input book ID"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="bookCategoryName">Book Category</form:label>
                    </td>
                    <td>
                        <form:input path="bookCategoryName" name="bookCategoryName" id="bookCategoryName"
                                    placeholder="Input book category"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="bookAuthor">BookAuthor</form:label>
                    </td>
                    <td>
                        <form:input path="bookAuthor" name="bookAuthor" id="bookAuthor"
                                    placeholder="Input book author"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="yearOfPublish">BookYear</form:label>
                    </td>
                    <td>
                        <form:input path="yearOfPublish" name="yearOfPublish" id="yearOfPublish"
                                    placeholder="Input book year"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="bookDescription">BookDescription</form:label>
                    </td>
                    <td>
                        <form:input path="bookDescription" name="bookDescription" id="bookDescription"
                                    placeholder="Input book description"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="bookImageLink">BookImage</form:label>
                    </td>
                    <td>
                        <form:input path="bookImageLink" name="bookImageLink" id="bookImageLink"
                                    placeholder="Input book image link"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:button id="addBook" name="addBook">Add</form:button>
                    </td>
                </tr>
            </table>
        </form:form>
        </div>
    </div>
    <%@ include file="/view/footer.jsp" %>
</body>
</html>
