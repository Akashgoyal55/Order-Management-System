/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

/**
*The Club class extends the Organization class and represents a club in the chat session.
*/
public final class Club extends Organization {

	 // Instance Data Fields
	
	 // Objects
	 private FrontOffice office; // Represents the front office of the club
	
	 // Non-Header Strings
	 private final String language = Language.getCurrentLanguage().getLanguage(); // Current language setting
	 private String club; // Name of the club
	 private String stadium; // Name of the stadium
	 private String primaryColor, secondaryColor, tertiaryColor, quaternaryColor; // Colors associated with the club
	
	 // Header Strings
	 // Various header strings for displaying club information
	 private String infoHeader, clubHeader, shortNameHeader, stadiumHeader, colorsHeader, ownersHeader, 
	                presidentHeader, generalManagerHeader, managerHeader, establishDateHeader, 
	                championshipsHeader, leagueTitlesHeader, divisionsHeader, wildCardHeader;
	
	 // Integers representing various statistics about the club
	 private int establishDate, championships, leagueTitles, divisionTitles, wildCards;
	
	 // Static Data Fields
	 private static Object[] clubInfo; // Array to hold club information
	 private static String shortName; // Short name of the club
	
	 // Constructors
	 public Club() {
	     // Default constructor
	 }
	
	 public Club(String defClub){
	     // Constructor that initializes the club information based on the language setting
	     office = new FrontOffice(language);
	     switch(language){
	         case "ENGLISH" -> populateClubInfoEnglish(defClub);
	         case "SPANISH" -> populateClubInfoSpanish(defClub);
	         case "FUTURE" -> populateClubInfoFuture(defClub);
	         case "CHINESE" -> populateClubInfoChinese(defClub);
	         case "FRENCH" -> populateClubInfoFrench(defClub);
	         default -> populateClubInfoALien(Language.getDefaultAlienSound());
	     }
	
	     // Initializing the clubInfo array with various club details
	     clubInfo = new Object[]{
	         club, shortName, establishDate, primaryColor, secondaryColor,
	         tertiaryColor, quaternaryColor, stadium, championships,
	         leagueTitles, divisionTitles, wildCards,
	     };
	 }

    //
    // Static Methods
    //
    public static String getOfficialSong() {
        return "Take me out to the ball game";
    }
    
    public static Object getClubInfo(int i){
        return clubInfo[i];
    }
    //
    // Instance Methods
    //
    public void populateClubInfoEnglish(String club){
        setClubName(club);
        setShortName("SF Giants");
        setEstablishDate(1883);
        setPrimaryColor("Orange");
        setSecondaryColor("Black");
        setTertiaryColor("Gold");
        setQuaternaryColor("Cream");
        setStadium("Oracle Park");
        setChampionships(8);
        setLeagueTitles(23);
        setDivisionTitles(8);
        setWildCards(3);

        setInfoHeader("-".repeat(70));
        setClubHeader("Club:");
        setShortNameHeader("Short Name:");
        setEstablishDateHeader("Established in:");
        setColorsHeader("Colors:");
        setStadiumHeader("stadium:");
        setChampionshipsHeader("World Series Titles:");
        setLeagueTitlesHeader("NL Pennants:");
        setDivisionsHeader("Division Titles:");
        setWildCardHeader("Wild Card Berths:");
        setOwnersHeader("Owners:");
        setPresidentHeader("President:");
        setGeneralManagerHeader("General Manager:");
        setManagerHeader("Manager:");
    }
    private void populateClubInfoALien(String defaultAlienSound) {
        setClubName(defaultAlienSound);
        setShortName(defaultAlienSound);
        setEstablishDate(1883);
        setPrimaryColor(defaultAlienSound);
        setSecondaryColor(defaultAlienSound);
        setTertiaryColor(defaultAlienSound);
        setQuaternaryColor(defaultAlienSound);
        setStadium(defaultAlienSound);
        setChampionships(8);
        setLeagueTitles(23);
        setDivisionTitles(8);
        setWildCards(3);

        setInfoHeader(defaultAlienSound);
        setClubHeader(defaultAlienSound);
        setShortNameHeader(defaultAlienSound);
        setEstablishDateHeader(defaultAlienSound);
        setColorsHeader(defaultAlienSound);
        setStadiumHeader(defaultAlienSound);
        setChampionshipsHeader(defaultAlienSound);
        setLeagueTitlesHeader(defaultAlienSound);
        setDivisionsHeader(defaultAlienSound);
        setWildCardHeader(defaultAlienSound);
        setOwnersHeader(defaultAlienSound);
        setPresidentHeader(defaultAlienSound);
        setGeneralManagerHeader(defaultAlienSound);
        setManagerHeader(defaultAlienSound);
    }
    private void populateClubInfoFrench(String defClub) {
    }
    private void populateClubInfoChinese(String defClub) {
    }
    private void populateClubInfoFuture(String defClub) {
    }
    private void populateClubInfoSpanish(String defClub) {
    }
    
    public void displayAbout() {
        System.out.println();
        System.out.println(getInfoHeader());
        System.out.printf("%-25s %-50s %n", this.getClubHeader(), getClubInfo(0));
        System.out.printf("%-25s %-50s %n", this.getShortNameHeader(), getClubInfo(1));
        System.out.printf("%-25s %-50s %n", this.getEstablishDateHeader(), getClubInfo(2));
        System.out.printf("%-25s %-50s %n",
                this.getColorsHeader(), getClubInfo(3) +  ", " + getClubInfo(4) + ", " +
                getClubInfo(5) + ", " + getClubInfo(6));
        System.out.printf("%-25s %-50s %n", this.getStadiumHeader(), getClubInfo(7));
        System.out.printf("%-25s %-50s %n", this.getChampionshipsHeader(), getClubInfo(8));
        System.out.printf("%-25s %-50s %n", this.getLeagueTitlesHeader(), getClubInfo(9));
        System.out.printf("%-25s %-50s %n", this.getDivisionsHeader(), getClubInfo(10));
        System.out.printf("%-25s %-50s %n", this.getWildCardHeader(), getClubInfo(11));
        System.out.printf("%-25s %-50s %n", this.getOwnersHeader(), office.getOwnerGroup().getOwnerName());
        System.out.printf("%-25s %-50s %n", this.getPresidentHeader(),
                office.getPresident().getFirstName() + " " + office.getPresident().getLastName());
        System.out.printf("%-25s %-50s %n", this.getGeneralManagerHeader(),
                office.getGeneralManager().getFirstName() + " " + office.getGeneralManager().getLastName());
        System.out.printf("%-25s %-50s %n", this.getManagerHeader(),
                office.getManager().getFirstName() + " " + office.getManager().getLastName());
        System.out.println(getInfoHeader());
    }
    public void displayMission() {
        // useless I think
    }
    //
    // Additional Instance Methods
    //
    public String getClubName() {
        return club;
    }
    public void setClubName(String club) {
        this.club = club;
    }
    public static String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        Club.shortName = shortName;
    }
    public int getEstablishDate() {
        return establishDate;
    }
    public void setEstablishDate(int establishDate) {
        this.establishDate = establishDate;
    }
    public String getStadium() {
        return stadium;
    }
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
    public String getPrimaryColor() {
        return primaryColor;
    }
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }
    public String getSecondaryColor() {
        return secondaryColor;
    }
    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }
    public String getTertiaryColor() {
        return tertiaryColor;
    }
    public void setTertiaryColor(String tertiaryColor) {
        this.tertiaryColor = tertiaryColor;
    }
    public String getQuaternaryColor() {
        return quaternaryColor;
    }
    public void setQuaternaryColor(String quaternaryColor) {
        this.quaternaryColor = quaternaryColor;
    }
    public int getChampionships() {
        return championships;
    }
    public void setChampionships(int championships) {
        this.championships = championships;
    }
    public int geLeagueTitles() {
        return leagueTitles;
    }
    public void setLeagueTitles(int leagueTitles) {
        this.leagueTitles = leagueTitles;
    }
    public int getDivisionTitles() {
        return divisionTitles;
    }
    public void setDivisionTitles(int divisionTitles) {
        this.divisionTitles = divisionTitles;
    }
    public int getWildCards() {
        return wildCards;
    }
    public void setWildCards(int wildCards) {
        this.wildCards = wildCards;
    }
    public FrontOffice getTheOffice() {
        return office;
    }
    public void setTheOffice(FrontOffice office) {
        this.office = office;
    }

    public String getInfoHeader() {
        return infoHeader;
    }
    public void setInfoHeader(String infoHeader) {
        this.infoHeader = infoHeader;
    }
    public String getClubHeader() {
        return clubHeader;
    }
    public void setClubHeader(String clubHeader) {
        this.clubHeader = clubHeader;
    }
    public String getShortNameHeader() {
        return shortNameHeader;
    }
    public void setShortNameHeader(String shortNameHeader) { this.shortNameHeader = shortNameHeader;
    }
    public String getStadiumHeader() {
        return stadiumHeader;
    }
    public void setStadiumHeader(String stadiumHeader) {
        this.stadiumHeader = stadiumHeader;
    }
    public String getColorsHeader() {
        return colorsHeader;
    }
    public void setColorsHeader(String colorsHeader) {
        this.colorsHeader = colorsHeader;
    }
    public String getOwnersHeader() {
        return ownersHeader;
    }
    public void setOwnersHeader(String ownersHeader) {
        this.ownersHeader = ownersHeader;
    }
    public String getPresidentHeader() {
        return presidentHeader;
    }
    public void setPresidentHeader(String presidentHeader) {
        this.presidentHeader = presidentHeader;
    }
    public String getGeneralManagerHeader() {
        return generalManagerHeader;
    }
    public void setGeneralManagerHeader(String generalManagerHeader) {
        this.generalManagerHeader = generalManagerHeader;
    }
    public String getManagerHeader() {
        return managerHeader;
    }
    public void setManagerHeader(String managerHeader) {
        this.managerHeader = managerHeader;
    }
    public String getEstablishDateHeader() {
        return establishDateHeader;
    }
    public void setEstablishDateHeader(String establishDateHeader) {
        this.establishDateHeader = establishDateHeader;
    }
    public String getChampionshipsHeader() {
        return championshipsHeader;
    }
    public void setChampionshipsHeader(String championshipsHeader) {
        this.championshipsHeader = championshipsHeader;
    }
    public String getLeagueTitlesHeader() {
        return leagueTitlesHeader;
    }
    public void setLeagueTitlesHeader(String leagueTitlesHeader) {
        this.leagueTitlesHeader = leagueTitlesHeader;
    }
    public String getDivisionsHeader() {
        return divisionsHeader;
    }
    public void setDivisionsHeader(String divisionsHeader) {
        this.divisionsHeader = divisionsHeader;
    }
    public String getWildCardHeader() {
        return wildCardHeader;
    }
    public void setWildCardHeader(String wildCardHeader) {
        this.wildCardHeader = wildCardHeader;
    }

    //
    // Language
    //
    public void sayGreeting(int i ){
        office.sayGreeting(i);
    }
}