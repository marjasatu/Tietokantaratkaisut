package entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int custId;
    private String firstName;
    private String lastName;
    @OneToOne (mappedBy="customer")
    private BasicProfile profile;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
    }
	
	public int getId() {
		return this.custId;
	}
	
	public BasicProfile getProfile() {
		return this.getProfile();
	}
	
	public Customer() {
		
	}
	  
}

