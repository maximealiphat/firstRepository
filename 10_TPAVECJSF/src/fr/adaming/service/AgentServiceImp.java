package fr.adaming.service;

import fr.adaming.dao.AgentDaoImp;

public class AgentServiceImp implements IAgentService{
	AgentDaoImp agentDao = new AgentDaoImp();
	@Override
	public int isExistService(String login, String password) {
		return agentDao.isExistDao(login, password);
	}
}
