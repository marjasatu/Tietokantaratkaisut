
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
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    
    public Clinic(String location, ArrayList<Customer> customers) {
    	this.location = location;
    	this.customers = customers;
    }
    
    public ArrayList getCustomers() {
    	return this.customers;
    }
	
	public Clinic() {		
	}
}

