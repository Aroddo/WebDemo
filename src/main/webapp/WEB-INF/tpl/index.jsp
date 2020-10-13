<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="webjars/bootstrap/4.5.2/css/bootstrap.min.css" media="all" />
<link rel="stylesheet" href="css/style.css" media="all" />
</head>
<body>
	<h1>YO!</h1>
	
	<h2>
		${antwort}
	</h2> 
	<hr />
	<div style="width:80%;border:1px solid black;">
	
	<form action="add" method="post">
		<div class="form-group" >
		<input type="text" name="param1" class="form-control"/>
		</div>
		<div class="form-group" >
		<input type="text" name="param2" class="form-control"/>
		</div>
		
	
		<button type="submit" class="btn btn-info">submit</button>
	</form>
	
	</div>
	
	<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.5.2/bootstrap.min.js"></script>
	<script src="js/basic.js"></script>
	
</body>
</html>