package testjava.string;

public class StringClass {

	public static void main(String[] args) {

		// String index start with zero // In Java, string is basically an object
		// that represents sequence of char // values. // An array of characters works
		// same as Java string. For example:
		char[] ch = { 'h', 'e', 'l', 'l', 'o' };
		String s1 = new String(ch); // converting char array to string
		System.out.println("string as array : " + s1);
		System.out.println(ch[0]);
		String temp = s1.valueOf(ch);
		System.out.println(temp);

		// is same as: String s2 = "hello"; System.out.println(s2);

		String s3 = new String("world");// creating java string by new keyword
		System.out.println(s3);

		System.out.println(" ");

		String name = "Vipul";

		String name1 = new String("Vipul");

		if (name.equalsIgnoreCase(name1)) {
			System.out.println("String are matched");
		} else {
			System.out.println("String are not matched");
		}

		String name2 = new String("Vipul");

		if (name1.equalsIgnoreCase(name2)) {
			System.out.println("String are matched");
		} else {
			System.out.println("String are not matched");
		}

		if (name == name1) {
			System.out.println("String are matched");
		} else {
			System.out.println("String are not matched");
		}

		if (name1 == name2) {
			System.out.println("String are matched");
		} else {
			System.out.println("String are not matched");
		}

		// the length of a string can be found with the length() method:
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());

		System.out.println(" "); // There are many string methods available, for
		// example toUpperCase() and // toLowerCase()
		String mytxt = "Hello World";
		System.out.println(mytxt.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(mytxt.toLowerCase()); // Outputs "hello world"

		System.out.println(" ");

		// we can find particular character in a string by using indexof() method.
		// The indexOf() method returns the index (the position) of the first occurrence
		// of a specified text in a string (including whitespace).
		// Java counts positions from zero.
		// 0 is the first position in a string, 1 is the second, 2 is the third ...

		String findtxt = "Please locate where 'locate' occurs!";
		System.out.println("Position of locate : " + findtxt.indexOf("locate"));
		// Outputs 7

		System.out.println(" ");

		findtxt = "Please locate where 'locate' occurs!";
		System.out.println("Position of locate : " + findtxt.indexOf("l"));
		// Outputs 1

		System.out.println(" ");

		System.out.println(" ");

		// The + operator or concat() method can be used to combine two strings. This is
		// called concatenation:

		String firstName = "Vipul";
		String lastName = "Patel";
		System.out.println("String concatenation using + : " + firstName + " " + lastName);
		System.out.println("String concatenation using concat() : " + firstName.concat(lastName));

		// Because strings must be written within quotes, Java will misunderstand this
		// string, and generate an error:
		// String specialtxt = "We are testing "special" characters in a string.";
		// The solution to avoid this problem, is to use the backslash escape character.
		// The backslash (\) escape character turns special characters into string
		// characters.
		// The sequence \" inserts a double quote in a string.

		System.out.println(" ");
		String specialtxt = "We are testing \"special\" characters in a string.";
		System.out.println(specialtxt);

		// The sequence \' inserts a single quote in a string.
		String specialtxt1 = "It's alright.";
		System.out.println(specialtxt1);

		// The sequence \\ inserts a single backslash in a string.
		String specialtxt2 = "The character \\ is called backslash.";
		System.out.println(specialtxt2);

		// Java uses the + operator for both addition and concatenation.
		// Numbers are added. Strings are concatenated.
		// If you add two numbers, the result will be a number.

		// If you add two strings, the result will be a string concatenation.

		System.out.println(" ");
		String x = "10";
		String y = "20";
		String z = x + y;
		// z will be 1020 (a String) System.out.println("Value of z is : " + z);

		// If you add a number and a string, the result will be a string concatenation.
		x = "10";
		int inty = 20;
		z = x + inty; // z will be 1020 (a String)
		System.out.println("Value of z is : " + z);

		String str = "Vipul";

		if (str.equals("vipul")) // for single line code { } is not required
			System.out.println("\"Vipul\" is not equal \"vipul\"");
		else
			System.out.println("\"Vipul\" is not equal \"vipul\" else condition execution");

		if (str.equalsIgnoreCase("vipul"))
			System.out.println("\"Vipul\" is not equal \"vipul\" but possible with equalsIgnoreCase");

		str = "Vipul Patel";
		System.out.println(" ");
		int indexchar = str.indexOf('p');
		System.out.println("Index of \'p\' :" + indexchar);

		String substr = str.substring(0, (indexchar + 1));
		System.out.println("Find the position of the char and then take sub string up to that char :" + substr);

		String price = "$450";
		String price1 = "$500";

		// Do the total of the items price

		int p = Integer.parseInt(price.substring(1));
		System.out.println(p);
		int p1 = Integer.parseInt(price1.substring(1));

		int sum = p + p1;
		System.out.println("Value Of Sum: " + sum);

		System.out.println(" ");
		substr = str.substring(6);
		System.out.println("Return the String after given position :" + substr);

		char[] ch1 = str.toCharArray();
		System.out.println("[Not possible ]Converted the string in to char array :" + ch1);
		// ch1 is array so can't
		// print it with name

		// Reverse number shorted logic to clear the interview

		System.out.println(" ");

		System.out.println("[Not possible ]Converted the string in to char array :" + ch1[0]);

		// Reverse the Number

		int no = 123123123;

		String nostr = String.valueOf(no);

		char[] nochar = nostr.toCharArray();

		for (int i = nochar.length - 1; i >= 0; i--) {
			System.out.print(nochar[i]);
		}

		int number = 123456789;
		System.out.println("Print the number :" + number);

		nostr = String.valueOf(number);

		System.out.println("Print numer as string :" + nostr);

		System.out.println(" ");
		double d = 1500000.256d;

		nostr = String.valueOf(d);

		System.out.println("Print double as string :" + nostr);

		System.out.println(" ");
		char[] chno = nostr.toCharArray();

		System.out.print("Reverse Number :");

		for (int i = chno.length - 1; i >= 0; i--) {
			System.out.print(chno[i]);
		}

		System.out.println(" ");
		String splitstr = "18/04/2021";
		String[] aftersplit = splitstr.split("/");
		for (String strloop : aftersplit) {
			System.out.println("Backslash Use of string split function :" + strloop);
		}

		splitstr = "18-04-2021";
		aftersplit = splitstr.split("-");
		for (String strloop : aftersplit) {
			System.out.println("Hypern Use of string split function :" + strloop);
		}

		splitstr = "18_04_2021";
		aftersplit = splitstr.split("_");
		for (String strloop : aftersplit) {
			System.out.println("Underscore Use of string split function :" + strloop);
		}

		s1 = "$1250.56";
		int index = s1.indexOf('$');
		System.out.println("Remove the Dollar sign :" + s1.substring(index + 1, s1.length()));

		System.out.println(" ");
		s1 = "1250.56$";
		System.out.println("Remove the Dollar sign :" + s1.substring(0, s1.length() - 1));

		System.out.println(" ");
		System.out.println("Char at index :" + s1.charAt(3));
		System.out.println(s1.compareTo(str));
		char ch2 = '1';
		char ch3 = 'V';

		int i = ch2;
		int j = ch3;
		int diff = i - j;
		System.out.println("String comparison :" + diff);

		System.out.println(s1.compareToIgnoreCase(str));
		ch2 = '1';
		ch3 = 'v';

		i = ch2;
		j = ch3;
		diff = i - j;
		System.out.println("String comparison :" + diff);

		s1 = "1250.56$";
		System.out.println(s1.concat(str));
		System.out.println(s1.contains("$"));
		System.out.println(s1.endsWith("$"));
		s1 = "$1250.56";
		System.out.println(s1.startsWith("$"));
		System.out.println(s1.lastIndexOf('5'));
		s1 = "$1250.56 56 56 89 78 56";
		System.out.println(s1.lastIndexOf("56"));
		System.out.println(s1.replaceAll("5", "7"));
		System.out.println(s1.substring(1));

		s1 = "    $1250.56 56 56 89 78 56";
		System.out.println("Before Trim :" + s1);
		System.out.println("After Trim :" + s1.trim());

		System.out.println(s1.valueOf(125.8969689) + 10896);
		// Try all value of function for the different data type
		
		s1 ="123123123";
		
		String afterReplacement=s1.replaceAll("3", "4");
		
		System.out.println(afterReplacement);
		
        s1 ="99.99";
		
		int indexOfDot=s1.lastIndexOf(".");
		System.out.println(indexOfDot);
		
		System.out.println(s1.substring(0, indexOfDot));
		System.out.println(s1.substring(indexOfDot+1));

		System.out.println(s1.substring(0, indexOfDot)+s1.substring(indexOfDot+1));
	}

}
