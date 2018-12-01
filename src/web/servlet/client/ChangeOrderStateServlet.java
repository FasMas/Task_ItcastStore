package task_itcaststore.web.servlet.client;
import task_itcaststore.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class ChangeOrderStateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获得订单号数据
		String orderId = request.getParameter("orderId");
		String paySuccess = "恭喜您支付成功！";
		if (null != orderId) {
				OrderService service = new OrderService();
				// 根据订单号修改订单状态
				try {
					service.updateState(orderId);
					request.setAttribute("paySuccess", paySuccess);
					request.getRequestDispatcher("/findOrderByUser").forward(request, response);
				} catch (Exception e) {
					e.printStackTrace();
					response.getWriter().write("修改订单状态失败");
				}
			}
	}
}
