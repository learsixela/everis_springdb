<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form:form action="/cpacheco/actualizar/" method="POST" modelAttribute="cpacheco">
			<form:hidden path="id"/>
			<form:label path="nombre">Nombre: </form:label>
			<form:input path="nombre" />
			<form:label path="apellido">Apellido: </form:label>
			<form:input path="apellido" />
			<br>
			<br>
			<input type="submit" value="Actualizar">
		</form:form>
	</div>
</body>
</html>