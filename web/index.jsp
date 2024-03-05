<%-- 
    Document   : index
    Created on : Feb 19, 2024, 8:22:08 PM
    Author     : DiepTCNN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id = "login" scope="session" class = "model.Admin"> 
            <jsp:setProperty name = "login" property = "role" value = "0"/>  
        </jsp:useBean>
        <p>Role: 
<!--            truy cập phương thức get-->
            <jsp:getProperty name = "login" property = "role"/>
        </p>
        <h1>Hello ${sessionScope.account.user}</h1>
        <a href="logout"><button>Logout</button></a>
    </body>
</html>
