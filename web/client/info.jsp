<%@ page import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>
	<title>电子书城</title>
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
						&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath}/showProductsByPage?category=${product.category}">&nbsp;${product.category}</a>
						&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;${product.name}
					</div>
					<table cellspacing="0" class="info-content">
						<tr>
							<td><img src="${pageContext.request.contextPath }/client/ad/page_ad.jpg" width="900" height="84" />
								<table width="100%%" border="0" cellspacing="0">
									<tr>
										<td width="30%">
											<div class="div-bookcover">
												<p>
													<img src="${pageContext.request.contextPath}${product.imgUrl}" width="213" height="269" border="0" />
												</p>
											</div>
											<div style="text-align:center; margin-top:10px">
												<a href="${pageContext.request.contextPath}/addCart?id=${product.id}">
													<img src="${pageContext.request.contextPath }/client/images/buybutton.gif" border="0" width="100" height="25" />
												</a>
											</div>
										</td>
										<td style="padding:20px 5px 5px 5px">
											<img src="${pageContext.request.contextPath }/client/images/miniicon3.gif" width="16" height="16" />
											<span class="book-name">&nbsp;${product.name}</span>
											<hr />售价：<span style="color: #FF0000; ">￥${product.price}</span>
											<hr /> 类别：${product.category }
											<hr />
											<p>
												<b>内容简介：</b>
											</p> ${product.description}
										</td>
									</tr>
								</table>
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
