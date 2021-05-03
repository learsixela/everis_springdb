<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libros</title>
<script type="text/javascript" src="js/index.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css"></link>
</head>
<body>
	<h1>Agregar libro</h1>
	<form action="/libros/agregar" method="POST"> <!-- get pasan a url - post ocultos -->
		<label for="nombreForm">Nombre</label>
		<input type="text" id="nombreForm" name="nombreForm"> <!-- id unico - name pasamos la info al controlador -->
		<label for="autorForm">Autor</label>
		<input type="text" id="libroForm" name="autorForm"> <!-- id unico - name pasamos la info al controlador -->
		<input type="submit" value="enviar">
	</form>
	
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Autor</th>
				<th>Editar</th>
				<th>Eliminar</th>
			</tr>
		</thead>	
		<tbody>
				<c:forEach var="libro"  items="${libros_lista}">
					<tr>
						<td><c:out value="${libro.nombre}" /> </td>
						<td><c:out value="${libro.autor}" /> </td>
						<td><a href="/libros/editar/${libro.id}">Editar</a></td>
						<td><a href="/libros/eliminar/${libro.id}">X</a></td>
					</tr>
				</c:forEach>
			</tbody>
	</table>
</body>
</html>