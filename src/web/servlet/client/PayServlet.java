package task_itcaststore.web.servlet.client;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
/**
 * 付款（模拟支付）
 */
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.将要提交的数据得到
		// 获得 支付必须基本数据
		String orderId = request.getParameter("orderId");
		String money = request.getParameter("money");
		// 银行
		String bank = request.getParameter("yh");
		request.setAttribute("bank", bank);
		request.setAttribute("orderId", orderId);
		request.setAttribute("money", money);
		request.getRequestDispatcher("/client/confirm.jsp").forward(request, response);
	}
}
