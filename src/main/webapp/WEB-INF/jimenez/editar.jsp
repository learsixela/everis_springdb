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
		<form:form action="/cancion/actualizar/" method="POST" modelAttribute="cancion">
			<form:hidden path="id"/>
			
			<form:label path="nombreCancion">Nombre Cancion: </form:label>
			<form:input path="nombreCancion" />
			
			<br>
			
			<form:label path="nombreArtista">Nombre Artista: </form:label>
			<form:input path="nombreArtista" />
			<br>
			<input type="submit" value="Actualizar">
		</form:form>
	</div>
</body>
</html>