package entity;



import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int transactionId;
    private double amount;
    private String description;
    private Timestamp timestamp;
	@ManyToOne (fetch = FetchType.EAGER)
	private Category category;
	@ManyToOne(fetch = FetchType.EAGER)
	private Account sourceAccount;
	@ManyToOne (fetch = FetchType.EAGER)
	private Account destinationAccount;
	
	public Transaction(double amount, String description, Category category, Account sourceAccount, Account destinationAccount) {
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }
	  
    public int getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public Category getCategory() {
		return category;
	}

	public Account getSourceAccount() {
		return sourceAccount;
	}

	public Account getDestinationAccount() {
		return destinationAccount;
	}

	public Transaction() {
    }
}

