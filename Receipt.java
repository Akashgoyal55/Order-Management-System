/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Receipt.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//The Receipt class is responsible for managing the creation and writing of receipt logs.
public final class Receipt {

	 // The path where the log file will be created, initialized to the default log directory path from the Config class.
	 private String logPath = Config.getDefaultLogDirectoryPath();
	 
	 // A FileOutputStream object to handle writing to the log file.
	 private FileOutputStream logFile;
	
	 // Constructors
	
	 // Default constructor
	 public Receipt() {
	
	 }
	
	 // Constructor that accepts first name, last name, and email to create a log file with a specific name format.
	 public Receipt(String firstName, String lastName, String email){
	     this.logPath += "Receipt-" + firstName.toUpperCase() + "-"
	             + lastName.toUpperCase() + "-" + email + ".log";
	 }
	
	 // Instance Methods
	
	 // Method to start the log by initializing the FileOutputStream object with the specified log path.
	 public void startLog(){
	     try{
	         logFile = new FileOutputStream(logPath);
	     }
	     catch(FileNotFoundException e){
	         e.printStackTrace();
	     }
	 }
	
	 // Method to write a string to the log file.
	 public void write(String toWrite){
	     byte[] byteArray = toWrite.getBytes();
	     try{
	         logFile.write(byteArray);
	     }
	     catch (IOException e){
	         e.printStackTrace();
	     }
	 }
	
	 // Method to close the log file and delete it upon program exit.
	 public void stopLog(){
	     try {
	         logFile.close();
	         File f = new File(logPath);
	         f.deleteOnExit();
	     }
	     catch (IOException e){
	         e.printStackTrace();
	     }
	 }
    //
    // Additional Methods
    //

    //
    // Language
    //
}