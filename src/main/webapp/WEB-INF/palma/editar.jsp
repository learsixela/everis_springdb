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
	<h2>Editar Celular</h2>
		<form:form action="/celular/actualizar/" method="POST" modelAttribute="celular">
			<form:hidden path="id"/>
			<form:label path="numero">Numero: </form:label>
			<form:input path="numero" />
			
			<br>
			<form:label path="marca">Marca: </form:label>
			<form:input path="marca" />
			<br>
			<input type="submit" value="Actualizar celular">
		</form:form>
	</div>
</body>
</html>