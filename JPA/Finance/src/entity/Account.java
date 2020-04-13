
package entity;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNT")
public class Account {
 
	@Id
	@Column(name="accountId", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int accountId;
	
	@Column(name="accountName")
    private String accountName;
	
	@Column(name="balance")
    private double balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
    
    public Double getBalance() {
    	return this.balance;
    }
    
    public String getAccountName() {
    	return this.accountName;
    }
    
   
    public void setBalance(double balance) {
		this.balance = balance;
	}
    
    public int getAccountId() {
		return this.accountId;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void updateBalance(double amount) {
    	this.balance = this.balance + amount;
    }

	public Account() {
    }

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance + "]";
	}   
    
	
}

