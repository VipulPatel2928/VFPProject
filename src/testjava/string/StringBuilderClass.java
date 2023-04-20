package testjava.string;

public class StringBuilderClass {

	public static void main(String[] args) {

		String str = "Hello ";
		StringBuilder sb = new StringBuilder(str);
		sb.append("Java");
		System.out.println(sb);

		System.out.println(" ");
		sb.insert(1, "Java");
		System.out.println(sb);

		System.out.println(" ");
		sb.replace(1, 3, "Java");
		System.out.println(sb);

		System.out.println(" ");
		sb.delete(1, 3);
		System.out.println(sb);

		System.out.println(" ");
		sb.reverse();
		System.out.println(sb);
		
		// Write the code to Reverse the number and there is no conditions
		
		double price = 123456.99d;
		
		System.out.println("Value of number before applying Reverse Operation: "+price);
		
		StringBuffer objnoBuffer = new StringBuffer(String.valueOf(price));
		
		System.out.println("Value of number after applying Reverse Operation: "+objnoBuffer.reverse());

	}
}
