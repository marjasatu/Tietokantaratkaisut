package entity;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity

public class Account {
	
	@Id
    private String number;
	@Convert(converter=IntegerConverter.class)
    private double balance;
	@Version
	private long version;
	
	public Account(String number, double balance) {
		this.number = number;
		this.balance = balance;
    }
	
	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + "]";
	}



	public Account() {
		
	}
	  
}

