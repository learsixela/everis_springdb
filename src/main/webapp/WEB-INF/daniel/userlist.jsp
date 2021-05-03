<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<title>Tabla de Usuarios</title>
</head>
<body>
		<table class="table table-striped table-hover">
	             <thead class="table-dark">
    				<tr>
		              	  <th scope="col">Id</th>
		                  <th scope="col">Nombre</th>
		                  <th scope="col">Apellido</th>
		                  <th scope="col">Rut</th>
		                  <th scope="col">Cargo</th>
		                  <th scope="col">Opciones</th>
		             </tr>
		         </thead>
	             <tbody> 
	              <tr> 
	              	<c:forEach var="i" begin="1" end="${largo}" >
	              		<tr>
	    					<th> <c:out value = "${userList[i-1].getId()}"></c:out>  </th> 
	   						<th> <c:out value = "${userList[i-1].getNombre()}"> </c:out></th>
	   						<th> <c:out value = "${userList[i-1].getApellido()}"> </c:out></th>
	   						<th> <c:out value = "${userList[i-1].getRut()}"></c:out></th>
	   						<th> <c:out value = "${userList[i-1].getCargo()}"> </c:out></th>
	   						<td> <button type="button" class="btn btn-warning"><a href="/usuarios/editar/${userList[i-1].getId()}">Edit</a></button>
							<button type="button" class="btn btn-danger"><a href="/usuarios/eliminar/${userList[i-1].getId()}">Delete</a></button></td>
	   					</tr>
	   			   	</c:forEach>
				 </tr>
				</tbody>
			</table>	
			
	
</body>
</html>