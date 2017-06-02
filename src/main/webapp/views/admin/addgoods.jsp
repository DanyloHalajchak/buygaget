 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title>AddGoods</title>

<div class="container">
	<div class="col-lg-offset-3 col-lg-6" align="center">
	<div class="row">
	<h1>AddGoods</h1>
		<form:form modelAttribute="oneGoods" action="/addgoods" method="post">
			<form:input type="text" path="name" class="form-control"  placeholder="GoodsName"></form:input>
			<form:input type="text" path="price" class="form-control"  placeholder="GoodsPrice"></form:input>
			<span style="color: white; font-size: 22px;background-color: #cf5f5fb3;">${AmoustExeption.toLowerCase()}</span>
			<form:input type="text" path="amoust" class="form-control"  placeholder="GoodsAmoust"></form:input>
			<form:select path="color" items="${colors}" itemLabel="clorName" itemValue="id" class="form-control"  ></form:select>
			<form:select path="category" items="${categorys}" itemLabel="categoryName" itemValue="id" class="form-control"></form:select>
			<form:select path="brend" items="${brends}" itemLabel="nameBrend" itemValue="id" class="form-control"></form:select>
			<%--<form:button type="submit" class="btn btn-primary">AddGoods</form:button>--%>
			<button type="submit">AddGoods</button>
		</form:form>
		<%--<form action="/addgoods" method="post"  >--%>
		<%----%>
			<%--<input type="text" name="GoodsName" class="form-control"  placeholder="GoodsName">--%>
			<%--<br>--%>
			<%--<input type="text" name="GoodsAmoust" class="form-control"  placeholder="GoodsAmoust">--%>
			<%--<br>--%>
			<%--<input type="text" name="GoodsPrice" class="form-control"  placeholder="GoodsPrice">--%>
			<%--<br>--%>
			<%--<select class="form-control" name="brend">--%>
				<%--<option  selected="selected" disabled="disabled">select brend</option>--%>
				<%--<c:forEach var="b" items="${brends}">--%>
					<%--<option value="${b.id}">${b.nameBrend}</option>--%>
				<%--</c:forEach>--%>
				<%----%>
			<%--</select>--%>
			<%--<br>--%>
			<%--<select name="categorys" class="form-control">--%>
				<%--<option  selected="selected" disabled="disabled">select category</option>--%>
				<%--<c:forEach var="category" items="${categorys}">--%>
					<%----%>
					<%--<option value="${category.id}">${category.categoryName}</option>--%>
				<%--</c:forEach>--%>
			<%--</select>--%>
			<%--<br>--%>
			<%--<select name="colors" class="form-control">--%>
			<%--<option selected="selected" disabled="disabled" >select color</option>--%>
				<%--<c:forEach var="color" items="${colors}">--%>
					<%--<option value="${color.id}">${color.clorName}</option>--%>
				<%--</c:forEach>--%>
			<%--</select>--%>
			 <%--<button type="submit" class="btn btn-primary">AddGoods</button>--%>
		<%--</form>--%>
	
	</div>
	</div>
	<div class="col-lg-12" align="center">
	<div class="row">
<h1>Goods:</h1>
	<table class="table table-striped">
	<tr class="info">
			 	<td>GoodsName</td>
			 	<td>GoodsAmoust</td>
			 	<td>GoodsPrice</td>
			 	<td>nameBrend</td>
			 	<td>nameCategory</td>
			 	<td>nameColor</td>
			 	<td>Delet</td>
			 	<td>Update</td>
			 </tr> 
		<c:forEach var="goods" items="${goods}">



			 <tr>
			 	<td>${goods.name}</td>
			 	<td>${goods.amoust}</td>
			 	<td> ${goods.price}</td>
			 	<td> ${goods.brend.nameBrend}</td>
			 	<td> ${goods.category.categoryName}</td>
			 	<td> ${goods.color.clorName}</td>
			 	<td><a href="/deletgoods/id=${goods.id}">Delet</a></td>
			 	<td><a href="/updateGoods/id=${goods.id}">Update</a></td>
			 </tr> 
		</c:forEach>
	</table>
	</div>
	</div>
</div>
