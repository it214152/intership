package hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "studentCV")
public class StudentCV {

	@Id
   @Column(name = "id")
   private int id;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;
   
   @Column(name = "address")
   private String address;
   
   @Column(name = "phone_number")
   private int phoneNumber;

   @Column(name = "birthdate")
   private String birthdate;

   @Column(name = "uni_year")
   private int uniYear;

   @Column(name = "extra")
   private String extra;

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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	
	public int getUniYear() {
		return uniYear;
	}
	
	public void setUniYear(int uniYear) {
		this.uniYear = uniYear;
	}
	
	public String getExtra() {
		return extra;
	}
	
	public void setExtra(String extra) {
		this.extra = extra;
	}

	@Override
	public String toString() {
		return "StudentCV [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", birthdate=" + birthdate + ", uniYear="
				+ uniYear + ", extra=" + extra + "]";
	}
	
}
