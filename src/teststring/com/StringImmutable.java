package teststring.com;

public class StringImmutable {
	
	public void display() {
		System.out.println("This is the display function from StringImmutable");
	}

	public static void main(String[] args) {
		
		String str1 = "Java Programming 1";
		String str2 = "Java Programming";
		String str3 = "Java Programming";

		System.out.println(str1.substring(3));

		System.out.println(str1);

		System.out.println(str2.concat(" is Easy to learn"));

		System.out.println(str1);

		System.out.println(str2);

		System.out.println(str3);

		
		  str1 = "Java Programming is not easy to learn";
		  
		  System.out.println(str1);
		  
		  System.out.println(str2);
		  
		  System.out.println(str3);
		 
		  if(str2==str3)
			  System.out.println("String are matched");
		  else 
			  System.out.println("String are not matched");
		  
		  String str4 = new String("Java Programming");
		  String str5 =  new String("Java Programming");
		  
		  if(str4==str5)
			  System.out.println("String are matched");
		  else 
			  System.out.println("String are not matched");
		  
		  StringImmutable obj = new StringImmutable();
		  obj.display();
	}

}
