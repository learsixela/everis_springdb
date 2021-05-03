<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Ingrese información</h2>
		<form action="/cpacheco" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<label for="apellido">Apellido: </label>
			<input type="text" id="apellido" name="apellido">
			<input type="submit" value="enviar">
		</form>
		
		<br>
		<br>
		
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
				<c:forEach var="cpacheco1"  items="${cpacheco}">
					<tr>
						<td><c:out value="${cpacheco1.nombre}" /> </td>
						<td><c:out value="${cpacheco1.apellido}" /> </td>
						<td><a href="/cpacheco/editar/${cpacheco1.id}">E</a></td>
						<td><a href="/cpacheco/eliminar/${cpacheco1.id}">X</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>