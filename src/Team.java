import java.util.ArrayList;
import java.util.Scanner;

/*
 * FILE: Team.java
 * AUTHORS: Alex Patel, Eric Sheeder
 * 
 */

public class Team extends Assignment {

	ArrayList<String> teamMembers = new ArrayList<String>();
	private int numberOfMembers;
	private String memberName;
	
	public void inputData() {
		super.inputData();
		Scanner scan = new Scanner(System.in);
		System.out.println("How many team members do you have? ");
		numberOfMembers = scan.nextInt();
		System.out.println("Enter team member(s) names: ");
		for(int i = 0; i < numberOfMembers + 1; i++) {
			
			memberName = scan.nextLine();
			teamMembers.add(memberName);
		}
		teamMembers.remove(0);
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Team members: " + teamMembers;
	}

}
