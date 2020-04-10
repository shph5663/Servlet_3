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

	<h1>point select</h1>
	<div class="container">
			<div class="row">
			
				<table class="table table-hover">
					<tr>
						<th>번호</th><th>이름</th><th>국어</th><th>영어</th><th>수학</th>
						<th>총점수</th><th>평균</th>
					</tr>
					<tr>
						<th>${dto.num}</th><th>${dto.name}</th><th>${dto.kor}</th><th>${dto.eng}</th><th>${dto.math}</th>
						<th>${dto.total}</th><th>${dto.avg}</th>
					</tr>
				</table>
				<a href="./pointMod?num=${dto.num}" class="btn btn-primary">Update</a>
				<a href="./pointDelete?num=${dto.num}" class="btn btn-danger">Delete</a>
			</div>
	</div>
	
</body>
</html>