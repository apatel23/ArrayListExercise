import java.util.Scanner;

/*
 * FILE: Assignment.java
 * AUTHORS: Alex Patel, Eric Sheeder
 * 
 */


public class Assignment {

	private String course;
	private String homeworkTitle;
	private int hours;
	private String dueDate;
	
	public void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which course is the assignment for?");
		course = scan.nextLine();
		System.out.println("What is the name of the assignment?");
		homeworkTitle = scan.nextLine();
		System.out.println("How long will the assignment take to complete?");
		hours = scan.nextInt();
		System.out.println("When is the assignment due?");
		dueDate = scan.next();
	}
	
	
	@Override
	public String toString() {
		return "Your assignment: \nHomework " + homeworkTitle + " for " + course + " is due " 
				+ dueDate + " and will probably take " + hours + " hour(s) to complete.";
	}

}
