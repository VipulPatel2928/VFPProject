package testjava.comments;

/**
 * @author Class is created by VP, 14 - April - 2023
 *
 */
public class CommentinJava {

	public void fun1(int i, int j) {
		System.out.println("fun 1");
	}

	public void fun2(short i, int j) {
		System.out.println("fun 2");
	}

	public void fun3() {
		System.out.println("fun 3");
	}

	public void fun4() {
		System.out.println("fun 4");
	}

	/**
	 * Generate Element Comment
	 */
	public void fun5() {
		System.out.println("fun 5");
	}

	public void fun6() {
		System.out.println("fun 6");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CommentinJava obJava = new CommentinJava();
		int test1, test2, test3;
		// Some sort cut used in eclipse to speed up the code

		// This statement describe how to use System.out.println statement
		System.out.println("Hello, I am learning Comments in Java");

		// For multiline comments we can use sort cut ctrl + shift + /
		// And if you want to remove the comment then we can use ctrl + shift + \

		for (int i = 1; i < 12; i++) {
			System.out.println("Value of i is : " + i);
		}

		// For Format the program we can select the code first that need to be formatted
		// Bofre that select the all and use ctrl + a and use sort cut ctrl + shift + f

		// sysout + ctrl + space for System.out.println

		// Sort cut for going to the function ctrl + o
		// It will give you the list of the function and click on any function that you
		// want to code
		// and editor will take you to the function

		obJava.fun1(10, 10);

		obJava.login();

		String url = obJava.login();

		System.out.println("Function Returning the String Value :" + url);

	}

	private String login() {
		return "www.google.com";
	}

}
