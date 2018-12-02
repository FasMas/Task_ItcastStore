package task_itcaststore.web.servlet.manager;

import task_itcaststore.domain.Notice;
import task_itcaststore.service.NoticeService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *	后台修改公告的servlet
 */
public class UpdateNoticeServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		NoticeService nService = new NoticeService();
		Notice bean = new Notice();
		//获取表单参数
		String title = request.getParameter("title");
		String details = request.getParameter("details");

		//将当前时间设为添加公告的时间
		String t = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		bean.setTitle(title);
		bean.setDetails(details);
		bean.setN_time(t);
		//调用dao层方法
		nService.addNotice(bean);

		request.getRequestDispatcher("/manager/ListNoticeServlet").forward(request, response);
	}
}
