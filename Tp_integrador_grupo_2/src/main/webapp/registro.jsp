<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registro </title>
</head>

	<body>
	<h3> Registro </h3>
		<form>
			<div>
				<label for='nombre'>Nombre</label>
				<input name='nombre' type='text' placeholder='nombre'>
				
				<label for='apellido'>Apellido</label>
				<input name='apellido' type='text' placeholder='apellido'>
			</div>
			
			<div>
				<select>
					<option value='1'> Masculino </option>
					<option value='2'> Femenino </option>
					<option value='3'> Otro </option>
				</select>
			</div>
		
			<div>
				<label for='edad'>Edad</label>
				<input name='edad' type='number' placeholder='edad'>
			</div>
			
			<div>
				<label for='dni'>DNI</label>
				<input name='dni' type='number' placeholder='dni'>
				
				<label for='cuil'>CUIL</label>
				<input name='cuil' type='number' placeholder='cuil'>
			</div>
			
			<div>
				<select>
					<option value='1'>Almagro</option>
					<option value='2'> Atacama </option>
					<option value='3'> Boedo </option>
				</select>
				<select>
					<option value='1'> CABA </option>
					<option value='2'> Buenos Aires </option>
				</select>
			</div>
			
			<div>
				<label for='tel'>Tel�fono</label>
				<input name='tel' type='number' placeholder='Tel�fono'>
				
				<label for='tel2'>Segundo Tel�fono</label>
				<input name='tel2' type='number' placeholder='Tel�fono'>
			</div>
			
			<div>
				<label for='email'>Email</label>
				<input name='email' type='number' placeholder='Email'>
			</div>
		
		<div>
			<label for='usuario'>Usuario</label>
			<input name='usuario' 'placeholder='usuario'>
		</div>
	
		<div>
			<label for='pass'> Contrase�a </label>
			<input name='pass' type='password' placeholder='Contrase�a'>
			
			<label for='pass2'> Repetir Contrase�a </label>
			<input name='pass2' type='password' placeholder='Contrase�a'>
		</div>
		
		<div>
			<label for='Administrador'>�Administrador?</label>
			<input type='checkbox' name='Administrador'>
		</div>
		
		<input type='submit' value='Crear'>
		
		</form>
	</body>

</html>