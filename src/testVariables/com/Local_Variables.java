package testVariables.com;

public class Local_Variables {

	int i;

	public void pupAge() {
		int age = 0;
		int b;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
		//System.out.println("Value of b : " + b);
	}

	// Constructor there will be no return type in constructor
	public Local_Variables() {
		int age = 0;
		age = age + 10;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]) {
		Local_Variables test = new Local_Variables();
		test.pupAge();
		int age = 1;
		System.out.println(age);
		if (true) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
			int i = 0;
			int sum = i + 20;
			System.out.println(sum);
		}
	}
}
