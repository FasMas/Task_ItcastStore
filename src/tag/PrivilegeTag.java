package task_itcaststore.tag;

import task_itcaststore.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * 用户是否登录的标签
 */
public class PrivilegeTag extends SimpleTagSupport {
	@Override
	public void doTag() throws IOException {
		PageContext context = (PageContext) this.getJspContext();
		HttpServletRequest request = (HttpServletRequest) context.getRequest();
		HttpServletResponse response = (HttpServletResponse) context.getResponse();

		User user = (User) context.getSession().getAttribute("user");
		if(user == null) {
			response.sendRedirect(request.getContextPath() + "/client/error/privilege.jsp");
		}
	}
}
