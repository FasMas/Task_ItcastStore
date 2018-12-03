<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="p" uri="http://www.itcast.cn/tag" %>

<html>
<head>
<title>电子书城</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/main.css"/>
</head>
<body class="main">
	<p:user />
	<jsp:include page="head.jsp" />
	<jsp:include page="menuSearch.jsp"/>
	<div id="div-page-content">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td width="25%">
					<table width="100%" border="0" cellspacing="0"
						style="margin-top:30px">
						<tr>
							<td class="list-title">我的帐户</td>
						</tr>
						<tr>
							<td class="list-td">
								<img src="${pageContext.request.contextPath}/client/images/icon1.png" width="15"
									 height="10"/>&emsp;
								<a href="${pageContext.request.contextPath}/client/modifyUserInfo.jsp">用户信息修改</a>
							</td>
						</tr>
						<tr>
							<td class="list-td">
								<img src="${pageContext.request.contextPath}/client/images/icon2.png" width="15"
									 height="10"/>&emsp;
								<a href="${pageContext.request.contextPath}/findOrderByUser">订单查询</a>
							</td>
						</tr>
						<tr>
							<td class="list-td">
								<img src="${pageContext.request.contextPath}/client/images/icon3.png" width="15"
									 height="10"/>&emsp;
								<a href="${pageContext.request.contextPath}/logout">用戶退出</a>
							</td>
						</tr>
					</table>
				</td>
				<td>
					<div style="text-align:right; margin:5px 10px 5px 0">
						<a href="${pageContext.request.contextPath}/index.jsp">首页</a>
						&emsp;&gt;&nbsp;&nbsp;&nbsp;
						<a href="${pageContext.request.contextPath}/client/myAccount.jsp">&nbsp;我的帐户</a>
						&emsp;&gt;&emsp;用户信息修改
					</div>
					<table cellspacing="0" class="info-content">
						<tr>
							<td>
								<table width="100%" border="0" cellspacing="2" class="upline">
									<tr>
										<td style="text-align:right; width:20%">会员邮箱：</td>
										<td style="width:40%; padding-left:20px">${user.email }</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td style="text-align:right">会员名：</td>
										<td style="padding-left:20px">${user.userName }</td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td style="text-align:right">修改密码：</td>
										<td><input type="password" class="textInput" /></td>
										<td><span style="color: #999999; ">密码设置至少6位，请区分大小写</span></td>
									</tr>
									<tr>
										<td style="text-align:right">重复密码：</td>
										<td><input type="password" class="textInput" /></td>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td style="text-align:right">性别：</td>
										<td colspan="2">&nbsp;&nbsp;
											<input type="radio" name="radiobutton" value="radiobutton" ${user.gender=='男'?'checked':'' }/> 男
											&emsp;&nbsp;&nbsp;&nbsp;
											<input type="radio" name="radiobutton" value="radiobutton"  ${user.gender=='女'?'checked':'' }/> 女
										</td>
									</tr>
									<tr>
										<td style="text-align:right">联系方式：</td>
										<td colspan="2">
											<input name="text2" type="text" value="${user.telephone}" class="textInput" />
										</td>
									</tr>
									<tr>
										<td style="text-align:right">&nbsp;</td>
										<td>&nbsp;</td>
										<td>&nbsp;</td>
									</tr>
								</table>
								<p style="text-align:center">
									<a href="${pageContext.request.contextPath}/client/myAccount.jsp">
										<img src="${pageContext.request.contextPath}/client/images/button_gif_025.gif"
											 border="0" width="140" height="35"/>
									</a>
								</p>
								<p style="text-align:center">&nbsp;</p>
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
