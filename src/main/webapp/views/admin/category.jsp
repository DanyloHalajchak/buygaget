
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddCategory</title>
</head>
<body>

<div class="container">
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<div class="row">
		<h1>AddCategory</h1>
			<div class="row">
				<form:form modelAttribute="category" method="post" action="/category">
					<form:input path="categoryName" type="text" class="form-control" placeholder="CategoryName"></form:input>
					<button type="submit">AddCategory</button>
				</form:form>
				<%--<form action="/category" method="post">--%>
					<%--<input type="text" name="CategoryName" class="form-control" placeholder="CategoryName">--%>
					 <%--<button type="submit" class="btn btn-primary">AddCategory</button>--%>
				<%--</form>--%>
			</div>
		</div>
	</div>
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<h1>Category:</h1>
		<div class="row">
			<table  class="table table-striped">
				<tr class="info">
					<td>CategoryName</td>
					<td>delet</td>
				<tr>
				<c:forEach var="category" items="${categorys}">
					<tr>
						<td>${category.categoryName}</td>
						<td><a href="/deletcategory/id=${category.id}">delet</a></td>
					<tr>
				</c:forEach>
			</table>
		</div>
	</div>
</div>

</body>
</html>