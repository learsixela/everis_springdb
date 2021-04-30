<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>
	<div>
		<h2>Ingrese información</h2>
		<form action="/alumnos" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<label for="pass">Password: </label>
			<input type="password" id="pass" name="pass">
			<input type="submit" value="enviar">
		</form>
	</div>
</body>
</html>