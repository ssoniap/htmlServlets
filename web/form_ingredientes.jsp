<%-- 
    Document   : form_ingredientes
    Created on : 18/10/2023, 7:38:22 p. m.
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Ingredientes</title> 
        <link rel="shortcut icon" href="Imagenes/logoicon.png" type="image/x-iconx">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/estilos.css">
        <link href="css/form_ingredientes.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header class="hero">
            <nav class="nav container">
                <div class="nav_logo">
                    <img src="Imagenes/Logolozdelicias.png"; width="200"; height="100";>
                </div>

                <!-- BARRA DE BUSQUEDA-->       

                <div class="barra-busqueda" style="text-align: -moz-center; text-align: center; background:none;">
                    <div class="col-md-12">
                        <div id="sb-search" class="sb-search">
                            <form>
                                <input id="searchbar" class="sb-search-input" placeholder="Barra de búsqueda" type="text" name="search">
                                <input class="sb-search-submit" type="submit">                                
                            </form>
                         </div>              
                    </div>
                </div>

                <ul class="nav_link nav_link--menu">
                    <li class="nav_items">
                        <a href="login.html" class="nav_links">Inicio</a>
                    </li>
                    <li class="nav_items">
                        <a href="recetario.html" class="nav_links">Recetario</a>
                    </li>
                    <li class="nav_items">
                        <a href="#" class="nav_links">Usuario</a>
                    </li>                    
                    <li class="title pointercursor">
                        <a href="#" class="nav_links">Menu</a>                        
                    </li>
                    

                    <!-- <img src="Imagenes/close.svg" class="nav_close"> -->
                </ul>

                <!-- <div class="nav_menu">
                    <img src="Imagenes/menu.svg" class="nav_img">
                </div> -->
            </nav> 
        </header>           
        <div id="contenedor">
            <div id="central">       
                    <div id="formulario">
                    
                    <div class="titulo">
                        Por favor ingresa los datos solicitados
                    </div>
                    <form id="form_ingredientes" action="<%= request.getContextPath() %>/ingresarIngrediente" method="post">
                        <table style="with: 80%">
                            <tr>
                                <td>ID</td>
                                <td><input type="text" name="id" /></td>
                            </tr>
                            <tr>
                                <td>NOMBRE INGREDIENTE</td>
                                <td><input type="text" name="nombre" /></td>
                            </tr>
                            <tr>
                                <td>CANTIDAD</td>
                                <td><input type="text" name="cantidad" /></td>
                            </tr>
                            <tr>
                                <td>UNIDAD DE MEDIDA</td>
                                <td><input type="text" name="unidad" /></td>
                            </tr>
                        </table>
                        <button type="submit" title="Registrar" name="registrar" id="buttonSubmit" >Registrar</button>
                    </form>                       
                </div>
               
            </div>
        </div>
    </body>
</html>
