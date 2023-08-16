<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>   

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Candidate Evaluation Application - Feedback List</title>
				<link href="<core:url value="/candEvalApp/resources/css/bootstrap.min.css"/>" rel="stylesheet"/>
		<link href="<core:url value="/candEvalApp/resources/css/bootstrap-icons.css"/>" rel="stylesheet"/>
		
		<link href="<core:url value="/candEvalApp/resources/css/main.css"/>" rel="stylesheet"/>
		<script src="<core:url value="/candEvalApp/resources/js/bootstrap.bundle.min.js"/>"></script>
		

		  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
		
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<!-- <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 -->	
		<style type="text/css">
			body {
			FONT-SIZE: 14px;
					    FONT-STYLE: normal;
					    FONT-FAMILY: Arial;
				    line-height: 150%;}
		</style>
	</head>
	
	<body>
		
		
		<!-- Start of Navbar -->
		
		<nav class="navbar navbar-expand-lg navbar-color" style="font-family: Aerial;">
			<div class="container-fluid">
			
				<a class="navbar-brand" href="/candidateEvaluationApplication/candEvalApp/candidate/candidate-list">
					<img src="<core:url value= "/candEvalApp/resources/images/logo/eviden-logo-orange.png"/>"  
						style="width: 150px; margin: 0px 60px"/>
				</a>
				<button class="navbar-toggler"
			          type="button"
			          data-bs-toggle="collapse"
			          data-bs-target="#navbarNav"
			          aria-controls="navbarNav"
			          aria-expanded="false"
			          aria-label="Toggle navigation">
			          	<span class="navbar-toggler-icon"></span>
				</button>
				
				<div class="collapse navbar-collapse" id="navbarNav" style="font-size: 16px; font-weight: bold;">
					<ul class="navbar-nav">
					
						<li class="nav-item">
							<a class="nav-link active" aria-current="page" 
								href="/candidateEvaluationApplication/candEvalApp/candidate/candidate-list">
								Home
							</a>
						</li>
						
						<li class="nav-item">
							<a class="nav-link" 
								href="/candidateEvaluationApplication/candEvalApp/candidate/candidate-list">
								Candidate
							</a>
						</li>
						
						<li class="nav-item">
							<a class="nav-link" href="/candidateEvaluationApplication/candEvalApp/feedback/feedback-list">
								Feedback
							</a>
						</li>
						
						<!-- Reports start -->
					
						
											 <!-- Reports dropdown -->
					            <li class="nav-item dropdown">
					                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownReports" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					                    Reports
					                </a>
					                <ul class="dropdown-menu" aria-labelledby="navbarDropdownReports">
					                    <!-- Levels dropdown -->
					                    <li class="dropdown-submenu">
					                        <a class="dropdown-item dropdown-toggle" href="#" id="navbarDropdownLevels" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					                            Levels
					                        </a>
					                        <ul class="dropdown-menu dropdown-menu-start" aria-labelledby="navbarDropdownLevels">
												<li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReortByLevel/L1" download> Level 1 (L1)</a></li>
					                            <li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReortByLevel/L2" download> Level 2 (L2)</a></li>
					                            <li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReortByLevel/L3" download> Level 3 (L3)</a></li>
					                        </ul>
					                    </li>
					                    <!-- Levels report end -->
					                    
					                    <!-- Evaluators start -->
					                    <li class="dropdown-submenu">
					                        <a class="dropdown-item dropdown-toggle" href="#" id="navbarDropdownLevels" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					                         Evaluator(s)
					                        </a>
					                        <ul class="dropdown-menu dropdown-menu-start" aria-labelledby="navbarDropdownLevels">
												<li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Mohan Kumar" download> Mohan Kumar</a></li>
					                            <li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Shalini Deshmukh"download> Shalini Deshmukh</a></li>
												<li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Rahul Reddy" download> Rahul Reddy</a></li>
					                            <li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Divya Sharma" download> Divya Sharma</a></li>				                            
					                        </ul>
					                    </li>
					                    
					                    <!-- Evaluators end -->
					                    
					                    <!-- Selection Status start -->
					                    <li class="dropdown-submenu">
					                        <a class="dropdown-item dropdown-toggle" href="#" id="navbarDropdownLevels" role="button" data-bs-toggle="dropdown" aria-expanded="false">
					                         Selection Status
					                        </a>
					                        <ul class="dropdown-menu dropdown-menu-start" aria-labelledby="navbarDropdownLevels">
												<li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReportByStatus/Selected" download> Selected</a></li>
					                            <li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReportByStatus/Not Selected" download> Not Selected</a></li>
					                        </ul>
					                    </li>
					                    
					                    <!-- Selection Status end -->
					                    
					                </ul>
					            </li>
						
				             			
				             <!-- Reports end -->
				             
				       </ul>
				</div>
				
				<div class="d-flex" style="font-size: 16px; font-weight: bold;">
					
					<div class="dropdown ft-color">
					
					Welcome
					
						<button class="btn btn-eviden dropdown-toggle"
					              type="button"
					              data-bs-toggle="dropdown"
					              aria-expanded="false">
					              ${current_employee.empName}
						</button>
						
						<ul class="dropdown-menu">
						
							<li>
								<a class="dropdown-item" href="/candidateEvaluationApplication/candEvalApp/logout">
									Logout
								</a>
							</li>
						
						</ul>
						
						<core:if test="${current_employee == null}">
							<jsp:forward page="index.jsp"></jsp:forward>
						</core:if>
					
					</div>
				
				</div>
				
			</div>
		</nav>
		
		<!-- End of Navbar -->
		
		<!-- Start of Search bar -->
		
		<div class="container my-2">
		
			<form action="/candidateEvaluationApplication/candEvalApp/candidate/candidate-search"
				method="post"
				style="width:75%;">
			
				<div class="row my-3">
				
					<div class="col-10">
					
						<input type="search"
				              name="candidateName"
				              placeholder="Enter candidate name"
				              class="form-control"/>
				       
					
					</div>
					
					<div class="col-2">
					
						<input type="submit" 
							value = "Search"
							class="btn btn-eviden"
							Style = "border-color: #ff6d43;"
						/>
					
					</div>
				
				</div>
			
			</form>
			
			<!-- End of Search bar -->
		
		
			
			<!-- Start Add New Candidate button  
			<a class="btn btn-outline-primary"
				href="/candidateEvaluationApplication/candEvalApp/feedback/feedback-form">
				Add New Feedback
			</a>
			
			<!-- End Add New Candidate button -->
			
		  <div>
		 	<h3 style="FONT-FAMILY: Arial; text-align: left;
					    color: #FFFFFF;
					    font-weight: bold;
					    padding: 3px;
					    padding-left: 4px;
					    vertical-align: middle;
					    background-color: #002d3c;
					    border: solid 0px #FFFFFF;"> Feedback List</h3>
		 	
		 	<div class= "col">
		 	<table class="table table-bordered">
		 	
		 		<tr style="empty-cells: show;
						    border-collapse: collapse;
						    FONT-STYLE: normal;
						    FONT-FAMILY: Arial;
						    line-height: 150%;
						    color: #000000;
						    font-weight: bold;
						    padding: 1px;
						    vertical-align: middle;
						    background-color: #CCCCCC;
						    border: solid 1px #FFFFFF;
						    font-size: 14px;
						    padding-left: 4px;" >
					<th>Feedback ID</th> 
					<th>Candidate Id</th>
					<th>Candidate Name</th>
					<th>Candidate Screening Level</th>
					<th>Candidate Status</th>
					<th>Comment</th>
					<th>Feedback Date</th>
					<!-- <th>Evaluator Id</th> -->
					<th>Evaluator Name</th>
				</tr>
		 		<core:forEach var="feedback" items="${fbList}">
		 	
					<tr>
						<td>${feedback.feedbackId}</td> 
						<td>${feedback.feedbackCandidate.candidateId}</td>
						<td>${feedback.feedbackCandidate.candidateName}</td>
						<td>${feedback.feedbackScreeningLevel}</td>
						<td>${feedback.feedbackStatus}</td>
						<td>${feedback.feedbackComment}</td>
						<td>${feedback.feedbackDatetime}</td>
						<%-- <td>${feedback.feedbackEvalutor.empId}</td> --%>
						<td>${feedback.feedbackEvalutor.empName}</td>
					</tr>	 	
		 		<!--  <p>
		 			${feedback.feedbackId} 
		 			<br/>
		 			${feedback.feedbackCandidate.candidateId}
		 			${feedback.feedbackCandidate.candidateName}
		 			<br/>
		 			${feedback.feedbackEvalutor.empId}
		 			${feedback.feedbackEvalutor.empName}
		 		</p>-->	
		 	</core:forEach>
		 	</table>
		 	</div>
		 </div>
	</div>
	
	<script>
		    // Initialize nested dropdowns
		    $(document).ready(function () {
		        $('.dropdown-submenu a.dropdown-toggle').on("click", function (e) {
		            $(this).next('ul').toggle();
		            e.stopPropagation();
		            e.preventDefault();
		        });
		    });
		</script>

	</body>
</html>