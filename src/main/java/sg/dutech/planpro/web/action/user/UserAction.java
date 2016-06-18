package sg.dutech.planpro.web.action.user;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.ServletActionContext;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import sg.dutech.planpro.domain.user.User;
import sg.dutech.planpro.web.action.base.BaseAction;

/**
 *
 * 
 * @author seawind
 * 
 */
public class UserAction extends BaseAction implements ModelDriven<User> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user = new User();
	
	public User getModel() {
		return user;
	}

	
	public String editpassword() {
		User loginUser = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		user.setUserUuid(loginUser.getUserUuid());

		try {
			IuserService.editPassword(user);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", "success");
			map.put("msg", "Transaction Succeed");
			ActionContext.getContext().put("map", map);
		} catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", "failure");
			map.put("msg", "Transaction Failed," + e.getMessage());
			ActionContext.getContext().put("map", map);
		}

		return "editpasswordSUCCESS";
	}
}
