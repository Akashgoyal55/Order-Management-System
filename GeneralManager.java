/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: GeneralManager.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class GeneralManager extends Person {

    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
	public GeneralManager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    //
    // Instance Methods
    //

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
    public String getGreetings(int i) {
        return null;
    }
}