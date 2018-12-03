<%@ page  pageEncoding="UTF-8"%>

<html>
<head>
	<title>电子书城</title>
	<link rel="stylesheet" href="css/main.css" type="text/css" />
	<script src="https://cdn.staticfile.org/jquery/3.3.1/jquery.min.js"></script>
	<script src="js/changeSecond.js"></script>
</head>

<body class="main" onload="changeSecond()">
	<jsp:include page="head.jsp" />
	<jsp:include page="menu_search.jsp" />
	<div id="div-content">
		<table width="850px" border="0" cellspacing="0">
			<tr>
				<td style="padding:30px; text-align:center">
					<table width="60%" border="0" cellspacing="0" style="margin-top:70px">
						<tr>
							<td style="width:98px">
								<img src="images/IconText_WebDev_009.jpg" width="128" height="128" />
							</td>
							<td style="padding-top:30px">
								<span style="font-weight:bold; color:#FF0000">帐户激活成功</span><br> <br>
								<a href="${pageContext.request.contextPath }/index.jsp">
									<span id="second">5</span>秒后自动为您转跳回首页
								</a>
							</td>
						</tr>
					</table>
					<h1>&nbsp;</h1>
				</td>
			</tr>
		</table>
	</div>
	<jsp:include page="foot.jsp" />
</body>
</html>
