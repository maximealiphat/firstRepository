package fr.adaming.service;

import java.util.ArrayList;

import fr.adaming.model.User;

public interface IUserService {
	public ArrayList<User> getAllUserService();
	public User getByIdService(int id);
	public int DeleteUserService(int id);
	public int addUserService(User user);
	public int UpdateUserService(User user);
}