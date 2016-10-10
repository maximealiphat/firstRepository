package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.UserDaoImp;
import fr.adaming.model.User;

public class UserServiceImp implements IUserService{
	UserDaoImp userDao = new UserDaoImp();
	
	@Override
	public List<User> getAllUserService() {
		return userDao.getAllUserDao();
	}

	@Override
	public User getByIdService(int id) {
		return userDao.getByIdDao(id);
	}

	@Override
	public int deleteUserService(int id) {
		return userDao.DeleteUserDao(id);
	}

	@Override
	public int addUserService(User user) {
		return userDao.addUserDao(user);
	}

	@Override
	public int updateUserService(User user) {
		return userDao.UpdateUserDao(user);
	}

}
