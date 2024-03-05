<%-- 
    Document   : login
    Created on : Feb 19, 2024, 7:57:16 PM
    Author     : DiepTCNN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<jsp:useBean id="admin" class="model.Admin" scope="session"/>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LOGIN</h1>
        <h3 style="color: red;">${requestScope.error}</h3>
        <form action="login" method="post">
            <table>
                <tr>
                    <td>User name:</td><td><input type="text" name="user" value="${cookie.user.value}"/></td>
                </tr>
                <tr>
                    <td>Password:</td><td><input type="password" name="pass" value="${cookie.pass.value}"/></td>
                </tr>
                <tr>
                    <!--  nếu gt equal 'ON' -> có chọn -> checked -> lưu lại gt-->
                    <td></td><td><input type="checkbox" ${cookie.rem.value eq 'ON'?"checked":""} 
                                        name="rem" value="ON"/>Remember me</td>
                </tr>
                <tr>
                    <td></td><td><input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
