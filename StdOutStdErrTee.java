/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.*;
//The StdOutStdErrTee class extends OutputStream and is responsible for managing the standard output and error streams.
public class StdOutStdErrTee extends OutputStream {

	 // Instance Data Fields
	
	 // Paths for standard output and error files, initialized to default paths from the Config class.
	 private String stdOutPath = Config.getDefaultStdOutFilePath();
	 private String stdErrPath = Config.getDefaultStdErrFilePath();
	
	 // Array of OutputStream objects to manage multiple output streams.
	 private OutputStream[] outputStreams = new OutputStream[2];
	
	 // Constructors
	
	 // Default constructor
	 public StdOutStdErrTee() {
	
	 }
	
	 // Constructor that accepts a PrintStream and a FileOutputStream to initialize the outputStreams array.
	 public StdOutStdErrTee(PrintStream printStream, FileOutputStream fileOutputStream) {
	     outputStreams[0] = printStream;
	     outputStreams[1] = fileOutputStream;
	 }
	
	 // Constructor that accepts paths for standard output and error files to set custom paths.
	 public StdOutStdErrTee(String stdOutPath, String stdErrPath) {
	     this.stdOutPath = stdOutPath;
	     this.stdErrPath = stdErrPath;
	 }
	
	 // Instance Methods
	
	 // Method to start logging by initializing the output streams and setting the system's standard output and error streams.
	 public void startLog() {
	     try{
	         FileOutputStream stdOut1 = new FileOutputStream(stdOutPath);
	         FileOutputStream stdErr1 = new FileOutputStream(stdErrPath);
	
	         StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, stdOut1);
	         StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, stdErr1);
	
	         PrintStream stdOut2 = new PrintStream(allStdOut);
	         PrintStream stdErr2 = new PrintStream(allStdErr);
	
	         System.setOut(stdOut2);
	         System.setErr(stdErr2);
	     }
	     catch(FileNotFoundException e){
	         e.printStackTrace();
	     }
	 }
	
	 // Method to stop logging by resetting the system's standard output and error streams to their original values.
	 public void stopLog() {
	     System.setOut(System.out);
	     System.setErr(System.err);
	 }
	
	 // Method to get the standard output file path, which varies based on the current language setting.
	 public String getStdOutFilePath() {
	     return Language.getCurrentLanguage().getLanguage() == "ENGLISH" ? stdOutPath : Language.getDefaultAlienSound();
	 }
	
	 // Method to get the standard error file path, which varies based on the current language setting.
	 public String getStdErrFilePath() {
	     return Language.getCurrentLanguage().getLanguage() == "ENGLISH" ? stdErrPath : Language.getDefaultAlienSound();
	 }
	
	 // Override Methods
	
	 // Overridden write method to write a byte to all output streams and flush them.
	 @Override
	 public void write(int b) throws IOException {
	     for (OutputStream stdOut : this.outputStreams) {
	         stdOut.write(b);
	         stdOut.flush();
	     }
	 }

}