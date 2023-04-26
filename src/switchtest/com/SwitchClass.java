package switchtest.com;

public class SwitchClass {

	public static void main(String[] args) {
		int key = 3;

		switch (key) {
		case 1:
			System.out.println("This is case 1");
			break;
		case 2:
			System.out.println("This is case 2");
			break;
		case 3:
			System.out.println("This is case 3");
			break;

		default:
			System.out.println("This is default");
			break;
		}

		char c = 'A';

		switch (c) {
		case 'A':
			System.out.println("This is case A");
			break;
		case 'B':
			System.out.println("This is case B");
			break;
		case 'C':
			System.out.println("This is case C");
			break;

		default:
			System.out.println("This is default");
			break;
		}

		
		String str = "B";

		switch (str) {
		case "A" :
			System.out.println("This is case A");
			break;
		case "B":
			System.out.println("This is case B");
			break;
		case "C":
			System.out.println("This is case C");
			break;

		default:
			System.out.println("This is default");
			break;
		}

	}
}
