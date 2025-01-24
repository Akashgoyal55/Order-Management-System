/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OwnerGroup.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
//The OwnerGroup class extends the Organization class and represents the owner group of a club.
public final class OwnerGroup extends Organization{

	 // Data fields
	
	 // String to hold the name of the owner group
	 private String ownerName;
	
	 // Constructors
	
	 // Constructor that initializes the owner group with a specific language. 
	 // If the language matches the default alien sound, the owner name is set to the language, 
	 // otherwise it is set to "San Francisco Baseball Associates LLC".
	 public OwnerGroup(String language) {
	     if (language == Language.getDefaultAlienSound()){
	         ownerName = language;
	     }
	     else{
	         ownerName = "San Francisco Baseball Associates LLC";
	     }
	 }

    //
    // Instance Methods
    //

    public String getOwnerName() {
        return ownerName;
    }

    //
    // Override
    //
    @Override
    public void displayAbout() {

    }

    @Override
    public void displayMission() {

    }

}