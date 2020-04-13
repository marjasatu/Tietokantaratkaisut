package entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
	
	@Id
	@Column(name="categoryId", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int categoryId;
	
	@Column(name="categoryDescription")
    private String categoryDescription;

    public Category(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
    
    public Category() {
    }
    
    public String getDescription() {
    	return this.categoryDescription;
    }

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryDescription=" + categoryDescription + "]";
	}   

}
