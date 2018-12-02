package task_itcaststore.web.servlet.manager;

import task_itcaststore.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * 下载销售榜单的Servlet
 * TODO 实现页面打印+下载功能
 */
@WebServlet(name = "DownloadServlet",urlPatterns = {"/manager/download"})
public class DownloadServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService service = new ProductService();

		String year = request.getParameter("year").trim();
		String month = request.getParameter("month").trim();

		//设置下载链接
		String fileName = year + "年" + month + "月销售榜单.csv";
		response.setContentType(this.getServletContext().getMimeType(fileName));
		response.setHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes(StandardCharsets.UTF_8), "iso8859-1"));
		//response.setCharacterEncoding("utf-8");

		List<Object[]> ps = service.download(year, month);
		PrintWriter out = response.getWriter();
		out.println("商品名称,销售数量");
		for(Object[] arr : ps) {
			out.println(arr[0] + "," + arr[1]);
		}
		out.flush();
		out.close();
	}
}
