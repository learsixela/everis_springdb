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
		<form action="/mirandas" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<label for="marca">Apellido: </label>
			<input type="text" id="apellido" name="apellido">

			<input type="submit" value="enviar">
		</form>
		<br>
		<hr>
		
		<table>
			<thead>
				<tr>
					<th>Nombre </th>
					<th>Apellido </th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="miranda"  items="${mirandas}">
					<tr>
						<td><c:out value="${miranda.nombre}" /> </td>
						<td><c:out value="${miranda.apellido}" /> </td>
						<td><a href="/miranda/editar/${miranda.id}">E</a></td>
						<td><a href="/miranda/eliminar/${miranda.id}">X</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>