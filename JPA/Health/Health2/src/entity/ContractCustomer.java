package entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContractCustomer extends Customer {
	@Temporal(value=TemporalType.DATE)
	private Date startDate;
	@Temporal(value=TemporalType.DATE)
	private Date endDate;
	
	public ContractCustomer(String firstName, String lastName, Date startDate, Date endDate) {
		super(firstName, lastName);
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
}
