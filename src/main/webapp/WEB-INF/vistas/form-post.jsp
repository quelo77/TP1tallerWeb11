<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	</head>
	<body>
	
    
    	<div class="container">
    
			<div  class="row">
					<div class="col-6 col-md-4"></div>
					<div class="col-6 col-md-4">
						<h1>Trabajo Pr&aacutectico nro.1 </h1>
						<form:form action="operaciones" method="POST" modelAttribute="formulario">
						<h3>Ingrese un texto:</h3>
						
			            <form:input path="texto" /><br/>		
				            <h3>Ingrese operaci&oacuten a realizar:</h3> 	           
				            <form:radiobutton  path="operacion"  name="gender" value="Pasar a mayuscula"/> Pasar a May&uacutescula<br>
				  			<form:radiobutton path="operacion" name="gender" value="Pasar a Minuscula"/> Pasar a Min&uacutescula<br>
				  			<form:radiobutton path="operacion" name="gender" value="Invertir orden del texto"/> Invertir orden del texto<br>
				  			<form:radiobutton path="operacion" name="gender" value="Cantidad de caracteres del texto"/> Cantidad de car&aacutecteres del texto<br/>
			     			<br/>
			     			<form:button class="btn btn-primary" type="submit">Aplicar</form:button>  
			            </form:form>
			           </div>
				<div class="col-6 col-md-4"></div>
	  		</div>
		</div>
		<div>
			<c:if test="${not empty error}">
				${error}
			</c:if>
		</div>
	</body>
</html>