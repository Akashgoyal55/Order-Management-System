/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: QuestionAnswer.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.Objects;
//The QuestionAnswer class is responsible for checking the correctness of a student's answer and displaying appropriate responses.
public class QuestionAnswer {
 
	 // Static Data Fields
	
	 // A flag to indicate if there was a failure in any of the answer checks.
	 private static boolean failed = false;
	
	 // Instance Data Fields
	
	 // Fields to store the responses for right and wrong answers.
	 private static String rightAnswer;
	 private static String wrongAnswer;
	
	 // A flag to indicate if the current answer is right.
	 private boolean right = false;
	
	 // Constructors
	
	 // Constructor that accepts a student's answer and the correct answer as parameters, checks the correctness of the answer, and displays appropriate responses.
	 public QuestionAnswer(String studentAnswer, String correctAnswer) {
	
	     // Set responses based on the current language.
	     switch (Language.getCurrentLanguage().getLanguage()){
	         case "ENGLISH" -> {
	             rightAnswer = Club.getShortName() + ": Correct!";
	             wrongAnswer = Club.getShortName() + ": Oops...";
	         }
	         default -> {
	             rightAnswer = Club.getShortName() + Language.getDefaultAlienSound().repeat(2);
	             wrongAnswer = rightAnswer;
	         }
	     }
	
	     // Check the correctness of the answer.
	     questionAnswer(studentAnswer, correctAnswer);
	
	     // Display the appropriate response based on the correctness of the answer.
	     if (right){
	         System.out.println(rightAnswer);
	     }
	     else{
	         System.out.println((wrongAnswer));
	         failed = true;
	     }
	 }

    //
    // Static Method
    //
    public void questionAnswer(String inputAnswer, String correctAnswer) {
        if (Objects.equals(inputAnswer.toUpperCase(), correctAnswer.toUpperCase())){
        	right = true;
        }
        else{
        	right = false;
        }
    }
    //
    // Instance Method
    //
    public static String getWrongAnswer() {
        return wrongAnswer;
    }
    public static boolean isFailed() {
        return failed;
    }
    //
    // Language
    //

    //
    // Override
    //
}