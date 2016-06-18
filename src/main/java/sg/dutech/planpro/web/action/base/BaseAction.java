package sg.dutech.planpro.web.action.base;

import javax.annotation.Resource;

import sg.dutech.planpro.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 公共 抽象Action （实现代码复用）
 * 
 * @author seawind
 * 
 */
public abstract class BaseAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name = "IuserService")
	protected IUserService IuserService;
}
