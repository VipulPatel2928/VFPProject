package testGenericFuction;

public class GenericClass {

	public static <A> void printArray( A[] inputArray ) {
	      // Display array elements
	      for(A element : inputArray) {
	         System.out.printf(" "+element);
	      }
	      System.out.println();
	   }

	public static <E> void printArray1(E inputanydatatype ) {
	      // Display Single element
	         System.out.printf(" "+inputanydatatype);
	         System.out.println();
	         System.out.println(String.valueOf(inputanydatatype)+"789");
	      }
	public static void main(String[] args) {
		
		 // Create arrays of Integer, Double and Character
	    Integer[] intArray = { 1, 2, 3, 4, 5 };
	    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	    System.out.println("Array integerArray contains:");
	    printArray(intArray);   // pass an Integer array

	    System.out.println("\nArray doubleArray contains:");
	    printArray(doubleArray);   // pass a Double array

	    System.out.println("\nArray characterArray contains:");
	    printArray(charArray);   // pass a Character array
	    System.out.println();
	    
	    System.out.println("integer contains:");
	    printArray1(50000);   // pass an Integer array

	    System.out.println("\ndouble contains:");
	    printArray1(20.456789);   // pass a Double array

	    System.out.println("\ncharacter contains:");
	    printArray1("JAVA");   // pass a Character array/String
	}
}
