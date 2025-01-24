/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
//The Player class is a subclass of Person and represents a player in the system.
public final class Player extends Person {
	 
	 // Instance Data Fields
	
	 // Fields to store various headers and player information.
	 private String infoHeader;
	 private String playerHeader;
	 private String clubHeader;
	 private String positionHeader;
	 private String numberHeader;
	 private String batsHeader;
	 private String throwsHeader;
	 private String debutHeader;
	
	 private String club;
	 private String playerPosition;
	 private String playerBats;
	 private String playerThrows;
	
	 private static int playerNumber;
	 private int yearMLBDebut;
	
	 // Fields to store different greetings.
	 private String greeting1A, greeting1B, greeting2, greeting3A,
	         greeting3B, greeting4, greeting5, greeting6A, greeting6B,
	         greeting7A, greeting7B, greeting8A, greeting8B;
	 private final String[] greetings;
	
	 // Constructors
	
	 // Constructor that accepts first and last name as parameters and initializes them along with greetings based on the language preference.
	 public Player(String firstName, String lastName) {
	     super(firstName, lastName);
        switch(super.getLanguage()){
        case "ENGLISH": 
            setGreeting1A("Hello ");
            setGreeting1B(". C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!");
            setGreeting2(Color.ANSI_PURPLE_BACKGROUND + Color.ANSI_YELLOW + Config.getDefaultUniversity().toUpperCase()
                    + Color.ANSI_RESET + ". " + "Way to go!");
            setGreeting3A("Likewise, ");
            setGreeting3B(". Very nice chatting w/ you.");
            setGreeting4("How many SF Giants Thank You cards would you like to order?");
            setGreeting5("In 3 lines, please provide\n" +
                    "\t[1] Recipient name\n" +
                    "\t[2] Art symbol (a character)\n" +
                    "\t[3] Message to recipient");
            setGreeting6A("Card #");
            setGreeting6B(":");
            setGreeting7A("Thanks, ");
            setGreeting7B(". Please confirm your order:");
            setGreeting8A("Thank you again, ");
            setGreeting8B(". See you at your graduation ceremony!");
            break;
        default:
            String alien = super.getLanguage();
            setGreeting1A(alien);
            setGreeting1B(". "+ alien);
            setGreeting2(alien + ". " + alien);
            setGreeting3A(alien+alien);
            setGreeting3B(". " + alien);
            setGreeting4(alien);
            setGreeting5(alien);
            setGreeting6A(alien);
            setGreeting6B(" " + alien);
            setGreeting7A(alien + " " + alien);
            setGreeting7B(" " + alien);
            setGreeting8A(alien+alien);
            setGreeting8B(". " + alien);
            break;
        }

        greetings = new String[]{
          greeting1A, greeting1B, greeting2, greeting3A,
                greeting3B, greeting4, greeting5, greeting6A,
                greeting6B, greeting7A, greeting7B, greeting8A,
                greeting8B
        };
    }
    //
    // Instance Methods
    //
    
    //
    // Additional Instance Methods
    //
    public void setInfoHeader(String infoHeader) {
        this.infoHeader = infoHeader;
    }
    public String getPlayerHeader() {
        return playerHeader;
    }
    public void setPlayerHeader(String playerHeader) {
        this.playerHeader = playerHeader;
    }
    public String getClubHeader() {
        return clubHeader;
    }
    public void setClubHeader(String clubHeader) {
        this.clubHeader = clubHeader;
    }
    public String getPositionHeader() {
        return positionHeader;
    }
    public void setPositionHeader(String positionHeader) {
        this.positionHeader = positionHeader;
    }
    public String getNumberHeader() {
        return numberHeader;
    }
    public void setNumberHeader(String numberHeader) {
        this.numberHeader = numberHeader;
    }
    public String getBatsHeader() {
        return batsHeader;
    }
    public void setBatsHeader(String batsHeader) {
        this.batsHeader = batsHeader;
    }
    public String getThrowsHeader() {
        return throwsHeader;
    }
    public void setThrowsHeader(String throwsHeader) {
        this.throwsHeader = throwsHeader;
    }
    public String getDebutHeader() {
        return debutHeader;
    }
    public void setDebutHeader(String debutHeader) {
        this.debutHeader = debutHeader;
    }
    public String getClub() {
        return club;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public String getPlayerPosition() {
        return playerPosition;
    }
    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }
    public static int getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(int playerNumber) {
        Player.playerNumber = playerNumber;
    }
    public String getPlayerBats() {
        return playerBats;
    }
    public void setPlayerBats(String playerBats) {
        this.playerBats = playerBats;
    }
    public String getPlayerThrows() {
        return playerThrows;
    }
    public void setPlayerThrows(String playerThrows) {
        this.playerThrows = playerThrows;
    }
    public int getYearMLBDebut() {
        return yearMLBDebut;
    }
    public void setYearMLBDebut(int yearMLBDebut) {
        this.yearMLBDebut = yearMLBDebut;
    }

    private void setGreeting1A(String greeting1A) {
        this.greeting1A = greeting1A;
    }
    public void setGreeting1B(String greeting1B) {
        this.greeting1B = greeting1B;
    }
    public void setGreeting2(String greeting2) {
        this.greeting2 = greeting2;
    }
    public void setGreeting3A(String greeting3A) {
        this.greeting3A = greeting3A;
    }
    public void setGreeting3B(String greeting3B) {
        this.greeting3B = greeting3B;
    }
    public void setGreeting4(String greeting4) {
        this.greeting4 = greeting4;
    }
    public void setGreeting5(String greeting5) {
        this.greeting5 = greeting5;
    }
    public void setGreeting6A(String greeting6A) {
        this.greeting6A = greeting6A;
    }
    public void setGreeting6B(String greeting6B) {
        this.greeting6B = greeting6B;
    }
    public void setGreeting7A(String greeting7A) {
        this.greeting7A = greeting7A;
    }
    public void setGreeting7B(String greeting7B) {
        this.greeting7B = greeting7B;
    }
    public void setGreeting8A(String greeting8A) {
        this.greeting8A = greeting8A;
    }
    public void setGreeting8B(String greeting8B) {
        this.greeting8B = greeting8B;
    }
    
   
    //
    // @Override
    //
    @Override
    public String getGreetings(int i) {
        return greetings[i];
    }
    @Override
    public void sayGreeting(String string) {
        super.sayGreeting(string);
    }
    // Method to set player information in English.
    @Override
    public void setEnglishInfo(String playerPosition, int playerNumber, String playerBats, String playerThrows, int yearMLBDebut){
        setInfoHeader("-".repeat(70));
        setPlayerHeader("Player:");
        setClubHeader("Club:");
        setPositionHeader("Position:");
        setNumberHeader("Number:");
        setBatsHeader("Bats:");
        setThrowsHeader("Throws");
        setDebutHeader("MLB Debut:");

        setClub(Config.getDefaultClub());
        
        setPlayerPosition(playerPosition);
        setPlayerNumber(playerNumber);
        setPlayerBats(playerBats);
        setPlayerThrows(playerThrows);
        setYearMLBDebut(yearMLBDebut);
        setPersonHeader(super.getFirstName() + " " + super.getLastName() +", " + playerNumber + ": ");
    }
 	// Method to set player information in Alien language.
    @Override
    public void setAlienInfo(int playerNumber, int yearMLBDebut){
        String alien = super.getLanguage();
        setInfoHeader(alien);
        setPlayerHeader(alien);
        setClubHeader(alien);
        setPositionHeader(alien);
        setNumberHeader(alien);
        setBatsHeader(alien);
        setThrowsHeader(alien);
        setDebutHeader(alien);

        setClub(alien);
        setPlayerPosition(alien);
        setPlayerNumber(playerNumber);
        setPlayerBats(alien);
        setPlayerThrows(alien);
        setYearMLBDebut(yearMLBDebut);
        setPersonHeader(alien + " " + alien + ", " + getPlayerNumber() + ": ");
    }
    @Override
    public void displayPlayerInfo(){
        System.out.println();
        System.out.println(infoHeader);
        System.out.printf("%-25s %-50s %n", this.getPlayerHeader(),
                super.getFirstName()+" "+ super.getLastName()); 
        System.out.printf("%-25s %-50s %n", this.getClubHeader(), getClub());
        System.out.printf("%-25s %-50s %n", this.getPositionHeader(),getPlayerPosition());
        System.out.printf("%-25s %-50s %n", this.getNumberHeader(), getPlayerNumber());
        System.out.printf("%-25s %-50s %n", this.getBatsHeader(), getPlayerBats());
        System.out.printf("%-25s %-50s %n", this.getThrowsHeader(), getPlayerThrows());
        System.out.printf("%-25s %-50s %n", this.getDebutHeader(), getYearMLBDebut());
        System.out.println(infoHeader);
    }
  
}

