package task_itcaststore.web.servlet.manager;

import task_itcaststore.domain.Notice;
import task_itcaststore.service.NoticeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 *	后台根据id查询公告的Servlet
 */
@WebServlet(name = "FindNoticeByIdServlet",urlPatterns = {"/manager/findNoticeById"})
public class FindNoticeByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService service = new NoticeService();
		String n_id = request.getParameter("id").trim();

		Notice notice = service.findNoticeById(n_id);
		request.setAttribute("notice", notice);

		request.getRequestDispatcher("/admin/notices/edit.jsp").forward(request, response);
	}
}
