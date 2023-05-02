package ifelseStatement.com;

public class IfElseClass {

	public static void main(String[] args) {
		int age = 12;
		String citizen = "Indian";
		// when programmer is dealing with one or two possible outcomes
		
		if(citizen.equals("Indian")) {
			if(age >=18) {
				System.out.println("You are eligible for the Vote");}
			else {
				System.out.println("You are not eligible for the Vote");}
		}
		else {
			System.out.println("Person is not Indian Citizen");
		}
		
		// Student Grade
		int grade = 40;
		
		if(grade < 40) {
			System.out.println("Student is fail");
		}
		else if (grade >=40 && grade <=50) {
			System.out.println("Student obtained Pass class");
		}
		else if (grade >=51 && grade <=60) {
			System.out.println("Student obtained second class");
		}
		else if (grade >=61 && grade <=70) {
			System.out.println("Student obtained First class");
		}

	}
}
