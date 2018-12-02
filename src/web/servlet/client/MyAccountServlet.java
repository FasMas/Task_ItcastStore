package task_itcaststore.web.servlet.client;

import task_itcaststore.domain.User;
import task_itcaststore.domain.enums.EUserType;
import task_itcaststore.utils.ext.StringExt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 我的账户页面的Servlet<br>
 * 点击前台系统中的【我的账户】，分以下两种情况：
 * <ol>
 *     <li>用户未登录，进入登录页面。</li>
 *     <li>用户已登录：<ol>
 *         <li>超级用户，进入到后台系统。</li>
 *         <li>普通用户，登录到我的账户。</li>
 *     </ol></li>
 * </ol>
 */
@WebServlet(name = "MyAccountServlet",urlPatterns = {"/myAccount"})
public class MyAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//在session中查找名为“user”的会话
		User user = (User) request.getSession().getAttribute("user");

		if(user == null) {
			//如果找到没有名为“user”的会话，说明用户没有登录，此时跳转到登录页面
			response.sendRedirect(request.getContextPath() + "/client/login.jsp");
		} else if(StringExt.equalsE(user.getType(), EUserType.Admin)) {
			//如果是超级用户，进入到网上书城后台管理系统
			response.sendRedirect(request.getContextPath() + "/admin/login/home.jsp");
		} else {
			//如果是普通用户，则进入到普通用户的账户信息页面
			response.sendRedirect(request.getContextPath() + "/client/myAccount.jsp");
		}
	}
}
