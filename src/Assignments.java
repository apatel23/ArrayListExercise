import java.util.ArrayList;
import java.util.Scanner;

/*
 * FILE: Assignments.java
 * AUTHORS: Alex Patel, Eric Sheeder
 * 
 */

public class Assignments {
	
	public Assignments() {
		super();
	}

	ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	
	public void addAssignment(Assignment assignment, Team team) {
		System.out.println("Is this an individual(I) or team assignment(T)?");
		Scanner scan = new Scanner(System.in);
		String tOrI = scan.next();
		if (tOrI.equals("I")) {
			assignment.inputData();
			assignments.add(assignment);
		}
		if (tOrI.equals("T")) {
			team.inputData();
			assignments.add(team);
		}
		
	}
	
	public void printLine() {
		for( int i = 0; i < assignments.size(); i++)
		{
			System.out.println(assignments.get(i).toString());
		}
	}

	public static void main(String[] args) {
		Team team = new Team();
		Assignment assignment = new Assignment();
		Assignments assignments = new Assignments();
		assignments.addAssignment(assignment, team);
		assignments.addAssignment(assignment, team);
		assignments.printLine();
		
	}

}
