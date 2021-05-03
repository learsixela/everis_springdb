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
		<form action="/alumnos" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<label for="pass">Password: </label>
			<input type="password" id="pass" name="pass">
			<label for="edad">Edad: </label>
			<input type="text" id="edad" name="edad">
			<input type="submit" value="enviar">
		</form>
		<br>
		<hr>
		
		<table>
			<thead>
				<tr>
					<th>Nombre </th>
					<th>Edad </th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="alumno"  items="${alumnos}">
					<tr>
						<td><c:out value="${alumno.nombre}" /> </td>
						<td><c:out value="${alumno.edad}" /> </td>
						<td><a href="/alumnos/editar/${alumno.id}">E</a></td>
						<td><a href="/alumnos/eliminar/${alumno.id}">X</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
	<a class="btn btn-primary" href="/api/martinez">Redirigir a url martinez</a>
	<a class="btn btn-primary" href="/dpeliculas">Dante Lagos</a>
	<a class="btn btn-success" href="/HerreraLiberona/">Sebastián Herrera</a>
</body>
</html>