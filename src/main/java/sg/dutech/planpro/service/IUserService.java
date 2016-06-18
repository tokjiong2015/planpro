package sg.dutech.planpro.service;

import sg.dutech.planpro.domain.user.User;

public interface IUserService {

	public User login(User user);

	public void editPassword(User user);
}
