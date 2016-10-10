package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.User;

public interface IUserDao {
	public List<User> getAllUserDao();
	public User getByIdDao(int id);
	public int DeleteUserDao(int id);
	public int addUserDao(User user);
	public int UpdateUserDao(User user);
}
