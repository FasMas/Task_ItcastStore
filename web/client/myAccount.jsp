<%@ page contentType="text/html; charset=UTF-8" %>

<html>
<head>
	<title>电子书城</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/main.css"/>
	<script>
	//退出确认框
	function confirm_logout() {
	    var msg = "您确定要退出登录吗？";
	    if (confirm(msg)==true){
	    return true;
	    }else{
	    return false;
	    }
	}
	</script>
</head>
<body class="main">
	<jsp:include page="head.jsp" />
	<jsp:include page="menuSearch.jsp"/>
	<div id="div-page-content">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td width="25%">
					<table width="100%" border="0" cellspacing="0" style="margin-top:30px">
						<tr>
							<td class="list-title">我的帐户</td>
						</tr>
						<tr>
							<td class="list-td">
								<img src="${pageContext.request.contextPath}/client/images/icon1.png" width="15"
									 height="10"/>
								&emsp;
								<a href="${pageContext.request.contextPath}/client/modifyUserInfo.jsp">用户信息修改</a>
							</td>
						</tr>
						<tr>
							<td class="list-td">
								<img src="${pageContext.request.contextPath}/client/images/icon2.png" width="15"
									 height="10"/>
								&emsp;
								<a href="${pageContext.request.contextPath}/findOrderByUser">订单查询</a>
							</td>
						</tr>
						<tr>
							<td class="list-td">
								<img src="${pageContext.request.contextPath}/client/images/icon3.png" width="15"
									 height="10"/>
								&emsp;
								<a href="${pageContext.request.contextPath}/logout" onclick="return confirm_logout()">用户退出</a>
							</td>
						</tr>
					</table>
				</td>
				<td>
					<div style="text-align:right; margin:5px 10px 5px 0">
						<a href="${pageContext.request.contextPath}/index.jsp">首页</a>
						&emsp;&gt;&emsp;
						我的帐户&emsp;&gt;&emsp;欢迎
					</div>
					<table cellspacing="0" class="info-content">
						<tr>
							<td style="padding:20px"><p>
								<img src="${pageContext.request.contextPath}/client/images/myad.jpg" width="631"
									 height="436"/>
								</p>
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
