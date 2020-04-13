package application;

import java.util.Scanner;

import dao.Dao;
import entity.Account;
import entity.Transaction;

public class FinanceTest2 {
	
	public static void main(String[] args) {
		
		Dao dao = new Dao();
		Scanner lukija = new Scanner(System.in);
	
		System.out.println ("Transaction id:");
		int id = lukija.nextInt();
		
		Transaction transaction = dao.loadTransaction(id);
		String description = transaction.getDescription();
		
		String sourceAccountName;
		String destinationAccountName;
		
		Account sourceAccount = transaction.getSourceAccount();
		Account destinationAccount = transaction.getDestinationAccount();
		
		if (sourceAccount != null) {
			sourceAccountName = sourceAccount.getAccountName();
		} else { 
			sourceAccountName = "unknown";
		}
		
		if (destinationAccount != null) {
			destinationAccountName = destinationAccount.getAccountName();
		} else { 
			destinationAccountName = "unknown";
		}	
		
		String categoryName = transaction.getCategory().getDescription();
		
		
		System.out.println("Source account: " + sourceAccountName);
		System.out.println("Destination account: " + destinationAccountName);
		System.out.println("Category: " + categoryName);
		
		
	
	}
}
