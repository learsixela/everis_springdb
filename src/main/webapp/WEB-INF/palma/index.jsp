<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CELULARES::</title>
</head>
<body>
	<div>
		<h2>INGRESE CELULAR</h2>
		<form action="/celular/guardar" method="POST">
			<label for="numero">Numero: </label>
			<input type="text" id="numero" name="numero">
			<br>
			<label for="marca">Marca: </label>
			<input type="text" id="marca" name="marca">
			<br>
			<input type="submit" value="enviar">
		</form>
		
	</div>
</body>
</html>