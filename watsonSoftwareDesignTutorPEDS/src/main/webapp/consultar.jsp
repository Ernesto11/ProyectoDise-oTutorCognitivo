<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Consultar</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="barrensavannah.css" />


</head>
<body>

<body>
    <div id="page">
        <img src="images/titulo.png" width="665" height="48" alt="titulo">
        <div class="topNaviagationLink"><a href="index.jsp">Principal</div>
        <div class="topNaviagationLink"><a href="registrar.jsp">Registrar</div>
      <div class="topNaviagationLink"><a href="consultar.jsp">Consultar </div>
        <div class="topNaviagationLink"><a href="index.html">Contact</a></div>
</div>
    <div id="mainPicture">
    	<div class="picture"></div>
    </div>
        <div class="contentBox">
    	<div class="innerBox">
    	  <form name="form"  action="ServletConsulta"  method="post" >
    	    <p>Seleccione la categoria de la consulta:</p><br>
            <p>            
             <input type="radio" name="tipoConsulta" value="poo" checked>Programacion Orientada a objetos.<br>
             <input type="radio" name="tipoConsulta" value="uml">Notacion UML para diagramas de Clase.<br>
             <input type="radio" name="tipoConsulta" value="pds">Principios de Diseno. <br>
            <p>Ingrese la pregunta: </p>
            <p>
             <input type="text" name="pregunta" size="100" maxlength="100" class="form-control" placeholder="pregunta">
    	    <p>
    	    <p><input type="submit" value="Consultar">                        
    	  </form>
    	  
    	        <jsp:useBean id="RespuestaBean" scope="request" class="wasdev.sample.servlet.RespuestaBean" />
          </h1>
    <p><span class="texto">Respuesta:  </span><span class="texto">
    <jsp:getProperty name="RespuestaBean" property="respuesta"/>                
    </span><br/>

    	  <div id="footer">Tutor Cognitivo</div>
<!-- Please leave this in place after all of your content - thanks :) -->
        
        
        

        
        </div>






    </div>
        
</body>
</html>