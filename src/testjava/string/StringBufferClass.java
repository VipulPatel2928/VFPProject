package testjava.string;

public class StringBufferClass {

	public static void main(String[] args) {

		String str = "Hello ";
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb1 = new StringBuffer(str);
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
		
		int price = 123456;
		
		System.out.println("Value of number before applying Reverse Operation: "+price);
		
		StringBuffer objnoBuffer = new StringBuffer(String.valueOf(price));
		
		System.out.println("Value of number after applying Reverse Operation: "+objnoBuffer.reverse());
		
		if(sb.equals(sb1)) {
			System.out.println("Both String Buffer objects are equal");
		}
		else {
			System.out.println("Both String Buffer objects are not equal");
		}

	}
}
