/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Manager.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

//The Manager class extends the Person class and represents a manager in the chat session.
public final class Manager extends Person {

	 // Instance Data Fields
	
	 // Strings to hold various greetings and follow-up messages
	 private String greetingFollow;
	 private String firstGreeting;
	 private String secondGreeting;
	 private String thirdGreeting;
	 private String fourthGreeting;
	
	 // Array to hold a set of greetings
	 private final String[] greetings;
	
	 // Constructors
	
	 // Constructor that initializes the manager with first and last name, and populates greetings based on the current language
	 public Manager(String firstName, String lastName) {
	     super(firstName, lastName);
	     populateGreetings(Language.getCurrentLanguage().getLanguage());
	     greetings = new String[] {
	             firstGreeting, secondGreeting, thirdGreeting, fourthGreeting
	     };
	 }
	
	 // Instance Methods
	
	 // Method to populate greetings based on the specified language
	 private void populateGreetings(String language){
	     switch (language){
	         case "ENGLISH"-> setEnglishGreetings();
	         default -> setAlienGreetings();
	     }
	 }
	
	 // Method to set English greetings
	 public void setEnglishGreetings(){
	     setGreetingFollow(": ");
	     setFirstGreeting("Welcome to the " + Config.getDefaultClub().toUpperCase() + "!");
	     setSecondGreeting("Your first name and last name, please: ");
	     setThirdGreeting("Your school email address, please: ");
	     setFourthGreeting("Thank you. We are connecting you with our player...");
	 }
	
	 // Method to set Alien greetings
	 public void setAlienGreetings(){
	     setGreetingFollow(super.getLanguage());
	     setFirstGreeting(super.getLanguage()+ " "+ super.getLanguage().repeat(2));
	     setSecondGreeting(super.getLanguage());
	     setThirdGreeting(super.getLanguage());
	     setFourthGreeting(super.getLanguage());
	 }
    //
    // Additional Methods
    //
    public String getFirstGreeting() {
        return firstGreeting;
    }
    public void setFirstGreeting(String firstGreeting) {
        this.firstGreeting = firstGreeting;
    }
    public String getSecondGreeting() {
        return secondGreeting;
    }
    public void setSecondGreeting(String secondGreeting) {
        this.secondGreeting = secondGreeting;
    }
    public String getThirdGreeting() {
        return thirdGreeting;
    }
    public void setThirdGreeting(String thirdGreeting) {
        this.thirdGreeting = thirdGreeting;
    }
    public String getFourthGreeting() {
        return fourthGreeting;
    }
    public void setFourthGreeting(String fourthGreeting) {
        this.fourthGreeting = fourthGreeting;
    }
    public String getGreetingFollow() {
        return greetingFollow;
    }
    public void setGreetingFollow(String greetingFollow) {
        this.greetingFollow = greetingFollow;
    }
    //
    // Language
    //
    //
    //Override
    //
    @Override
    public void sayGreeting(String string) {
        System.out.print(Club.getShortName() + getGreetingFollow());
        super.sayGreeting(string);
    }
    @Override
    public String getGreetings(int i){
        return greetings[i];
    }
}