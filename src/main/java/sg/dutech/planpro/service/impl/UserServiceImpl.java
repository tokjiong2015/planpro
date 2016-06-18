package sg.dutech.planpro.service.impl;

import sg.dutech.planpro.service.BaseService;
import sg.dutech.planpro.service.IUserService;
import sg.dutech.planpro.utils.MD5Utils;
import sg.dutech.planpro.domain.user.User;
import java.util.List;

import sg.dutech.planpro.domain.*;

public class UserServiceImpl extends BaseService implements IUserService {

	public User login(User user) {
		List<User> list = userDAO.findByNamedQuery("User.login", user.getName(), MD5Utils.md5(user.getPassword()));
		return list.isEmpty() ? null : list.get(0);
	}

	public void editPassword(User user) {
		User exist = userDAO.findById(user.getUserUuid()); // ≥÷æ√Ã¨
		exist.setPassword(MD5Utils.md5(user.getPassword()));
	}


}
