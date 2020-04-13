package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContractCustomer extends Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int contractId;
	private Date startDate;
	private Date endDate;
	
	public ContractCustomer(String firstName, String lastName, Date startDate, Date endDate, BasicProfile profile) {
		super(firstName, lastName, profile);
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
