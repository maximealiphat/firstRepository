package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import fr.adaming.model.User;

public class UserDaoImp implements IUserDao{




	@Override
	public List<User> getAllUserDao() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");

		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		Query qAllUser = em.createNamedQuery("getAlluser");

		@SuppressWarnings("unchecked")
		List<User> listeUser = qAllUser.getResultList();

		em.close();
		emf.close();
		return listeUser;

	}

	@Override
	public User getByIdDao(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query quser = em.createNamedQuery("getUserById");

		quser.setParameter("id",id);

		em.close();
		emf.close();
		return (User) quser.getSingleResult();

	}

	@Override
	public int DeleteUserDao(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		System.out.println(id);
		Query quser = em.createNamedQuery("deleteUser");

		quser.setParameter("id",id);

		quser.executeUpdate();
		
		tx.commit();
		
		em.close();
		emf.close();
		return 0;
	}

	@Override
	public int addUserDao(User user) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(user);

		tx.commit();
		em.close();
		emf.close();


		return 0;
	}

	@Override
	public int UpdateUserDao(User user) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query quser = em.createNamedQuery("updateUser");

		quser.setParameter("no",user.getNom());
		quser.setParameter("pre",user.getPrenom());
		quser.setParameter("mai",user.getMail());
		quser.setParameter("pass",user.getPassword());
		quser.setParameter("id",user.getId_user());

		quser.executeUpdate();
		
		tx.commit();
		
		em.close();
		emf.close();
		 
		return 0;	
	}

}
