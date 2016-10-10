package fr.adaming.service;

import java.util.List;

import fr.adaming.model.User;

public interface IUserService {
	public List<User> getAllUserService();
	public User getByIdService(int id);
	public int deleteUserService(int id);
	public int addUserService(User user);
	public int updateUserService(User user);
}