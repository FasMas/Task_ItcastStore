package task_itcaststore.web.servlet.client;
import task_itcaststore.exception.ActiveUserException;
import task_itcaststore.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
@SuppressWarnings("serial")
public class ActiveUserServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.获取激活码
		String activeCode = request.getParameter("activeCode");
		// 2.调用service中激活用户操作
		UserService service = new UserService();
		try {
			service.activeUser(activeCode);
			response.sendRedirect(request.getContextPath() + "/client/active_success.jsp");
			return;
		} catch (ActiveUserException e) {
			e.printStackTrace();
			response.getWriter().write(e.getMessage());
			return;
		}
	}
}
