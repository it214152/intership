package hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

   @Id
   @Column(name = "id")
   private int id;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;
   
   @Column(name = "approved")
   private int approved;

   public Student() {
   }

   public Student(String firstName, String lastName, int approved) {
           super();
           this.firstName = firstName;
           this.lastName = lastName;
           this.approved = approved;
   }

   public int getId() {
           return id;
   }

   public void setId(int id) {
           this.id = id;
   }

   public String getFirstName() {
           return firstName;
   }

   public void setFirstName(String firstName) {
           this.firstName = firstName;
   }

   public String getLastName() {
           return lastName;
   }

   public void setLastName(String lastName) {
           this.lastName = lastName;
   }
   
   public int getApproved() {
		return approved;
	}
	
   public void setApproved(int approved) {
		this.approved = approved;
	}

   @Override
   public String toString() {
           return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", approved=" + approved + "]";
   }

}
