<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar :</title>
</head>
<body>
	<div>
		<form:form action="/martinez/actualizar/" method="POST" modelAttribute="martinez">
			<form:hidden path="id"/>
			<form:label path="nombre">Nombre: </form:label>
			<form:input path="nombre" />
			<br>
			<br>
			<input type="submit" value="Actualizar">
		</form:form>
	</div>
</body>
</html>