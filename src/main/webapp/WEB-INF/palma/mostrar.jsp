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
		<h2>Listado de CELULARES</h2>
		<br>
		<hr>
		<table>
			<thead>
				<tr>
					<th>Numero </th>
					<th>Marca </th>
					<th>accion</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="celular"  items="${celulares}">
					<tr>
						<td><c:out value="${celular.numero}" /> </td>
						<td><c:out value="${celular.marca}" /> </td>
						<td><a href="/celular/editar/${celular.id}">E</a> - 
						<a href="/celular/eliminar/${celular.id}">X</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		
	</div>
</body>
</html>