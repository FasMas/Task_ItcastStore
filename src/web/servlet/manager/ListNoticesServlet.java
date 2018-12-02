package task_itcaststore.web.servlet.manager;

import task_itcaststore.domain.Notice;
import task_itcaststore.service.NoticeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

/**
 *	后台查询所有公告的Servlet
 */
@WebServlet(name = "ListNoticesServlet",urlPatterns = {"/manager/listNotice"})
public class ListNoticesServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService service = new NoticeService();
		List<Notice> noticeList = service.findAllNotices();

		request.setAttribute("notices", noticeList);
		request.getRequestDispatcher("/admin/notices/list.jsp").forward(request, response);
	}
}
