<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>${errorTitle}</title>

    <%@ include file="/view/include.jsp" %>
</head>
<body>
    <%@ include file="/view/header.jsp" %>

    <div class="container main-container error-page-container">
        <div class="row">
            <div class="error-text">
                <span class="error-title">${errorMsg}</span>

            </div>
        </div>
    </div>

    <%@ include file="/view/footer.jsp" %>
</body>
</html>
