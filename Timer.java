/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all  given files in 1 same package
// Please make sure to read  provided "_ListOf-PleaseDoNotChange.txt"

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//The Timer class is responsible for handling time-related functionalities, including setting and getting the time zone preference.
public class Timer {
 
	 // Static Data Fields
	
	 // Singleton instance of the Timer class.
	 private static Timer Time = null;
	
	 // Abbreviation of the time zone.
	 private static String timezoneAbbr;
	
	 // List of valid time zone abbreviations.
	 private static final List<String> timeZoneList = new ArrayList<>(Arrays.asList("pst", "est", "cst"));
	
	 // DateFormat object to format date and time in a specific pattern.
	 private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss '['SSSS 'ms]' a z ' - ' ");
	
	 // Instance Data Fields
	
	 // String representing the time zone.
	 private String TIME_ZONE;
	
	 // Constructors
	
	 // Default constructor.
	 public Timer() {
	
	 }
	
	 // Constructor that accepts a time zone string and sets the TIME_ZONE and dateFormat accordingly.
	 public Timer(String time){
	     if(Language.getCurrentLanguage().getLanguage().equals(Language.getDefaultAlienSound())){
	         TIME_ZONE = Language.getDefaultAlienSound();
	     }
	     else if (Language.getCurrentLanguage().getLanguage().equals(Config.getDefaultLanguage())){
	         TIME_ZONE = time;
	     }
	     dateFormat.setTimeZone(TimeZone.getTimeZone(timezoneAbbr));
	 }
	
	 // Static Methods
	
	 // Method to get the formatted date and time as a string.
	 public static String getDateFormat() {
	     return dateFormat.format(new Date());
	 }
	
	 // Method to set the date format.
	 public static void setDateFormat(DateFormat dateFormat) {
	     Timer.dateFormat = (SimpleDateFormat) dateFormat;
	 }
	
	 // Method to set the time zone preference by taking input from the user.
	 public static Timer setTimeZonePreference(){
	     Scanner studentInput = new Scanner(System.in);
	     boolean loop = true;
	
	     String timerInput;
	     if(Language.getCurrentLanguage().getLanguage().equals(Language.getDefaultAlienSound())){
	         timerInput = Language.getDefaultAlienSound();
	     }
	     else{
	         timerInput = "Time Zone: ";
	     }
	
	     while(loop){
	         System.out.print(timerInput);
	         String s = studentInput.nextLine().toUpperCase();
	         switch (s){
	             case "PST" -> {
	                 timezoneAbbr = s;
	                 Time = new Timer("Pacific Standard Time in Day Light Saving");
	                 loop = false;
	             }
	             case "EST" -> {
	                 timezoneAbbr = "America/New_York";
	                 Time = new Timer("Eastern Standard Time in Day Light Saving");
	                 loop = false;
	             }
	             case "CST" -> {
	                 timezoneAbbr = s;
	                 Time = new Timer("Central Standard Time in Day Light Saving");
	                 loop = false;
	             }
	             default -> {
	                 String[] items = s.toLowerCase().split("\\s*,\\s*");
	                 for(String i : items){
	                     if (!timeZoneList.contains(i)){
	                         System.out.println("INVALID time zone. Please enter your time zone.");
	                         break;
	                     }
	                 }
	             }
	         }
	     }
	     return Time;
	 }
    
    //
    // Instance Methods
    //
    public String getTimeZoneFormatted() {
        return Time.TIME_ZONE;
    }
    
    //
    // Language
    //
}