package gr.hua.dit.g32;

public class IntershipApplication {
	
	 public IntershipApplication(int ID, String companyName, String description, int stNumber, String positionName) {
	        this.ID = ID;
	        this.companyName = companyName;
	        this.description = description;
	        this.stNumber = stNumber;
	        this.positionName = positionName;
	    }
	    
	    

	    public int getID() {
	        return ID;
	    }

	    public void setID(int ID) {
	        this.ID = ID;
	    }

	    public String getCompanyName() {
	        return companyName;
	    }

	    public void setCompanyName(String companyName) {
	        this.companyName = companyName;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public int getStNumber() {
	        return stNumber;
	    }

	    public void setStNumber(int stNumber) {
	        this.stNumber = stNumber;
	    }

	    public String getPositionName() {
	        return positionName;
	    }

	    public void setPositionName(String positionName) {
	        this.positionName = positionName;
	    }
	     private int ID;
	     private String companyName;
	     private String description;
	     private int stNumber;
	     private String positionName;
	     
	}


