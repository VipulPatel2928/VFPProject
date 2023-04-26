package whiletest.com;

public class WhileClass {

	public static void main(String[] args) {

		String[] str = { "A", "B", "C", "D" };
		int i = 0;
		while (!str[i].equals("A")) {
			System.out.println(str[i] + " is not equal to " + "C");
			if (i < str.length)
				i++;
		}

		System.out.println("---- Now we are working with Do While loop ----");

		i = 0;
		do {
			System.out.println(str[i] + " is not equal to " + "C");
			if (i < str.length - 1)
				i++;
		} while (!str[i].equals("D"));

		do {
			System.out.println("Do while with false condition");

		} while (0 > 10);

		System.out.println("This is while condition");

	}

}
