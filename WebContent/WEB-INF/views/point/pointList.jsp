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
	<h1>point list</h1>
	
	<div class="container">
			<div class="row">
				<table class="table table-hover">
					<tr>
						<th>번호</th>
						<th>이름</th>
						<th>평균</th>
					</tr>
					<c:forEach items="${requestScope.list}" var="dto"><!-- requestScope 생략가능 -->
					<tr>
						<td>${dto.num}</td>
						<td><a href="./pointSelect?num=${dto.num}">${dto.name}</a></td>
						<td>${dto.avg}</td>
					</tr>
					</c:forEach>
				</table>
				
				<a href= "./pointAdd" class="btn btn-primary">point add</a>
				
			</div>	
	</div>
		
</body>
</html>