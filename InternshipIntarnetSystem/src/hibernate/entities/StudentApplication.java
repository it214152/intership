package hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "studentApplication")
public class StudentApplication {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;

   @Column(name = "first_choice")
   private String firstchoice;

   @Column(name = "second_choice")
   private String secondchoice;
   
   @Column(name = "third_choice")
   private String thir_choice;
	
	public int getId() {
		return id;
	}
	
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public String getFirstchoice() {
		return firstchoice;
	}
	
	public void setFirstchoice(String firstchoice) {
		this.firstchoice = firstchoice;
	}
	
	public String getSecondchoice() {
		return secondchoice;
	}
	
	public void setSecondchoice(String secondchoice) {
		this.secondchoice = secondchoice;
	}
	
	public String getThir_choice() {
		return thir_choice;
	}
	
	public void setThir_choice(String thir_choice) {
		this.thir_choice = thir_choice;
	}

	@Override
	public String toString() {
		return "StudentApplication [id=" + id + ", firstchoice=" + firstchoice + ", secondchoice=" + secondchoice
				+ ", thir_choice=" + thir_choice + "]";
	}  
   
}
