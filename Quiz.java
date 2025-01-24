/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * Author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
//The Quiz class is responsible for managing a quiz session, including setting up questions and feedback messages based on the selected language.
public final class Quiz {
 
	 // Instance Data Fields
	
	 // Fields to store the feedback messages and quiz questions.
	 private String feedbackPassed;
	 private String feedbackFailed;
	 private String quizStart;
	 private String firstQuestion;
	 private String secondQuestion;
	 private String thirdQuestion;
	 private String fourthQuestion;
	 private String fifthQuestion;
	 private String sixthQuestion;
	
	 // A reference to a QuestionAnswer object to manage the answers during the quiz.
	 private QuestionAnswer answer;
	
	 // Constructors
	
	 // Constructor that accepts a language parameter and populates the quiz questions based on the selected language.
	 public Quiz(String language) {
	     switch(language){
	         case "ENGLISH" -> populateEnglishQuestions();
	         default -> populateAlienQuestions();
	     }
	 }
	
	 // Instance Methods
	
	 // Method to display a quiz question.
	 public void askQuestion(String question){
	     System.out.println(question);
	 }
	
	 // Method to populate the quiz with English questions.
	 public void populateEnglishQuestions(){
	     setQuizStart("*** FREE TICKETS to SF GIANTS Games *** _ 1 miss allowed _");
	     setFirstQuestion("Which type of class has 'protected' constructors?");
	     setSecondQuestion("What type of method did Java 8 add to 'interface'?");
	     setThirdQuestion("What new keyword did Java 13 add to 'switch' statement?");
	     setFourthQuestion("In Java 15, what keyword pairs with 'sealed'?");
	     setFifthQuestion("Giants in Spanish?");
	     setSixthQuestion("Take me out to the...?");
	     setFeedbackPassed("*** Congrats! You won FREE TICKETS to SF GIANTS Games ***");
	     setFeedbackFailed("____ Please try again at your graduation ceremony. ____");
	 }
	
	 // Method to populate the quiz with alien language questions.
	 public void populateAlienQuestions(){
	     String alien = Language.getCurrentLanguage().getLanguage();
	     setQuizStart(alien + alien);
	     setFirstQuestion(alien + alien);
	     setSecondQuestion(alien + alien);
	     setThirdQuestion(alien + alien);
	     setFourthQuestion(alien + alien);
	     setFifthQuestion(alien + alien);
	     setSixthQuestion(alien + alien);
	     setFeedbackPassed(alien);
	     setFeedbackFailed(alien);
	 }
    //
    // Additional Instance Methods
    //
    public void setFirstQuestion(String firstQuestion) {
        this.firstQuestion = firstQuestion;
    }
    public void setSecondQuestion(String secondQuestion) {
        this.secondQuestion = secondQuestion;
    }
    public void setQuizStart(String quizStart) {
        this.quizStart = quizStart;
    }
    public void setThirdQuestion(String thirdQuestion) {
        this.thirdQuestion = thirdQuestion;
    }
    public void setFourthQuestion(String fourthQuestion) {
        this.fourthQuestion = fourthQuestion;
    }
    public void setFifthQuestion(String fifthQuestion) {
        this.fifthQuestion = fifthQuestion;
    }
    public void setSixthQuestion(String sixthQuestion) {
        this.sixthQuestion = sixthQuestion;
    }
    public String getFirstQuestion() {
        return this.firstQuestion;
    }
    public String getSecondQuestion() {
        return this.secondQuestion;
    }
    public String getQuizStart() {
        return this.quizStart;
    }
    public String getThirdQuestion() {
        return this.thirdQuestion;
    }
    public String getFourthQuestion() {
        return this.fourthQuestion;
    }
    public String getFifthQuestion() {
        return this.fifthQuestion;
    }
    public String getSixthQuestion() {
        return this.sixthQuestion;
    }

    public void setFeedbackPassed(String feedbackPassed) {
        this.feedbackPassed = feedbackPassed;
    }
    public String getFeedbackPassed() {
        return feedbackPassed;
    }
    public String getFeedbackFailed() {
        return feedbackFailed;
    }
    public void setAnswer(QuestionAnswer answer) {
        this.answer = answer;
    }
    public QuestionAnswer getAnswer() {
    	return answer;
    }
    public void setFeedbackFailed(String feedbackFailed) {
        this.feedbackFailed = feedbackFailed;
    }
    //
    // Language
    //
}