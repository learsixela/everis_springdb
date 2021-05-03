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
<title>Editar Mascota:</title>
</head>
<body>
	<div class="container">
		<form:form action="/mascota/actualizar/" method="POST" modelAttribute="mascota">
			<form:hidden path="id"/>
			
			<div class= row >
				<form:label path="nombre">Nombre: </form:label>
				<form:input path="nombre" />
		
		</div>
		<div class= row >

				<form:label path="tipo">Tipo: </form:label>

				<form:input path="tipo" />

		
		</div>
		<div class= row >

				<form:label path="raza">Raza: </form:label>

				<form:input path="raza" />

		
		</div>
		<div class= row >

			<form:label path="edad">Edad: </form:label>

					<form:input path="edad" />

		
		</div>
		<br>
		<br>
		<div class= row >
					<input type="submit" value="Actualizar" class="btn btn-success">
		</div>
			
				

		</form:form>
	</div>
</body>
</html>