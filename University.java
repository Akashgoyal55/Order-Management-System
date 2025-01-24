/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
//The University class extends the Organization class and represents a university entity with various attributes such as name, motto, type, location, etc. It contains methods to populate university details in English and an alien language.
public final class University extends Organization {
 
	 // Static Data Fields
	
	 // Holds the current language setting.
	 private static final String language = Language.getCurrentLanguage().getLanguage();
	
	 // Header information for displaying university details.
	 private static String infoHeader;
	
	 // Instance Data Fields
	
	 // Various attributes of a university.
	 private String name;
	 private String latinMotto; 
	 private String englishMotto;
	 private String type;
	 private String location;
	 private String address;
	 private String primaryColor, secondaryColor;
	 private String nickName;
	 private String mascot;
	 private String website;
	
	 // The year the university was established.
	 private int establishmentYear;
	
	 // Headers for displaying various university attributes.
	 private String nameHeader;
	 private String latinMottoHeader;
	 private String englishMottoHeader;
	 private String typeHeader;
	 private String establishmentHeader;
	 private String locationHeader;
	 private String addressHeader;
	 private String colorsHeader;
	 private String nickNameHeader;
	 private String mascotHeader;
	 private String websiteHeader;
	
	 // Constructors
	
	 // Default constructor.
	 public University(){
	
	 }
	
	 // Constructor that accepts a name parameter and populates university details based on the current language setting.
	 public University(String name) {
	     switch(language){
	         case "ENGLISH" -> {
	             populateUniversityEnglish();
	             this.name = name;
	         }
	         default -> {
	             populateUniversityAlien();
	             this.name = language;
	         }
	     }
	 }

    //
    // Instance Methods
    //
    private void populateUniversityEnglish(){
        setName("San Francisco State University");
        setLatinMotto("Experientia Docet");
        setEnglishMotto("Experience Teaches");
        setType("Public");
        setEstablishmentYear(1899);
        setLocation("San Francisco, California, United States");
        setAddress("1600 Holloway Avenue, San Francisco, CA 94132");
        setPrimaryColor("Purple");
        setSecondaryColor("Gold");
        setNickName("Gators");
        setMascot("Gator");
        setWebsite("www.sfsu.edu");
        setInfoHeader("-".repeat(70));
        setNameHeader("Official name:");
        setLatinMottoHeader("Motto in Latin:");
        setEnglishMottoHeader("Motto in English");
        setTypeHeader("Type:");
        setEstablishmentHeader("Year of Establishment:");
        setLocationHeader("Location:");
        setAddressHeader("Address:");
        setColorsHeader("Colors");
        setNickNameHeader("Nickname:");
        setMascotHeader("Mascot:");
        setWebsiteHeader("Website:");
    }
    private void populateUniversityAlien(){
        setName(language);
        setLatinMotto(language);
        setEnglishMotto(language);
        setType(language);
        setEstablishmentYear(1899);
        setLocation(language);
        setAddress(language);
        setPrimaryColor(language);
        setSecondaryColor(language);
        setNickName(language);
        setMascot(language);
        setWebsite(language);
        setInfoHeader(language);
        setNameHeader(language);
        setLatinMottoHeader(language);
        setEnglishMottoHeader(language);
        setTypeHeader(language);
        setEstablishmentHeader(language);
        setLocationHeader(language);
        setAddressHeader(language);
        setColorsHeader(language);
        setNickNameHeader(language);
        setMascotHeader(language);
        setWebsiteHeader(language);
    }
    //
    // Additional Methods
    //
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLatinMotto() {
        return latinMotto;
    }
    public void setLatinMotto(String latinMotto) {
        this.latinMotto = latinMotto;
    }
    public String getEnglishMotto() {
        return englishMotto;
    }
    public void setEnglishMotto(String englishMotto) {
        this.englishMotto = englishMotto;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getMascot() {
        return mascot;
    }
    public void setMascot(String mascot) {
        this.mascot = mascot;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public int getEstablishmentYear() {
        return establishmentYear;
    }
    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
    public String getNameHeader() {
        return nameHeader;
    }
    public void setNameHeader(String nameHeader) {
        this.nameHeader = nameHeader;
    }
    public String getLatinMottoHeader() {
        return latinMottoHeader;
    }
    public void setLatinMottoHeader(String latinMottoHeader) {
        this.latinMottoHeader = latinMottoHeader;
    }
    public String getEnglishMottoHeader() {
        return englishMottoHeader;
    }
    public void setEnglishMottoHeader(String englishMottoHeader) {
        this.englishMottoHeader = englishMottoHeader;
    }
    public String getTypeHeader() {
        return typeHeader;
    }
    public void setTypeHeader(String typeHeader) {
        this.typeHeader = typeHeader;
    }
    public String getEstablishmentHeader() {
        return establishmentHeader;
    }
    public void setEstablishmentHeader(String establishmentHeader) {
        this.establishmentHeader = establishmentHeader;
    }
    public String getLocationHeader() {
        return locationHeader;
    }
    public void setLocationHeader(String locationHeader) {
        this.locationHeader = locationHeader;
    }
    public String getAddressHeader() {
        return addressHeader;
    }
    public void setAddressHeader(String addressHeader) {
        this.addressHeader = addressHeader;
    }
    public String getColorsHeader() {
        return colorsHeader;
    }
    public void setColorsHeader(String colorsHeader) {
        this.colorsHeader = colorsHeader;
    }
    public String getNickNameHeader() {
        return nickNameHeader;
    }
    public void setNickNameHeader(String nickNameHeader) {
        this.nickNameHeader = nickNameHeader;
    }
    public String getMascotHeader() {
        return mascotHeader;
    }
    public void setMascotHeader(String mascotHeader) {
        this.mascotHeader = mascotHeader;
    }
    public String getWebsiteHeader() {
        return websiteHeader;
    }
    public void setWebsiteHeader(String websiteHeader) {
        this.websiteHeader = websiteHeader;
    }
    public void setInfoHeader(String infoHeader) {
        University.infoHeader = infoHeader;
    }
    //
    // Language
    //

    //
    // Override
    //
    @Override
    public void displayMission(){
    }
    @Override
    public void displayAbout() {
        System.out.println();
        System.out.println(infoHeader);
        System.out.printf("%-25s %-50s %n", this.getNameHeader(), getName());
        System.out.printf("%-25s %-50s %n", this.getLatinMottoHeader(), getLatinMotto());
        System.out.printf("%-25s %-50s %n", this.getEnglishMottoHeader(), getEnglishMotto());
        System.out.printf("%-25s %-50s %n", this.getTypeHeader(), getType());
        System.out.printf("%-25s %-50s %n", this.getEstablishmentHeader(), getEstablishmentYear());
        System.out.printf("%-25s %-50s %n", this.getLocationHeader(), getLocation());
        System.out.printf("%-25s %-50s %n", this.getAddressHeader(), getAddress());
        System.out.printf("%-25s %-50s %n", this.getColorsHeader(), getPrimaryColor() +  ", " + getSecondaryColor());
        System.out.printf("%-25s %-50s %n", this.getNickNameHeader(), getNickName());
        System.out.printf("%-25s %-50s %n", this.getMascotHeader(), getMascot());
        System.out.printf("%-25s %-50s %n", this.getWebsiteHeader(), getWebsite());
        System.out.println(infoHeader);
    }
}