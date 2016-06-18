package sg.dutech.planpro.service;

import javax.annotation.Resource;

import sg.dutech.planpro.dao.GenericDAO;
import sg.dutech.planpro.domain.user.User;

public abstract class BaseService {
	@Resource(name = "userDAO")
	protected GenericDAO<User> userDAO;
}
