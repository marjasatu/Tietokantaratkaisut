package application;

import entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import dao.*;

public class HealthTest {

    public static void main(String[] args) throws Exception {
    	
    	Dao dao = new Dao();
    	
    	SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
    	
    	Customer customer1 = new ContractCustomer ("Maija", "Mattila", formatter.parse("31/12/2017"), formatter.parse("12/05/2019"));
    	Customer customer2 = new ContractCustomer ("Minna", "Minkkinen", formatter.parse("30/09/2018"), formatter.parse("03/05/2019"));
    	
    	BasicProfile profile1 = new BasicProfile(1984, 62.0, 178.0, customer1);
    	BasicProfile profile2 = new BasicProfile(1990, 52.0, 160.0, customer2);
    	
    	Clinic clinic = new Clinic("Helsinki");
    	clinic.getCustomers().add(customer1);
    	
    	dao.saveCustomerAndProfile(customer1, profile1);
    	dao.saveCustomerAndProfile(customer2, profile2);
    	
    	dao.saveClinic(clinic);  	
    		  	
    }
}

