package task_itcaststore.web.servlet.manager;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import task_itcaststore.domain.Notice;
import task_itcaststore.service.NoticeService;

/**
 *	后台查询所有公告的servlet
 */
public class ListNoticeServlet extends HttpServlet{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NoticeService nService = new NoticeService();
		List<Notice> notices = nService.getAllNotices();
		request.setAttribute("notices", notices);
		request.getRequestDispatcher("/admin/notices/list.jsp").forward(request, response);
	}
}
