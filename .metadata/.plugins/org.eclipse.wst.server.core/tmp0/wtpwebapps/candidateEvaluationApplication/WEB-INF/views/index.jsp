<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>   
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1"/>
		<title>Candidate Evaluation Application - Log In</title>
		<link href="resources/css/bootstrap.min.css" rel="stylesheet"/>
		<link href="resources/css/bootstrap-icons.css" rel="stylesheet"/>
		<link href="resources/css/main.css" rel="stylesheet"/>
		<script type="resources/js/bootstrap.bundle.min.js"></script>
	</head>
	
	<body class="index">
		
		<div class="container-fluid">
		
			<div class="row welcome-title">
				<h1>Welcome to Candidate Evaluation Application</h1>
			</div>
			
			<div class="row">
				<div class="login-form">
					<core:if test="${error_message != null}">
						<div class="alert alert-danger">
							<span class="error">
								${error_message}							
							</span>
						</div>
					</core:if>
				
					<form action="/candidateEvaluationApplication/candEvalApp/login" method="post">
					
						<h4>
							<span>
								<img src="<core:url value = "/candEvalApp/resources/images/logo/favicon.ico"/>"/>
							</span>
							Login
						</h4>
						
						<div class="mb-3">
							<label for="empDasId" class="form-label">DAS ID</label>
							<input type="text" id="empDasId" name="empDasId" class="form-control"/>
						</div>
						
						<div class="mb-3">
							<label for="empPassword" class="form-label">Password</label>
							<input type="password" id="empPassword" name="empPassword" class="form-control"/>
						</div>
						<input type="submit" value="Login" class="btn btn-eviden" style=""/>
					
					</form>
					
					<br><br>
					
				</div>
			</div>
			
		</div>
			
	</body>
	
</html>