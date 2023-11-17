<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Patient</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>

</head>

<style>
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    
    .content {
        text-align: left;
        width: 50%;
    }
</style>

<body>

	<div class="content">
		<h1>This is add patient</h1>
	
		<form action="/patients/addPatientPost" method="POST">
		  <div class="mb-3">
		    <label for="fullName" class="form-label">FullName</label>
		    <input type="text" class="form-control" id="fullName" name="fullName">
		  </div>
		  
		  <div class="mb-3">
		    <label for="symptom" class="form-label">Symptom</label>
		    <input type="text" class="form-control" id="symptom" name="symptom">
		  </div>
		  
		  <div class="mb-3">
		    <label for="medicalID" class="form-label">MedicalID</label>
		    <input type="text" class="form-control" id="medicalID" name="medicalID">
		  </div>
		  
		
		  <button type="submit" class="btn btn-primary">Add +</button>
		</form>
	</div>

</body>
</html>