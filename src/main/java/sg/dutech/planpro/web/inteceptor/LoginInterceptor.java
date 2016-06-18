package sg.dutech.planpro.web.inteceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import sg.dutech.planpro.domain.user.User;

/**
 * 
 * 
 * @author seawind
 * 
 */
public class LoginInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if (user == null) {
			ActionSupport action = (ActionSupport) invocation.getAction();
			action.addActionError("Please log in");
			return "login"; 
		} else {
			return invocation.invoke();
		}
	}

}
