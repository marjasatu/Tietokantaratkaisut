package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevPU");
	
	public void saveBasicProfile(BasicProfile profile) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(profile);        
        em.getTransaction().commit();
        em.close();
	}
	
	public void saveCustomerAndProfile(Customer customer, BasicProfile profile) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(customer);
        em.persist(profile);
        em.getTransaction().commit();
        em.close();
	}
	
	public void saveClinic(Clinic clinic) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(clinic);        
        em.getTransaction().commit();
        em.close();
	}
	
	
	/*public void saveAccount(Clinic account) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(account);        
        em.getTransaction().commit();
        em.close();
	}
	
		public void saveCategory(BasicProfile category) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(category);        
        em.getTransaction().commit();
        em.close();
	}	
	
	
	public Customer loadTransaction(int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Customer transaction = em.find(Customer.class, id);		
		em.getTransaction().commit();
		em.close();		
		return transaction;
	}
	
	
	
	
	
	*/
	
}
