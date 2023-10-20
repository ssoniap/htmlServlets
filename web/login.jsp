<%-- 
    Document   : login
    Created on : 18/10/2023, 7:06:59 p. m.
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Login </title>
        <link rel="shortcut icon" href="Imagenes/logoicon.png" type="image/x-iconx">
        <link href="css/loginstyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/normalize.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div id="contenedor">
            <div id="central">
                <div id="login">
                    <div class= "logochef" ><img src="Imagenes/chefluzdelicias.png">                                                                          
                    </div>
                    <div class="titulo">
                        Bienvenido, por favor inicia sesión
                    </div>
                    <form id="loginform" action="RecibeDatos" method="post">
                        <input id="username" type="text" name="usuario" placeholder="Usuario" required>
                        
                        <input id="password" type="password" placeholder="Contraseña" name="Contraseña" required>
                        
                        <button type="submit" title="Ingresar" name="Ingresar" id="buttonSubmit" >Iniciar</button>
                    </form>
                    <div class="pie-form">
                        <a href="#">¿Perdiste tu contraseña?</a>
                        
                    </div>
                </div>
               
            </div>
        </div>
    </body>
</html>
