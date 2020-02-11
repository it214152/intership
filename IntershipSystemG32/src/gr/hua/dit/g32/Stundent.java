package gr.hua.dit.g32;

public class Stundent extends General_User  {
	  public Stundent(int id, String username, String password, String email, int role) {
	        super(id, username, password, email, role);
	    }

	    public Stundent(boolean validity, int id, String username, String password, String email, int role) {
	        super(id, username, password, email, role);
	        this.validity = validity;
	    }
	    
	   boolean validity;

	    public boolean isValidity() {
	        return validity;
	    }

	    public void setValidity(boolean validity) {
	        this.validity = validity;
	    }
	    
}
