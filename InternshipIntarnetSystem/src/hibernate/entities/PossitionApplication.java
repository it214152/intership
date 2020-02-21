package hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "possitionApplication")
public class PossitionApplication {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;

   @Column(name = "possition_name")
   private String possitionName;

   @Column(name = "company_name")
   private String companyName;
   
   @Column(name = "possition_number")
   private int possitionNumber;

   @Column(name = "description")
   private String description;
	
	public int getId() {
		return id;
	}
	
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public String getPossitionName() {
		return possitionName;
	}
	
	public void setPossitionName(String possitionName) {
		this.possitionName = possitionName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public int getPossitionNumber() {
		return possitionNumber;
	}
	
	public void setPossitionNumber(int possitionNumber) {
		this.possitionNumber = possitionNumber;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "PossitionApplication [id=" + id + ", possitionName=" + possitionName + ", companyName=" + companyName
				+ ", possitionNumber=" + possitionNumber + ", description=" + description + "]";
	}
	  
}
