package gr.hua.dit.g32;

public class StudentApplication {
	private int ID;
    private int firstChoice;
    private int secondChoice;
    private int thirdChoice;

   public StudentApplication(int ID, int firstChoice, int secondChoice, int thirdChoice) {
       this.ID = ID;
       this.firstChoice = firstChoice;
       this.secondChoice = secondChoice;
       this.thirdChoice = thirdChoice;
   }

    
    
   public int getID() {
       return ID;
   }

   public void setID(int ID) {
       this.ID = ID;
   }

   public int getFirstChoice() {
       return firstChoice;
   }

   public void setFirstChoice(int firstChoice) {
       this.firstChoice = firstChoice;
   }

   public int getSecondChoice() {
       return secondChoice;
   }

   public void setSecondChoice(int secondChoice) {
       this.secondChoice = secondChoice;
   }

   public int getThirdChoice() {
       return thirdChoice;
   }

   public void setThirdChoice(int thirdChoice) {
       this.thirdChoice = thirdChoice;
   }
    
    
}
