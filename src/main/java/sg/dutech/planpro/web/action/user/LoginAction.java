package sg.dutech.planpro.web.action.user;

import org.apache.struts2.ServletActionContext;

import sg.dutech.planpro.domain.user.User;
import sg.dutech.planpro.web.action.base.BaseAction;

import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * 
 * @author seawind
 * 
 */
public class LoginAction extends BaseAction implements ModelDriven<User> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private sg.dutech.planpro.domain.user.User user = new User();

	public User getModel() {
		return user;
	}

	
	public String execute() {

		String checkCodeSession = (String) ServletActionContext.getRequest().getSession().getAttribute("key");
		if (checkCodeSession == null || !checkCodeSession.equals(checkcode)) {
		
			this.addActionError("validation code incorrect");
			return INPUT;
		}
	
		User loginUser = IuserService.login(user);
		if (loginUser == null) {
			
			this.addActionError("username or password not correct");
			return INPUT;
		} else {
			
			ServletActionContext.getRequest().getSession().setAttribute("user", loginUser);
			return SUCCESS;
		}
	}

	
	private String checkcode; 

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

}
