<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
 
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Candidate Evaluation Application - Feedback Form</title>
	
			<link href="<core:url value="/candEvalApp/resources/css/bootstrap.min.css"/>" rel="stylesheet"/>
		<link href="<core:url value="/candEvalApp/resources/css/bootstrap-icons.css"/>" rel="stylesheet"/>
		
		<link href="<core:url value="/candEvalApp/resources/css/main.css"/>" rel="stylesheet"/>
		<script src="<core:url value="/candEvalApp/resources/js/bootstrap.bundle.min.js"/>"></script>
		

		  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
		
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<!-- <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
 -->	
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
					                            <li><a class="dropdown-item bi bi-download" href="/candidateEvaluationApplication/candEvalApp/report/generateReportByEvaluator/Shalini Deshmukh" download> Shalini Deshmukh</a></li>
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
		
		
	
		<div class="container my-2" style="width:50%;">

   			<h3 style="FONT-FAMILY: Arial; text-align: left;
					    color: #FFFFFF;
					    font-weight: bold;
					    padding: 3px;
					    padding-left: 5px;
					    vertical-align: middle;
					    background-color: #002d3c;
					    border: solid 0px #FFFFFF;">Candidate Feedback Form</h3>

			<div class = "col" style="border:2px; empty-cells: show;
					border-collapse: collapse;
				    FONT-SIZE: 14px;
				    FONT-STYLE: normal;
				    FONT-FAMILY: Arial;
				    line-height: 150%;
				    background-color: #F4F4F4;
				    padding: 10px 10px 10px 10px;
				    vertical-align: top;">
			
   			<form action="/candidateEvaluationApplication/candEvalApp/feedback/feedback-save" method="post">

   				<div class="mb-3">

     				 <label for="feedbackDatetime" class="form-Label"><b>Feedback Date</b></label> <br>
       				 <input type="date" class="from-control" id="feedbackDatetime" name="feedbackDatetime" 
       				 style="width: 200px"
       				 required/>

   				</div>
   				
   				

   
			    <div class="mb-3">
				     <label for="feedbackEvalutor" class="form-Label"><b>Evaluator Name</b> </label><br>
				     <input type="hidden" name="feedbackEvalutorId" value="${current_employee.empId}" />	
				     <input type="text" class="from-control" id="feedbackEvalutor" value="${current_employee.empName}" readonly/>		
			   </div>
			   
			   <div class="mb-3">
				      <label for="feedbackScreeningLevel" class="form-Label"><b> Screening Level </b></label>	<br>		
				      <select name="feedbackScreeningLevel" id="feedbackScreeningLevel" class="form-select" required>			
				        <option value="">Select</option>			
				        <core:forEach var="value" items="${screeningLevels}">			
			           		<option value="${value}">${value}</option>			
				        </core:forEach>			
				      </select>         
				</div>
   
			   
			   <div class="mb-3">			
			      <label for="feedbackCandidate" class="form-Label"><b> Candidate Name</b></label>		<br>
			      <input type="hidden" name="feedbackCandidateId" value="${candidate.candidateId}" />			
			      <input type="text" class="from-control" id="feedbackCandidate"  value="${candidate.candidateName}" readonly />		
			   </div>
	   
	    
			   <div class="mb-3">		
			      <label for="feedbackStatus" class="form-label"><b>Status </b></label>		<br>
			      <select name="feedbackStatus" id="feedbackStatus" class="form-select" required>
			          <option value="">Select</option>		
			          <option value="Selected">Selected</option>		
			          <option value="Not selected"> Not Selected</option>		
			       </select>    		
			   </div>

      

		      <div class="mb-3">
		          <label for="feedbackComment" class="form-label"><b>Feedback Comment</b></label>	<br>
		          <textarea name="feedbackComment" id="feedbackComment" class="form-control"></textarea>	
		      </div>

			<div style="display: flex; justify-content: center;">
				        <input type="submit" value="Save" style="margin-right: 20px; width: 200px; font-weight: bold;"
				        		class="btn btn-outline-success"/>
				       <input type="reset" value="Reset" style="width: 200px; font-weight: bold;"
				       			class="btn btn-outline-primary"/>
			</div>
		</form>
		
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





 

