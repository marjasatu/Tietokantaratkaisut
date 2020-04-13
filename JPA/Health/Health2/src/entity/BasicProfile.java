package entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class BasicProfile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int profileId;
	private int birthyear;
	private double weight;
	private double height;
	@JoinColumn
	@OneToOne 
	@MapsId
	private Customer customer;
	
	public BasicProfile(int birthyear, double weight, double height, Customer customer) {
		this.birthyear = birthyear;
		this.height = height;
		this.weight = weight;
		this.customer = customer;
	}
	
	public BasicProfile() {
	}

}
