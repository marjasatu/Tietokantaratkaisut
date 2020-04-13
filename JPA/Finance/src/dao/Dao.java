package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity.*;

public class Dao {
	
	//private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevPU");
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Fin2");
	
	public Transaction loadTransaction(int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Transaction transaction = em.find(Transaction.class, id);		
		em.getTransaction().commit();
		em.close();		
		return transaction;
	}
	
	public void saveAccount(Account account) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(account);        
        em.getTransaction().commit();
        em.close();
	}	
	
	public void saveCategory(Category category) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
        em.persist(category);        
        em.getTransaction().commit();
        em.close();
	}	
	
	public void saveTransaction(Transaction transaction) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		if (transaction.getSourceAccount() != null) {
			Account sourceAccount = em.find(Account.class, transaction.getSourceAccount().getAccountId());
			sourceAccount.updateBalance(-transaction.getAmount());
			transaction.getSourceAccount().setBalance(sourceAccount.getBalance());
		}		
		if (transaction.getDestinationAccount() != null) {
			Account destinationAccount = em.find(Account.class, transaction.getDestinationAccount().getAccountId());
			destinationAccount.updateBalance(transaction.getAmount());
			transaction.getDestinationAccount().setBalance(destinationAccount.getBalance());
		}
        em.persist(transaction);        
        em.getTransaction().commit();
        em.close();
	}
	
	
	
}
