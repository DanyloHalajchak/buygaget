<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>


	<form action="/updateGoods/id=${goods.id}"  method="post">
		<input name="GoodsId" disabled="disabled" value="${goods.id}">
		<br> 
		<input type="text" name="GoodsName" class="form-control" value="${goods.name}" placeholder="GoodsName">
		<br>
		<input type="text" name="GoodsAmoust" class="form-control" value="${goods.amoust}" placeholder="GoodsAmoust">
		<br>
		<input type="text" name="GoodsPrice" class="form-control" value="${goods.price}" placeholder="GoodsPrice">
		<br>

		<button type="submit">UpdateGoods</button>
	</form>
	<a href="/updateGoods/id=${goods.id}">Reset to default</a>

	
	</div>
	
</body>
</html>