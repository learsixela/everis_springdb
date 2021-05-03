<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hey</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="css/style.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
<script>
$(document).ready(function() {
       $(document).on('click', 'button',function(){
	    	if($(this).attr('id')!=null && $.isNumeric($(this).attr('id'))){
	    		$("#idEdit").val($(this).attr('id'));
	    	}
	    });
})
</script>

</head>
<body>
	<h5 class="mt-4" style="text-align:center">Peliculas</h5>
	<form action="/dpeliculas/agregar" method="POST" class="main-form needs-validation" style="width:500px; margin:auto"novalidate>
    <div class="form-group">
        <label for="nombre">Nombre de película</label>
        <input type="text" name="nombre" id="nombre" class="form-control">
    </div>
    <div class="form-group">
        <label for="password">Categoría</label>
        <input type="text" name="categoria" id="categoria" class="form-control">
    </div>
    <div class="form-group">
        <label for="precio">Precio arriendo</label>
        <input type="number" name="precio" id="precio" class="form-control">
    </div>
    <br>
    <div class="row justify-content-center">
        <input type="submit" class="btn btn-primary" value="Agregar pelicula">
    </div>
    </form>
    
    <br>
    <hr>
    <div class="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form p-4">
    <table class="table">
    	<thead class="thead-light">
    		<tr>
    			<th>Nombre</th>
    			<th>Categoría</th>
    			<th>Precio</th>
    			<th>Acciones</th>
    		</tr>
    	</thead>
    	<tbody>
    		<c:forEach var = "pelicula" items="${movies}">
    		<tr>
    			<td><c:out value="${pelicula.nombre}"></c:out></td>
    			<td><c:out value="${pelicula.categoria}"></c:out></td>
    			<td><c:out value="${pelicula.precio}"></c:out></td>
    			<td><button type="button" class="btn btn-success" id='${pelicula.id}'data-bs-toggle="modal" data-bs-target="#editModal"><i class="fas fa-edit"></i></button>
           			 <a type="button" class="btn btn-danger" href='/dpeliculas/eliminar/${pelicula.id}'><i class="far fa-trash-alt"></i></a></td>
    		</tr>
    		</c:forEach>
    	</tbody>
    </table>
   	</div>
   	
   	
<form action="dpeliculas/actualizar/" method="POST">
<div class="modal fade" id="editModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog  modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Formulario de modificación</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      <div class="form-group">
             <label for="idEdit">ID (No modificable)</label>
             <input type="text" id="idEdit" name="idEdit" class="form-control" readonly>
             <br>
		 	<div class="form-group">
             <label for="nombreEdit">Ingrese nuevo nombre</label>
             <input type="text" id="nombreEdit" name="nombreEdit" class="form-control">
             <br>
         	 </div>
          	<div class="form-group">
              <label for="categoriaEdit">Ingrese nueva categoria</label>
              <input type="text" id="categoriaEdit" name=categoriaEdit class="form-control" >
              <br>
         	 </div>
          	<div class="form-group">
              <label for="precioEdit">Ingrese nuevo precio</label>
              <input type="text" id="precioEdit" name="precioEdit" class="form-control" >
              <br>
          	</div>  
	</div>
      <div class="modal-footer">
        <input type="submit" class="btn btn-primary" value="Modificar">
      </div> 
    </div>
  </div>
 </div>
</div>
</form>
</body>
</html>