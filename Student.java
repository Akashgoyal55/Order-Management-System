/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
//The Student class extends the Person class and represents a student entity in the system.
public final class Student extends Person {
 
	 // Static Data Fields
	
	 // A static Card instance to ensure that all Student objects share the same Card instance.
	 // This is to prevent any Card methods in Student class from interfering with those in Person class.
	 private static Card card;
	
	 // Instance Data Fields
	
	 // Language preference of the student, inherited from the Person class.
	 private String language;
	
	 // The greeting message that will be displayed when a Student object is created.
	 private String greeting;
	
	 // An array to store all greetings associated with the Student object.
	 private String[] allGreetings;
	
	 // Constructors
	
	 // Constructor that accepts first name and last name as parameters and initializes the Student object.
	 public Student(String firstName, String lastName) {
	     super(firstName, lastName);  // Calls the constructor of the superclass (Person) to initialize common attributes.
	     card = new Card();  // Creates a new Card instance and assigns it to the static card attribute.
	     this.language = super.getLanguage();  // Retrieves the language preference from the superclass.
	
	     // Sets the greetings based on the language preference.
	     switch (language){
	         case "ENGLISH" -> setAllGreetingsEnglish();
	         default -> setAllGreetingsAlien();
	     }
	
	     // Initializes the allGreetings array with the greeting message.
	     allGreetings = new String[] {
	         greeting
	     };
	 }
	
	 // Instance Methods
	
	 // Method to set the English greetings and person header.
	 private void setAllGreetingsEnglish(){
	     setPersonHeader(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + super.getFirstName() + " " + super.getLastName()
	          + Color.ANSI_RESET  + ": ");
	     setGreeting("Welcome to my University!");
	 }
	
	 // Method to set the Alien greetings and person header.
	 private void setAllGreetingsAlien(){
	     setPersonHeader(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + super.getFirstName()
	             + " " + super.getLastName() + Color.ANSI_RESET + ": ");
	     setGreeting(language);
	 }
    //
    // Additional Methods
    //
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    public static Card getCard() {
        return card;
    }
    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void sayGreeting(String string) {
        super.sayGreeting(string);
    }
    @Override
    public String getGreetings(int i){
        return allGreetings[i];
    }
    @Override
    public void setEmail(String email){
        super.setEmail(email);
    }
    @Override
    public void setPersonHeader(String theirHeader){
        super.setPersonHeader(theirHeader);
    }
}