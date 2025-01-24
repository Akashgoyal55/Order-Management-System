/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: FrontOffice.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;

// The FrontOffice class represents the front office of a club, holding information about the president, 
// general manager, manager, and owner group of the club.
public final class FrontOffice {
    
    // Instance Data Fields

    // Objects representing the president, general manager, and manager of the club
    private Person president;
    private Person generalManager;
    private Person manager;
    
    // Object representing the owner group of the club
    private OwnerGroup ownerGroup;

    // Constructors

    // Constructor that initializes the front office with the specified language setting
    public FrontOffice(String language) {
        setPresident(language);
        setGeneralManager(language);
        setManager(language);
        this.ownerGroup = new OwnerGroup(Language.getCurrentLanguage().getLanguage());
    }

    // Instance Methods

    public Person getPresident() {
        return president;
    }

    
    public Person getGeneralManager() {
        return generalManager;
    }

    
    public Person getManager() {
        return manager;
    }

 
    public OwnerGroup getOwnerGroup() {
        return ownerGroup;
    }

    
    private void setManager(String language){
        if (language == Language.getDefaultAlienSound()){
            manager = new Manager(language, language);
        }
        else{
            manager = new Manager("Gabe", "Kapler");
        }
    }

    private void setGeneralManager(String language){
        if (language == Language.getDefaultAlienSound()){
            generalManager = new GeneralManager(language, language);
        }
        else{
            generalManager = new GeneralManager("Scott", "Harris");
        }
    }

    public void setPresident(String language) {
        if (language == Language.getDefaultAlienSound()){
            president = new President(language, language);
        }
        else{
            president = new President("Farhan", "Zaidi");
        }
    }

    // Language

    public void sayGreeting(int i){
        manager.sayGreeting(manager.getGreetings(i));
    }
}
