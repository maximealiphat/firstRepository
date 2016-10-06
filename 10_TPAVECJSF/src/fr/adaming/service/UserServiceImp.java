package fr.adaming.service;

import java.util.ArrayList;

import fr.adaming.dao.AgentDaoImp;
import fr.adaming.dao.UserDaoImp;
import fr.adaming.model.User;

public class UserServiceImp implements IUserService{
	UserDaoImp userDao = new UserDaoImp();
	
	@Override
	public ArrayList<User> getAllUserService() {
		return userDao.getAllUserDao();
	}

	@Override
	public User getByIdService(int id) {
		return userDao.getByIdDao(id);
	}

	@Override
	public int DeleteUserService(int id) {
		return userDao.DeleteUserDao(id);
	}

	@Override
	public int addUserService(User user) {
		return userDao.addUserDao(user);
	}

	@Override
	public int UpdateUserService(User user) {
		return userDao.UpdateUserDao(user);
	}

}
