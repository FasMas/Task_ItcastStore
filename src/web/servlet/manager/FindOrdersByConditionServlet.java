package task_itcaststore.web.servlet.manager;

import task_itcaststore.domain.Order;
import task_itcaststore.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

/**
 * 多条件查询订单的Servlet
 */
@WebServlet(name = "FindOrdersByConditionServlet",urlPatterns = {"/manager/findOrdersByCondition"})
public class FindOrdersByConditionServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建Service层对象
		OrderService service = new OrderService();
		//获取订单编号和收件人名称
		String id = request.getParameter("id").trim();
		String receiverName = request.getParameter("receiverName").trim();

		//调用Service层OrderService类的findOrderByManyCondition()方法查询数据
		List<Order> orderList = service.findOrdersByCondition(id, receiverName);

		//将查询结果添加到request作用域中
		request.setAttribute("orders", orderList);
		//请求转发到list.jsp页面，并将request请求和response响应也转发到该页面中
		request.getRequestDispatcher("/admin/orders/list.jsp").forward(request, response);
	}
}
