package task_itcaststore.web.servlet.client;

import task_itcaststore.exception.ActiveUserException;
import task_itcaststore.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * 用户激活的Servlet
 */
@WebServlet(name = "ActiveUserServlet",urlPatterns = {"/activeUser"})
public class ActiveUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.获取激活码
		String activeCode = request.getParameter("activeCode").trim();

		try {
			UserService service = new UserService();
			service.activeUser(activeCode);
			// 2.调用service中激活用户操作
			response.sendRedirect(request.getContextPath() + "/client/active_success.jsp");
		} catch(ActiveUserException e) {
			e.printStackTrace();
			response.getWriter().println("警告：用户激活失败！");
		}
	}
}
