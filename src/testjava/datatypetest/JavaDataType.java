package testjava.datatypetest;

public class JavaDataType {

	public static void main(String[] args) {
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean boo;
		

		/*
		 * Stores whole numbers from -128 to 127 
		 * Stores whole numbers from -32,768 to 32,767 
		 * Stores whole numbers from -2,147,483,648 to 2,147,483,647 
		 * Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
		 * Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits 
		 * Stores fractional numbers. Sufficient for storing 15 decimal digits 
		 * Stores true or false values
		 */

        b = -128;
		System.out.println("Byte : " +b);
		b = 127 ;
		System.out.println("Byte : "+b);
		b= (byte) -1299;
		System.out.println("Byte : "+b);
		b = (byte) 1289 ;
		System.out.println("Byte : "+b);
		
		s = -32768;
		System.out.println("Short : "+s);
		s = 32767;
		System.out.println("Short : "+s);
		s = (short) -327699;
		System.out.println("Short : "+s);
		s = (short) 327689;
		System.out.println("Short : "+s);
		
		i = -2147483648;
		System.out.println("Int : "+i);
		i = 2147483647;
		System.out.println("Int : "+i);
		// Remove the comment to see the compiler errors
		//i = -2147483649;
		//i = 2147483648;
		
		l = -9223372036854775808L;
		System.out.println("Long : "+l);
		l = 9223372036854775807L;
		System.out.println("Long : "+l);
		// Remove the comment to see the compiler errors
		//l = -9223372036854775809L;
		//l = 9223372036854775808L;
		
		f = 1.23456789f;
		System.out.println("Float : "+f);
		f = 1.2345f;
		System.out.println("Float : "+f);
		f = 1.23456789123456789f;
		System.out.println("Float : "+f);
		
		d = 1.23456789987654321;
		System.out.println("Double : "+d);
		d = 1.23456789987654321987654321;
		System.out.println("Double : "+d);
		d = 1234567.23456719927654321987654321;
		System.out.println("Double : "+d);
		
		boo = true;
		System.out.println("Boolean : "+boo);
		if(boo) {
			System.out.println("Value of Boolean variable : "+boo);
		}
		boo = false;
		System.out.println("Boolean : "+boo);
		if(boo) {
			System.out.println("Value of Boolean variable : "+boo);
		}
		else {
			System.out.println("Value of Boolean variable : "+boo);
		}
		
		char ch = 'A';
		String str = "A";
		System.out.println(ch);
		System.out.println(str);
		
	}
}

