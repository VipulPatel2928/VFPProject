package testryCatch.com;

public class TryCatchClass {

	public static void main(String[] args) {
		
		try {
			String[] str = {"C++","Java","Programming"};
			for(int i=0;i<str.length;i++)
			System.out.println("String Array Value :"+str[i]);	
			System.out.println(str[5]);
			System.out.println("We are in try block");
			System.out.println("We are in try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This is custom Exception Massgae :"+e);
		}
		System.out.println("Exception occured");
		
		System.out.println("-----------------------------------------------------------");
		try {
            int p = 10/0;	
			System.out.println("We are in try block");
			System.out.println("We are in try block");
		} catch (ArithmeticException e) {
			System.out.println("This is custom Exception Massgae :"+e);
		}
		finally {
			System.out.println("This finally block");
		}
		
		System.out.println("-----------------------------------------------------------");
		try {
			System.out.println("We are in try block");
			System.out.println("We are in try block");
		} catch (ArithmeticException e) {
			System.out.println("This is custom Exception Massgae :"+e);
		}
		finally {
			System.out.println("This finally block");
		}
		
		System.out.println("-----------------------------------------------------------");
		try {
			System.out.println("We are in try block");
		} finally {
			System.out.println("This finally block");
		}

		System.out.println("-----------------------------------------------------------");
		try {
			String[] str = {"C++","Java","Programming"};
			for(int i=0;i<str.length;i++)
			System.out.println("String Array Value :"+str[i]);	
			System.out.println(str[5]);
			System.out.println("We are in try block");
			System.out.println("We are in try block");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This is custom Exception Massgae :"+e);
		}catch (Exception e) {
			System.out.println("This is custom Exception Massgae :"+e);
		}
		System.out.println("Exception occured");
		
		System.out.println("-----------------------------------------------------------");
		try {
			int p = 50/0;
			System.out.println("We are in try block");
		} finally {
			System.out.println("This finally block");
		}
		
	}
}
