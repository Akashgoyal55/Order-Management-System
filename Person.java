/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// JAVA 15, 2020, added "sealed" and "permits" to Java classes.
// We are learning the new elements of JAVA 15.
// "sealed" and "permits" are used here so that we will have one more example to reference.
// We do not need to understand "sealed" and "permits" in order to start and complete this assignment.
//This abstract class represents a person and implements the Greeting interface. 
//It is sealed to restrict which classes can extend it, as specified by the permits clause.
public sealed abstract class Person implements Greeting permits GeneralManager, Manager, Player, President, Student {
	
	 // Instance Data Fields
	
	 // Fields to store the first name, last name, email, and header of a person.
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String header;
	
	 // Field to store the language preference of a person.
	 private String language;
	
	 // Constructors
	
	 // Default constructor
	 public Person(){
	
	 }

	 // Constructor that accepts first and last name as parameters and initializes them using the child method.
	 public Person(String firstName, String lastName) {
	     child(firstName, lastName);
	 }

    //
    // Instance Methods
    //

    // If a person needs a header for the program here's where they'll define it
    public void setPersonHeader(String header){
        this.header = header;
    }

    public void child(String firstName, String lastName){
        setLanguage(Language.getCurrentLanguage().getLanguage());
        giveName(firstName, lastName);
    }

    public void giveName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getLanguage() {
        return language;
    }
    public String getHeader (){
        return this.header;
    }
    //
    // Additional Methods
    //
    public abstract String getGreetings(int i);
    // Player exclusive
    public void displayPlayerInfo(){

    }
    public void setEnglishInfo(String playerPosition, int playerNumber, String playerBats, String playerThrows, int yearMLBDebut) {
    	
    }
    public void setAlienInfo(int playerNumber, int yearMLBDebut) {
    	
    }
    // Student exclusive, but could also implement abstract because everyone has an email?
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    //
    // Language
    //
    public void setLanguage(String language) {
        this.language = language;
    }
    //
    // @override
    //
    @Override
    public void sayGreeting(String string) {
        System.out.print(string);
    }
}