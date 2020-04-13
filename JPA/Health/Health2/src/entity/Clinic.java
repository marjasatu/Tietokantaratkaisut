
package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Clinic {
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int clinicId;
    private String location;
    @ManyToMany(fetch=FetchType.EAGER)
    private List<Customer> customers = new ArrayList<Customer>();
    
    public Clinic(String location) {
    	this.location = location;
    }
    
    public List<Customer> getCustomers() {
    	return this.customers;
    }
	
	public Clinic() {		
	}
}

