package application;

import entity.*;

import java.util.Date;

import dao.*;

public class HealthTest {

    public static void main(String[] args) {
    	
    	Dao dao = new Dao();
    	
    	BasicProfile profile1 = new BasicProfile(1984, 62.0, 178.0);
    	BasicProfile profile2 = new BasicProfile(1990, 52.0, 160.0);
    		
    	//Customer customer1 = new ContractCustomer ("Maija", "Mattila", new Date(2017, 5, 15), new Date(2018, 4, 9), profile1);
    	//Customer customer2 = new ContractCustomer ("Minna", "Miettinen", new Date(2010, 7, 19), new Date(2019, 1, 5), profile2);
    	
    	dao.saveBasicProfile(profile1);
    	dao.saveBasicProfile(profile2);
    	
    	//dao.saveCustomer(customer1);
    	//dao.saveCustomer(customer2);
    }
}

