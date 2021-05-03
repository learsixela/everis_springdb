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
		<h2>Ingrese información de la canción</h2>
		<form action="/canciones" method="POST">
			<label for="nombreCancion">Nombre cancion </label>
			<input type="text" id="nombreCancion" name="nombreCancion">
			
			<label for="nombreArtista">Nombre artista: </label>
			<input type="text" id="nombreArtista" name="nombreArtista">
			<input type="submit" value="enviar">
		</form>
		<br>
		<hr>
		
		<table>
			<thead>
				<tr>
					<th>Nombre cancion</th>
					<th>Nombre artista </th>
					<th>Editar</th>
					<th>Eliminar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cancion"  items="${canciones}">
					<tr>
						<td><c:out value="${cancion.nombreCancion}" /> </td>
						<td><c:out value="${cancion.nombreArtista}" /> </td>
						<td><a href="/canciones/editar/${cancion.id}">Editar</a></td>
						<td><a href="/canciones/eliminar/${cancion.id}">Eliminar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>