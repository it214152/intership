package hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "gUser")
public class GUser {

	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name = "id")
	   private int id;

	   @Column(name = "username")
	   private String username;

	   @Column(name = "password")
	   private String password;
	   
	   @Column(name = "email")
	   private String email;
	   
	   @Column(name = "role")
	   private int role;

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "GUser [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", role="
				+ role + "]";
	}
	
}
