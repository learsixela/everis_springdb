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
		<form action="/martinez" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<input type="submit" value="enviar">
		</form>
		<br>
		<hr>
		<table>
			<thead>
				<tr>
					<th>Nombre </th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ma"  items="${martinez}">
					<tr>
						<td><c:out value="${ma.nombre}" /> </td>
						<td><a href="/martinez/editar/${ma.id}">E</a></td>
						<td><a href="/martinez/eliminar/${ma.id}">X</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>