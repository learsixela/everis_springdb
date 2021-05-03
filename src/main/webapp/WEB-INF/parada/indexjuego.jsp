<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>
	<div>
		<h2>Ingrese información</h2>
		<form action="/juegos/guardar" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			
			<label for="clasificacion">clasificacion: </label>
			<input type="text" id="clasificacion" name="clasificacion">
			
			<label for="genero">Genero: </label>
			<input type="text" id="genero" name="genero">
			<input type="submit" value="enviar">
		</form>
		<br>
		<hr>
		
		<table>
			<thead>
				<tr>
					<th>Nombre </th>
					<th>clasificacion </th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="juego"  items="${juegos}">
					<tr>
						<td><c:out value="${juego.nombre}" /> </td>
						<td><c:out value="${juego.clasificacion}" /> </td>
						<td><a href="/juegos/editar/${juegos.id}">E</a></td>
						<td><a href="/juegos/eliminar/${juegos.id}">X</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>