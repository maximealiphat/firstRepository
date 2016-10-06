package fr.adaming.test;

import java.util.ArrayList;

import fr.adaming.model.User;
import fr.adaming.service.AgentServiceImp;
import fr.adaming.service.IAgentService;
import fr.adaming.service.IUserService;
import fr.adaming.service.UserServiceImp;

public class ClassTest {

	public static void main(String[] args) {
		
		IAgentService asi = new AgentServiceImp();
		System.out.println(asi.isExistService("totoaa", "tata"));
		
		IUserService usi = new UserServiceImp();
		ArrayList<User> userlist = usi.getAllUserService();
		
		System.out.println(userlist);
		System.out.println(usi.getByIdService(3));
		System.out.println(usi.DeleteUserService(3));
		usi.addUserService(new User("Chement","Thibault","toto@gmail.com","motdePasseLolz"));
		usi.UpdateUserService(new User(6,"ChementUPDATED","ThibaultUPDATED","toto@gmail.comUPDATED","motdePasseLolzUPDATED"));
		
	}

}
