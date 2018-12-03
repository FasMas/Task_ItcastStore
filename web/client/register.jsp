<%@ page import="java.util.*" pageEncoding="UTF-8"%>

<html>
<head>

<title>传智书城注册页面</title>
<%--导入css和js --%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/client/css/main.css" type="text/css"/>
<script src="${pageContext.request.contextPath}/client/js/checkForm.js"></script>
<script type="text/javascript">
	function changeImage() {
		//改变验证码图片中的文字
		document.getElementById("img").src = "${pageContext.request.contextPath}/imageCode?time="
				+ new Date().getTime();
	}
</script>
</head>

<body class="main">
<!-- 1.网上书城顶部 start -->
       <%@include file="head.jsp"%>
<!-- 网上书城顶部  end -->
<!--2. 网上书城菜单列表  start -->
       <%@include file="menu_search.jsp" %>
<!-- 网上书城菜单列表  end -->
<!-- 3.网上书城用户注册  start -->
	<div id="div-content">
		<form action="${pageContext.request.contextPath}/register" method="post" onsubmit="return checkForm();">
			<table width="850px" border="0" cellspacing="0">
				<tr>
					<td style="padding: 30px"><h1>新用户注册</h1>
						<table width="70%" border="0" cellspacing="2" class="upline">
							<tr>
								<td style="text-align: right; width: 20%">邮箱：</td>
								<td style="width: 40%">
								<input type="text" class="textInput" id="email" name="email" onkeyup="checkEmail();"/>
								</td>
								<td colspan="2"><span id="emailMsg"></span><span
										style="color: #999999; ">请输入有效的邮箱地址</span></td>
							</tr>
							<tr>
								<td style="text-align: right">用户名：</td>
								<td><input type="text" class="textInput" id="userName" name="userName" onkeyup="checkUsername();"/>
								</td>
								<td colspan="2"><span id="usernameMsg"></span><span style="color: #999999; ">字母数字下划线1到10位, 不能是数字开头</span></td>
							</tr>
							<tr>
								<td style="text-align: right">密码：</td>
								<td><input type="password" class="textInput" id="password" name="password" onkeyup="checkPassword();"/></td>
								<td><span id="passwordMsg"></span><span style="color: #999999; ">密码请设置6-16位字符</span></td>
							</tr>
							<tr>
								<td style="text-align: right">重复密码：</td>
								<td>
								<input type="password" class="textInput" id="repassword" name="repassword" onkeyup="checkConfirm();"/>
								</td>
								<td><span id="confirmMsg"></span>&nbsp;</td>
							</tr>
							<tr>
								<td style="text-align: right">性别：</td>
								<td colspan="2">&nbsp;&nbsp;
                                <input type="radio" name="gender" value="男" checked="checked" /> 男
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input type="radio" name="gender" value="女" /> 女
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td style="text-align: right">联系电话：</td>
								<td colspan="2">
								<input type="text" class="textInput"
									style="width: 350px" name="telephone" />
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td style="text-align: right">个人介绍：</td>
								<td colspan="2">
								<textarea class="textarea" name="introduce"></textarea>
								</td>
								<td>&nbsp;</td>
							</tr>
						</table>


						<h1>注册验证</h1>
						<table width="80%" border="0" cellspacing="2" class="upline">
							<tr>
								<td style="text-align: right; width: 20%">输入验证码：</td>
								<td style="width: 50%">
								<input type="text" class="textInput" />
								</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td style="text-align: right; width: 20%;">&nbsp;</td>
								<td rowspan="2" style="width: 50%">
								<img src="${pageContext.request.contextPath}/checkImage" width="180"
									 height="30" class="textInput" style="height: 30px;" id="img" />&nbsp;&nbsp;
									<a href="javascript:void(0);" onclick="changeImage()">看不清换一张</a>
								</td>
							</tr>
						</table>

						<table width="70%" border="0" cellspacing="0">
							<tr>
								<td style="padding-top: 20px; text-align: center">
									<input type="image" src="images/signup.gif" name="submit" border="0" width="140" height="35"/>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</div>

 <!-- 网上书城用户注册  end -->
<!--4. 网上书城下方显示 start -->
     <%@ include file="foot.jsp" %>
<!-- 网上书城下方显示 start -->
</body>
</html>