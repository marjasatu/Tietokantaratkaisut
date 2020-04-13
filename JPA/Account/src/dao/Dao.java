package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.*;

public class Dao {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevPU");
	
	public void saveAccount(Account account) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(account);        
        em.getTransaction().commit();
        em.close();
	}
	
	public Account loadAccount(String number) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();	
		Account account = em.find(Account.class, number);	
		em.getTransaction().commit();
		em.close();		
		return account;
	}
	
public void tranfer(String sourceAccountNumber, String destinationAccountNumber, double amount) {
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();	
	Account source = em.find(Account.class, sourceAccountNumber);
	Account destination = em.find(Account.class, destinationAccountNumber);
	destination.setBalance(destination.getBalance() + amount);
	source.setBalance(source.getBalance() - amount);
	em.getTransaction().commit();
	em.close();		
	}
	
}
