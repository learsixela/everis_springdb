<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Alumno::</title>
</head>
<body>
	<div>
		<form:form action="/alumno/actualizar/" method="POST" modelAttribute="alumno">
			<form:hidden path="id"/>
			<form:label path="nombre">Nombre: </form:label>
			<form:input path="nombre" />
			
			<br>
			<!--<form:label path="edad">Edad: </form:label>
			<form:input path="edad" />-->
			<br>
			<input type="submit" value="Actualizar">
		</form:form>
	</div>
</body>
</html>