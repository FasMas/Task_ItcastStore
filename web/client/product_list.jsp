<%@ page import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>bookStore列表</title>
	<%--导入css --%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/client/css/main.css" />
</head>
<body class="main">
	<jsp:include page="head.jsp" />
	<jsp:include page="menu_search.jsp" />
	<div id="div-page-content">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td>
					<div style="text-align:right; margin:5px 10px 5px 0">
						<a href="${pageContext.request.contextPath }/index.jsp">首页</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;
						${bean.category}
						&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;
						图书列表
					</div>
					<table cellspacing="0" class="list-content">
						<tr>
							<td>
								<h1>商品目录</h1>
								<hr />
								<h1>${bean.category}</h1>&nbsp;&nbsp;&nbsp;&nbsp;共${bean.totalCount}种商品
								<hr />
								<div style="margin-top:20px; margin-bottom:5px">
									<img src="${pageContext.request.contextPath }/client/images/productlist.gif" width="100%" height="38" />
								</div>

								<table cellspacing="0" class="book-list">
									<tr>
										<c:forEach items="${bean.productList}" var="p" varStatus="vs">
											<td>
												<div class="div-book-pic">
													<p>
														<a href="${pageContext.request.contextPath}/findProductById?id=${product.id}">
															<img src="${pageContext.request.contextPath}${product.imgUrl}" width="115" height="129" border="0" />
														</a>
													</p>
												</div>
												<div class="div-list-title">
													<a href="${pageContext.request.contextPath}/findProductById?id=${product.id}">书名： ${product.name}<br>售价：￥${product.price} </a>
												</div>
											</td>
										</c:forEach>
									</tr>
								</table>
								<div class="pagination">
									<ul>
										<c:if test="${bean.currentPage!=1}">
											<li class="disable-page_p">
												<a class="disable-page_a" href="${pageContext.request.contextPath}/showProductsByPage?currentPage=${bean.currentPage-1}&category=${bean.category}"></a>
											</li>
										</c:if>
										<c:if test="${bean.currentPage==1}">
											<li class="disable-page_p2"></li>
										</c:if>
										<c:forEach begin="1" end="${bean.totalPage}" var="pageNum">
											<c:if test="${pageNum==bean.currentPage}">
												<li class="current-page">${pageNum }</li>
											</c:if>
											<c:if test="${pageNum!=bean.currentPage}">
												<li><a href="${pageContext.request.contextPath}/showProductsByPage?currentPage=${pageNum}&category=${bean.category}">${pageNum}</a>
												</li>
											</c:if>
										</c:forEach>

										<c:if test="${bean.currentPage==bean.totalPage||bean.totalPage==0}">
											<li class="disable-page_n2"></li>
										</c:if>
										<c:if test="${bean.currentPage!=bean.totalPage&&bean.totalPage!=0}">
											<li class="disable-page_n">
												<a class="disable-page_a" href="${pageContext.request.contextPath}/showProductsByPage?currentPage=${bean.currentPage+1}&category=${bean.category}"></a>
											</li>
										</c:if>
									</ul>
								</div>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
	<jsp:include page="foot.jsp" />
</body>
</html>
