package gr.hua.dit.g32;

public class CV {
	private int ID;
	   private String suurname;
	   private String name;
	   private String address;
	   private int phoneNumber;
	   private int schoolYear;
	   private int age;
	   private String email;
	   private String education;
	   private String workExperience;
	   private String languages;
	   private String extra;

	    public CV(int ID, String suurname, String name, String address, int phoneNumber, int schoolYear, int age, String email, String education, String workExperience, String languages, String extra) {
	        this.ID = ID;
	        this.suurname = suurname;
	        this.name = name;
	        this.address = address;
	        this.phoneNumber = phoneNumber;
	        this.schoolYear = schoolYear;
	        this.age = age;
	        this.email = email;
	        this.education = education;
	        this.workExperience = workExperience;
	        this.languages = languages;
	        this.extra = extra;
	    }
	   
	   

	    public int getID() {
	        return ID;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public String getSuurname() {
	        return suurname;
	    }

	    public void setSuurname(String suurname) {
	        this.suurname = suurname;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
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

	    public int getSchoolYear() {
	        return schoolYear;
	    }

	    public void setSchoolYear(int schoolYear) {
	        this.schoolYear = schoolYear;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getEducation() {
	        return education;
	    }

	    public void setEducation(String education) {
	        this.education = education;
	    }

	    public String getWorkExperience() {
	        return workExperience;
	    }

	    public void setWorkExperience(String workExperience) {
	        this.workExperience = workExperience;
	    }

	    public String getLanguages() {
	        return languages;
	    }

	    public void setLanguages(String languages) {
	        this.languages = languages;
	    }

	    public String getExtra() {
	        return extra;
	    }

	    public void setExtra(String extra) {
	        this.extra = extra;
	    }
	  
}
