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
  <h2>Point Update</h2>
  <form action="./pointMod" method="post"><!-- DB에 보내기 -->
    
    
       <div class="form-group">
      <label for="kor">Kor:</label>
      <input value="${dto.kor}" type="text" class="form-control" id="kor" placeholder="Kor" name="kor">
    </div>
    
       <div class="form-group">
      <label for="eng">Eng:</label>
      <input value="${dto.eng}" type="text" class="form-control" id="eng" placeholder="Eng" name="eng">
    </div>
    
       <div class="form-group">
      <label for="math">Math:</label>
      <input value="${dto.math}" type="text" class="form-control" id="math" placeholder="Math" name="math">
    </div>
    
       <div class="form-group">
      <label for="num">Num:</label>
      <input value="${dto.num}" readonly="readonly" type="text" class="form-control" id="num" placeholder="Num" name="num">
    </div>
   
 	<input type="submit" class="btn btn-default" value="Submit">
    <button type="submit" class="btn btn-default">Submit</button>
    
  </form>
</div>
</body>
</html>