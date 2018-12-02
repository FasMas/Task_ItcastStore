package task_itcaststore.web.servlet.manager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import task_itcaststore.domain.Notice;
import task_itcaststore.service.NoticeService;

/**
 *
 *	后台根据id查询公告的servlet
 */
public class FindByIdNoticeServlet extends HttpServlet{

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
		//获取公告id
		String n_id = request.getParameter("id");
		Notice notice = nService.findNoticeById(n_id);

		request.setAttribute("notice", notice);

		request.getRequestDispatcher("/admin/notices/edit.jsp").forward(request, response);
	}
}
