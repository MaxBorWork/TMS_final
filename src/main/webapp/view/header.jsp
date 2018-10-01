<%@ page import="java.util.Map" %>
<%@ page import="by.borisevich.webLib.model.Login" %>
<header>
    <div class="header-panel container">
        <div class="row">
            <div class="header-title col-sm-2">
                <a href="/">WebLib</a>
            </div>
            <div class="header-menu col-sm-offset-1 col-sm-5">
                <ul class="menu">
                    <%  if (session.getAttribute("login") != null) {
                        Login login = (Login) session.getAttribute("login");
                    if (login.getUsername() != null && login.getUsername().equals("admin") &&
                    login.getPassword() != null && login.getPassword().equals("123")) {%>
                        <li><a href="showUsers">Show users</a></li>
                        <li class="book-admin"><a href="<c:url value='/addBook' />">Add book</a></li>
                            <%--<ul class="submenu">--%>
                                <%--<li><a href="addBook">Add</a></li>--%>
                                <%--<li><a href="updateBook">Update</a></li>--%>
                                <%--<li><a href="deleteBook">Delete</a></li>--%>
                            <%--</ul>--%>
                    <%}}%>
                    <li><a href="<c:url value='/findBook' />">Find book</a></li>
                    <li><a href="<c:url value='/listBooks' />">Show book</a></li>
                </ul>
            </div>
            <div class="header-user-settings col-sm-offset-1 col-sm-3">
                <ul>
                    <%  if (session.getAttribute("login") != null) {
                        Login login = (Login) session.getAttribute("login");
                        if (login.getUsername() != null && login.getPassword() != null)
                        {%>
                            <li><a href="logout">Logout</a></li>
                        <% } else { %>
                            <li><a href="login">Login</a></li>
                            <li><a href="register">Register</a></li>
                     <% }
                    } else { %>
                    <li><a href="login">Login</a></li>
                    <li><a href="register">Register</a></li>
                    <% }%>
                </ul>
            </div>
        </div>
    </div>
</header>