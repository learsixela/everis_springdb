<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio Mascotas</title>
</head>
<body>

	<div class="container">
	
	<div class= row >
	<h2>Ingrese información</h2>
	</div>
		
		
		<form action="/mascota" method="POST">
		<div class= row >
				<label for="nombre">Nombre: </label>
				<input type="text" id="nombre" name="nombre">
		</div>
		<div class= row >
			<label for="tipo">Tipo: </label>
			<input type="text" id="tipo" name="tipo">
		</div>
		<div class= row >
			<label for="raza">Raza: </label>
			<input type="text" id="raza" name="raza">
		</div>
		<div class= row >
			<label for="edad">Edad: </label>
			<input type="text" id="edad" name="edad">
		</div>
		<br>
		<br>
		<div class= row ><input type="submit" value="enviar" class = "btn btn-success"></div>
			
			
		</form>
		<br>
		<hr>
		</div>
		<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th>Nombre </th>
					<th>Tipo </th>
					<th>Raza </th>
					<th>Edad </th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="mascota"  items="${mascotas}">
					<tr>
						<td><c:out value="${mascota.nombre}" /> </td>
						<td><c:out value="${mascota.tipo}" /> </td>
						<td><c:out value="${mascota.raza}" /> </td>
						<td><c:out value="${mascota.edad}" /> </td>
						

						

						<td><a href="/mascota/editar/${mascota.id}">E</a></td>
						<td><a href="/mascota/eliminar/${mascota.id}">X</a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>