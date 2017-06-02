<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--//Using @ModelAtribute--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddPost</title>

<div class="container">
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<div class="row">
		<h1>AddPost</h1>
			<div class="row">
				<%--//Using @RequestParam--%>
				<%--<form action="/post" method="post">--%>
					<%--<input type="text" name="title"  class="form-control" placeholder="title">--%>
					<%--<textarea name="text" placeholder="Text" class="form-control" rows="7" ></textarea>--%>
					<%--<br>--%>
					<%--<h5>Tags</h5>--%>
					<%--<c:forEach var="tag" items="${tags}">--%>
						<%----%>
							<%--<input name="tags" type="checkbox" value="${tag.id}">${tag.tagName}--%>
						<%----%>
					<%--</c:forEach>--%>
					<%--<br>--%>
					<%--<h5>Goods</h5>--%>
					<%--<c:forEach var="goods" items="${goods}">--%>
						<%--<input name="goods" type="checkbox" value="${goods.id}">${goods.name}--%>
					<%--</c:forEach>--%>
					<%--<br>--%>
					 <%--<button type="submit" class="btn btn-primary">AddPost</button>--%>
				<%--</form>--%>
					<%--//Using @ModelAtribute--%>
				<form:form modelAttribute="post" action="/post" method="post">
					<form:input path="title" type="text"   class="form-control" placeholder="title" ></form:input>
					<form:textarea path="text" placeholder="Text" class="form-control" rows="7"></form:textarea>
					<form:select path="tags" items="${tags}" itemLabel="tagName" itemValue="id"></form:select>
					<form:checkboxes path="goods" items="${goods}" itemValue="id" itemLabel="name"></form:checkboxes>
					<button type="submit">AddPost</button>
				</form:form>

			</div>
		</div>
	</div>
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<h1>Post:</h1>
	</div>
	<c:forEach var="post" items="${posts}">
	<div class="container">
	<div class="col-lg-offset-3 col-lg-6" align="center">
		<div class="row">
			<h2>${post.title}<sup><a href="/deletpost/id=${post.id}">(delet)</a></sup></h2>
			<c:forEach var="tags" items="${post.tags}">
				<span>${tags.tagName}</span>
			</c:forEach>
			<br>
			<c:forEach var="goods" items="${post.goods}">
				<span>${goods.name}</span>
			</c:forEach>

			<p>
				${post.text}
			</p>
		</div>
	</div>
	</div>
	</c:forEach>
</div>
</div>