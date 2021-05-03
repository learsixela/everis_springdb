<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
</head>
<body>
	<div class="container col-md-6">
		<div class="row">
			<h3>Actualizar perro</h3>
		</div>
		<div class="row">
			<form:form class="form mt-3" action="/perros/update" method="POST"
				modelAttribute="perro">
				<form:hidden path="id"/>
				<div class="mb-3">
					<form:label path="nombre" class="form-form:label">Nombre</form:label>
					<form:input type="text" class="form-control" id="name"
						path="nombre" />
				</div>
				<div class="mb-3">
					<form:label path="raza" class="form-form:label">Raza</form:label>
					<form:input type="text" class="form-control" id="email" path="raza" />
				</div>
				<div class="mb-3">
					<form:label path="edad" class="form-form:label">Edad</form:label>
					<form:input type="number" class="form-control" id="name"
						path="edad" />
				</div>
				<div class="form-group">
					<button type="submit" class="btn btn-primary btn-block">Enviar</button>
				</div>

			</form:form>
		</div>
	</div>
</body>
</html>