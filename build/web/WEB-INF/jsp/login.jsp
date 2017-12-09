<%-- 
    Document   : login
    Created on : 09/12/2017, 12:54:25
    Author     : jose
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="resources/css/bootstrap.css" />" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="container jumbotron login">
            <form action="validaLogin" method="post"> 
                <div class="form-group col-lg-12 col-md-12 col-xs-12">
                    <label for="login">Login</label>
                    <input name="login" type="text" class="form-control" id="login" placeholder="login">
                </div>                  
                <div class="form-group col-lg-12 col-md-12 col-xs-12">
                    <label for="senha">Senha</label>
                    <input name="senha" type="password" class="form-control" id="senha" placeholder="senha">
                </div>     
                <div class="form-group col-lg-12 col-md-12 col-xs-12">
                    <button type="submit" class="btn btn-primary pull-right">Salvar</button>
                </div> 
            </form>

        </div>
    </body>
</html>
