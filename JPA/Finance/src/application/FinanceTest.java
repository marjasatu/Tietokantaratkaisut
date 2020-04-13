package application;

import entity.*;

import java.util.Scanner;

import dao.*;

public class FinanceTest {

    public static void main(String[] args) {
    	
    	Dao dao = new Dao();
    		
    	Account savings = new Account("savings", 400);
    	dao.saveAccount(savings);
    	
    	Account wallet = new Account("wallet", 14.50);
    	dao.saveAccount(wallet);
    	
    	Category food = new Category("food");
    	dao.saveCategory(food);
    	
    	Category leisure = new Category("leisure");
    	dao.saveCategory(leisure);
    	
    	Category school = new Category("school");
    	dao.saveCategory(school);
    	
    	Category gifts = new Category("gifts");
    	dao.saveCategory(gifts);
    	
    	Category internalTransfer = new Category("internal transfer");
    	dao.saveCategory(internalTransfer);	
    	
    	Transaction t1 = new Transaction(100.0, "gift from Aunt Mary", gifts, null, savings);
    	dao.saveTransaction(t1);
    	
    	Transaction t2 = new Transaction(40.0, "internal transfer", internalTransfer, savings, wallet);
    	dao.saveTransaction(t2);
    	
    	Transaction t3 = new Transaction(8.40, "pub", leisure, wallet, null);
    	dao.saveTransaction(t3);
 
    }
}

