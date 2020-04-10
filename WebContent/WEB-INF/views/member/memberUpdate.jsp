<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="../tem/boot.jsp"></c:import>

</head>
<body>
<c:import url="../tem/header.jsp"></c:import>

	<div class="container">
		<div class="row">
			<form class="form-horizontal" action="./memberUpdate" method="post">
				<div class="form-group">
					<label for="id">ID:</label>
					<div class="col-sm-10">
						<input readonly="readonly" value="${sessionScope.member.id}" type="text" class="form-control" id="id" placeholder="Enter ID" name="id">
					</div>
				</div>
				
				<div class="form-group">
					<label  for="name">Name:</label>
					<div class="col-sm-10">
						<input readonly="readonly" value="${sessionScope.member.name}" type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
					</div>
				</div>
				
				<div class="form-group">
					<label for="email">Email:</label>
					<div class="col-sm-10">
						<input value="${sessionScope.member.email}" type="email" class="form-control" id="email" placeholder="Enter Email" name="email">
					</div>
				</div>				
				
				<div class="form-group">
					<label for="phone">Phone:</label>
					<div class="col-sm-10">
						<input value="${sessionScope.member.phone}" type="text" class="form-control" id="phone" placeholder="Enter Phone" name="phone">
					</div>
				</div>		
				
				<div class="form-group">
					<label for="age">Age:</label>
					<div class="col-sm-10">
						<input value="${sessionScope.member.age}" type="text" class="form-control" id="age" placeholder="Enter Age" name="age">
					</div>
				</div>				
						<button type="submit" class="btn btn-primary">Update</button>
				
			</form>		
			
		</div>
	</div>
</body>
</html>