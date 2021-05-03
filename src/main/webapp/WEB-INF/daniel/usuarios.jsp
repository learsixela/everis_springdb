<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<title>Usuarios</title>
</head>
<body>
		<div class="container">
				<form class="well form-horizontal" action="/usuario" method="POST">
				<fieldset>
		
				<!-- Form Name -->
				<legend><center><h2><b>REGISTRO DE USUARIOS</b></h2></center></legend><br>
				
				<!-- Text input-->
		
				<div class="form-group">
				  <label class="col-md-4 control-label">Nombre</label>  
				  <div class="col-md-4 inputGroupContainer">
				  	<div class="input-group">
				  		<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				 		 <input  type="text" id="nombre" name="nombre" placeholder="First Name" class="form-control">
				    </div>
				  </div>
				</div>
		
				<!-- Text input-->
		
			   <div class="form-group">
				  <label class="col-md-4 control-label" >Apellido</label> 
				    <div class="col-md-4 inputGroupContainer">
				    <div class="input-group">
				  			<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				  			<input type="text" id="apellido" name="apellido" placeholder="Last Name" class="form-control">
				    </div>
				  </div>
				</div>
		
				<!-- Text input-->
				
				<div class="form-group">
				  <label class="col-md-4 control-label" >Rut</label> 
				    <div class="col-md-4 inputGroupContainer">
				    <div class="input-group">
				  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
				  <input type="text" id="rut" name="rut" placeholder="DNI" class="form-control">
				    </div>
				  </div>
				</div>
		
			  <div class="form-group"> 
			  <label class="col-md-4 control-label">Department / Office</label>
			    <div class="col-md-4 selectContainer">
			    <div class="input-group">
			        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
			    <select name="cargo" class="form-control selectpicker" id="cargo">
			      <option value="" >Select your Department/Office</option>
			      <option value= "ingeniero_ti">Ingeniero TI</option>
			      <option value= "disenador_grafico">Dise�ador Grafico  </option>
			      <option value= "ingeniero_redes">Ingeniero Redes</option>
			      <option value= "ingeniero_soporte">Ingeniero Soporte</option>
			      <option value= "agile_coach">Agile Coach</option>
			      <option value= "product_owner">Product Owner</option>
			      <option value= "scrum_master">Scrum Master</option>
			      <option value= "jefe_desarrollo">Jefe de Desarrollo</option>
			      <option value= "desarrollador_software">Desarrollador de Software</option>
			    </select>
			  </div>
			  <br>
			  <input class="btn btn-success" type="submit" value="Guardar">
			  </form> <br><br>  
			 <form action="/tabla_usuarios">
				 <input  class="btn btn-warning" type="submit" value="Lista de Usuarios">
			 </form>
			 <br>
			 <form action="/producto">
				 <input  class="btn btn-warning" type="submit" value="Agregar Productos">
			 </form>
			</div>
		</div>
</body>
</html>