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
  <h2>Point Input</h2>
  <form action="./pointAdd" method="post"><!-- DB에 보내기 -->
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Name" name="name">
    </div>
    
       <div class="form-group">
      <label for="num">Num:</label>
      <input type="text" class="form-control" id="num" placeholder="Num" name="num">
    </div>
    
       <div class="form-group">
      <label for="kor">Kor:</label>
      <input type="text" class="form-control" id="kor" placeholder="Kor" name="kor">
    </div>
    
       <div class="form-group">
      <label for="eng">Eng:</label>
      <input type="text" class="form-control" id="eng" placeholder="Eng" name="eng">
    </div>
    
       <div class="form-group">
      <label for="math">Math:</label>
      <input type="text" class="form-control" id="math" placeholder="Math" name="math">
    </div>
   
 	<input type="submit" class="btn btn-default" value="Submit">
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

	<h1>point add</h1>
</body>
</html>