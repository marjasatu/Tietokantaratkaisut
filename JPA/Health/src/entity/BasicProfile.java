package entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	//@OneToOne(optional=false)
	//private Customer customer;
	
	public BasicProfile(int birthyear, double weight, double height) {
		this.birthyear = birthyear;
		this.height = height;
		this.weight = weight;
	}

	public BasicProfile() {
	}

}
