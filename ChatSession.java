/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * The ChatSession class handles the chat session including starting, running quizzes, and stopping the session.
 */
public final class ChatSession {

    //
    // Instance Data Fields
    //
	private Club club; // Represents the club in the chat session
    private University university; // Represents the university in the chat session
    private Person student; // Represents the student in the chat session
    private Person player; // Represents the player in the chat session
    private Quiz quiz; // Represents the quiz in the chat session
    private Receipt receipt; // Represents the receipt in the chat session

    //
    // Constructors
    //
    public ChatSession() {
        // Future implementation
    }
    public ChatSession(Club club, University university){
        this.club = club;
        this.university = university;
    }
    //
    // Instance Methods
    //
    public void runChatSession() {
        startChatSession(Language.getCurrentLanguage().getLanguage());
        startReceipt();
        connectChatters();
        chat();
        runQuiz();
        stopChatSession();
    }

    // Private Instance Methods
    private void startChatSession(String language) {
        displayTimerInformation();
        String start; 
        if (language == Language.getDefaultAlienSound()){
            System.out.println(language + "\n");

            club.sayGreeting(0);
            club.displayAbout();

            checkInput();

			Scanner studentInput = new Scanner(System.in);
				club.sayGreeting(2);
				student.setEmail(studentInput.nextLine());

            student.sayGreeting(student.getHeader());
            student.sayGreeting(student.getGreetings(0));
            university.displayAbout();

            club.sayGreeting(3);

        }

        else{
            start = "Chat session started.\n";
            System.out.println(start);

            club.sayGreeting(0);
            club.displayAbout();

            checkInput();

			Scanner studentInput = new Scanner(System.in);
				club.sayGreeting(2);
				student.setEmail(studentInput.nextLine());

            student.sayGreeting(student.getHeader());
            student.sayGreeting(student.getGreetings(0));
            university.displayAbout();

            club.sayGreeting(3);

        }
    }

    private void connectChatters() {
        System.out.println();
        try{
            for(int i = 0; i < 5; ++i){
                System.out.print(". ");
                TimeUnit.SECONDS.sleep(1);
            }
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        
        System.out.println("\nPress 1 to chat with Buster Posey \n2 for Alex Wood \n3 for Logan Webb \n4 for Joey Bart");
        Scanner studentInput=new Scanner(System.in);
        int num=studentInput.nextInt();
        String currentLanguage = Language.getCurrentLanguage().getLanguage();
        String firstName = "";
        String lastName = "";
        String position = "";
        int number = 0, debutYear = 0;
        String bats = "", throws_ = "";

        switch (num) {
            case 1:
                firstName = "Buster";
                lastName = "Posey";
                position = "Catcher";
                number = 28;
                debutYear = 2009;
                bats = "Right";
                throws_ = "Right";
                break;
            case 2:
                firstName = "Alex";
                lastName = "Wood";
                position = "Pitcher";
                number = 57;
                debutYear = 2013;
                bats = "Right";
                throws_ = "Left";
                break;
            case 3:
                firstName = "Logan";
                lastName = "Webb";
                position = "Pitcher";
                number = 69;
                debutYear = 2019;
                bats = "Right";
                throws_ = "Right";
                break;
            case 4:
                firstName = "Joey";
                lastName = "Bart";
                position = "Catcher";
                number = 21;
                debutYear = 2020;
                bats = "Right";
                throws_ = "Right";
                break;
            default:
                break;
        }

        if ("ENGLISH".equals(currentLanguage)) {
        	this.player = new Player(firstName, lastName);
            player.setEnglishInfo(position, number, bats, throws_, debutYear);
        } else {
        	firstName = "~ ąļīæń ~ ";
            lastName = "~ ąļīæń ~ ";
            this.player = new Player(firstName, lastName);
            player.setAlienInfo(number, debutYear);
        }

        player.displayPlayerInfo();

        try{
            for(int i = 0; i < 5; ++i){
                System.out.print(". ");
                TimeUnit.SECONDS.sleep(1);
            }
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    private void chat() {
        System.out.println();
        player.sayGreeting(player.getHeader());
        player.sayGreeting(player.getGreetings(0));
        student.sayGreeting(student.getFirstName());
        player.sayGreeting(player.getGreetings(1));

        System.out.println();
        player.sayGreeting(player.getHeader());
        player.sayGreeting(player.getGreetings(2));

		Scanner studentInput = new Scanner(System.in);
		System.out.println();
		student.sayGreeting(student.getHeader());
		studentInput.nextLine();
		player.sayGreeting(player.getHeader());
		player.sayGreeting(player.getGreetings(3));
		student.sayGreeting(student.getFirstName());
		player.sayGreeting(player.getGreetings(4));

		receipt.write(getTimerInfo() + "Transaction started.\n\n");
		receipt.write(player.getFirstName() + " " + player.getLastName());
		receipt.write(", " + Player.getPlayerNumber()
		        + " | " + club.getClubName().toUpperCase() + "\n");
		receipt.write(student.getFirstName() + " " + student.getLastName());
		receipt.write(", " + student.getEmail()
		        + " | " + university.getName().toUpperCase() + "\n");
		
		System.out.println();
		getHowManyCards();

		receipt.write(String.valueOf(Student.getCard().getCardCount()) + "\n");
		receipt.write("-".repeat(70) + "\n");
		getCardInfo(Student.getCard().getCardCount());

		player.sayGreeting(player.getHeader());
		player.sayGreeting(player.getGreetings(9));
		student.sayGreeting(student.getFirstName());
		player.sayGreeting(player.getGreetings(10));

		printTheCards();

		student.sayGreeting(student.getHeader());
		studentInput.nextLine();
        player.sayGreeting(player.getHeader());
        player.sayGreeting(player.getGreetings(11));
        student.sayGreeting(student.getFirstName());
        player.sayGreeting(player.getGreetings(12));
        System.out.println();
    }

    private void printTheCards() {
        try {
            System.out.println();
            int n = Student.getCard().getCardArray().size();
            for(int i = 0; i < n; i++){
               SFGiantsCardGenerator.generateSFGiantsCard
                        (Student.getCard().getSingleCard(i).getCardRecipient(),               
                                Student.getCard().getSingleCard(i).getCardMessage(),   
                                student.getFirstName(), student.getEmail(),      
                                Student.getCard().getSingleCard(i).getArtSymbol().charAt(0), 
                                Student.getCard().getSingleCard(i).getArtSize(),             
                                Student.getCard().getSingleCard(i).getArtFont());        
                System.out.println();
               
                receipt.write(Student.getCard().getSingleCard(i).getCardRecipient() + "\n");
                receipt.write(Student.getCard().getSingleCard(i).getArtSymbol() + "\n");
                receipt.write(Student.getCard().getSingleCard(i).getCardMessage() + "\n");
                receipt.write("-".repeat(70) + "\n");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    private void runQuiz() {
        System.out.println();
        String club;

        if (Language.getCurrentLanguage().getLanguage() == Language.getDefaultAlienSound()){
            club = Club.getShortName();
        }
        else{
            club = Club.getShortName() + ": ";
        }

        String studentHeader = student.getHeader();
        Scanner studentInput = new Scanner(System.in);

		quiz = new Quiz(Language.getCurrentLanguage().getLanguage());
		
		quiz.askQuestion(club + quiz.getQuizStart());
		quiz.askQuestion(club + quiz.getFirstQuestion());
		student.sayGreeting(studentHeader);
		quiz.setAnswer(new QuestionAnswer(studentInput.nextLine().toUpperCase(), "abstract"));

		quiz.askQuestion(club + quiz.getSecondQuestion());
		student.sayGreeting(studentHeader);
		quiz.setAnswer(new QuestionAnswer(studentInput.nextLine().toUpperCase(), "default"));

		quiz.askQuestion(club + quiz.getThirdQuestion());
		student.sayGreeting(studentHeader);
		quiz.setAnswer(new QuestionAnswer(studentInput.nextLine().toUpperCase(), "yield"));

		quiz.askQuestion(club + quiz.getFourthQuestion());
		student.sayGreeting(studentHeader);
		quiz.setAnswer(new QuestionAnswer(studentInput.nextLine().toUpperCase(), "permits"));

		quiz.askQuestion(club + quiz.getFifthQuestion());
		student.sayGreeting(studentHeader);
		quiz.setAnswer(new QuestionAnswer(studentInput.nextLine().toUpperCase(), "Gigantes"));

		quiz.askQuestion(club + quiz.getSixthQuestion());
		student.sayGreeting(studentHeader);
		quiz.setAnswer(new QuestionAnswer(studentInput.nextLine().toUpperCase(), "Ball Game"));

        if (QuestionAnswer.isFailed()){
            System.out.println(quiz.getFeedbackFailed());
            receipt.write("*** FAILED quiz. Didn't get FREE TICKETS. ***\n\n");

        }
        else{
            System.out.println(quiz.getFeedbackPassed());
            receipt.write("*** PASSED quiz. Got FREE TICKETS. ***\n\n");
        }

        receipt.write(getTimerInfo() + "Transaction ended.");
        receipt.stopLog();

    }

    private void stopChatSession() {
        displayTimerInformation();
        
        if (Objects.equals(Language.getCurrentLanguage().getLanguage(), "ENGLISH")){
            System.out.println("Chat session ended.");
        }
        else{
            System.out.print(Language.getCurrentLanguage().getLanguage());
        }

        Messenger.getConfig().getStdOutStdErrTee().stopLog();
    }

    private void startReceipt(){
        receipt = new Receipt(student.getFirstName(), student.getLastName(), student.getEmail());
        receipt.startLog();
        receipt.write(Config.getOfficialAppHeader() + "\n");
    }
        // Private instance Methods

    //
    // Additional Private Instance Methods
    //
    private void checkInput(){
		Scanner studentInput = new Scanner(System.in);
		String userInput;
		String[] elements = null;

		while(true){
		    club.sayGreeting(1);

		    userInput = studentInput.nextLine();
		    elements = userInput.split("\\s");
		    if (elements.length == 2){
		        break;
		    }
		    else {
		        System.out.println("Input Error.");
		    }
		}
		
		student = new Student(elements[0], elements[1]);
    }
    private static void displayTimerInformation(){
        System.out.print(Timer.getDateFormat());
    }
    private static String getTimerInfo(){
        return Timer.getDateFormat();
    }
    private void getHowManyCards(){
        Scanner userInput = new Scanner(System.in);
		int count = 3;

		while(count != -1){
		    player.sayGreeting(player.getHeader());
		    player.sayGreeting(player.getGreetings(5));
		    System.out.println();
		    student.sayGreeting(student.getHeader());
		    try{
		    	
		        Student.getCard().setCardCount(userInput.nextInt());
		        break;
		    }
		    catch(InputMismatchException e){
		        userInput.nextLine();
		        System.err.println(e); 
		        System.out.println("Please enter an INTEGER " + count + " tries left.");
		        count--;
		    }
		}
    }
    private void getCardInfo(int n){
        player.sayGreeting(player.getHeader());
        player.sayGreeting(player.getGreetings(6));
        System.out.println();
        for(int i = 1; i <= n; ++i){
           
            player.sayGreeting(player.getHeader());
            player.sayGreeting(player.getGreetings(7) + i + player.getGreetings(8));
 
            System.out.println();
            for(int j = 1; j <= 3; ++j){
                student.sayGreeting(student.getHeader() + " [" + j + "] ");
                Scanner studentInput = new Scanner(System.in);
				
				if (j == 1){
				    Student.getCard().setCardRecipient(studentInput.nextLine());
				}
				else if (j == 2){
				    Student.getCard().setArtSymbol(studentInput.nextLine());
				}
				else{
				    Student.getCard().setCardMessage(studentInput.nextLine());
				}
            }
            
            Student.getCard().getCardArray().add(new Card(Student.getCard().getCardRecipient(),
                    Student.getCard().getArtSymbol(), Student.getCard().getCardMessage(), 12,""));
        }
    }
    //
    // Language
    //
}