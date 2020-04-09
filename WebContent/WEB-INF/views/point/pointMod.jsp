<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- bootstrap API -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- bootstrap API -->

</head>
<body>
<!-- nav -->
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="${pageContext.request.contextPath}">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="${pageContext.request.contextPath}/point/pointAdd">Point</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  
  
<div class="container">
  <h3>Right Aligned Navbar</h3>
  <p>The .navbar-right class is used to right-align navigation bar buttons.</p>
</div>
<!-- nav -->

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