

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>


<html>

<body>
	<div style="margin: 40px">
		<h1>Partients List</h1>
		
		<button type="button" class="btn btn-success" onclick="window.location.href = 'addPatient' ">Add +</button>

		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Full name</th>
					<th scope="col">Symptom</th>
					<th scope="col">MedicalID</th>
					<th scope="col"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${patients}" var="patient">
					<tr>

						<td>${patient.id}</td>
						<td>${patient.fullName}</td>
						<td>${patient.symptom}</td>
						<td>${patient.medicalID}</td>
						<td>
							<a class="btn btn-primary" href="edit?id=${patient.id}">Edit</a>
							<a onclick="return confirm('Bạn chắc chắc muốn xóa?')" class="btn btn-danger" href="delete?id=${patient.id}">Delete</a>
						</td>
						
					</tr>
				</c:forEach>


			</tbody>
		</table>




	</div>

</body>
</html>
