<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="webjars/bootstrap/4.5.2/css/bootstrap.min.css" media="all" />
<link rel="stylesheet" href="css/style.css" media="all" />
</head>
<body>

	<main class="container">
		<table class="table">
			<thead>
				<th>ID</th>
				<th>NICK</th>
				<th>FIRSTNAME</th>
				<th>LASTNAME</th>
			</thead>
			
			<tbody>
				<c:forEach items="${players}" var="player">
				<tr>
					<td>${player.id}</td>
					<td>${player.nick }</td>
					<td>${player.firstName }</td>
					<td>${player.lastName }</td>
				</tr>
				</c:forEach>
			</tbody>
			
		</table >
	</main >
	



	<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.5.2/bootstrap.min.js"></script>
	<script src="js/basic.js"></script>
	
</body>
</html>