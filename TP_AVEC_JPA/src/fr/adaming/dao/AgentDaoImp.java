package fr.adaming.dao;
import java.util.List;

import javax.persistence.Query;

import fr.adaming.model.Agent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AgentDaoImp implements IAgentDao{


	public int isExistDao(String login, String password){

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
			EntityManager em = emf.createEntityManager();

			Query qAgentIsExist = em.createNamedQuery("agentIsExist");
			qAgentIsExist.setParameter("ma",login);
			qAgentIsExist.setParameter("pass",password);

			@SuppressWarnings("unchecked")
			List<Agent> listeAgent = qAgentIsExist.getResultList();

			return listeAgent.size();
	}
}
