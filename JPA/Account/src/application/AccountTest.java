package application;

import entity.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import dao.*;

public class AccountTest {

    public static void main(String[] args) throws Exception {
    	
    	Dao dao = new Dao();  	
    	Account account1 = new Account("1234-5678", 55.16); 
    	Account account2 = new Account("5678-1234", 156.88); 
    	dao.saveAccount(account1);
    	dao.saveAccount(account2);
    	
    	dao.tranfer("1234-5678", "5678-1234", 3.67);
    	dao.tranfer("1234-5678", "5678-1234", 9.56);   	
    }
}

