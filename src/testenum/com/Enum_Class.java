package testenum.com;

public class Enum_Class {

	//defining the enum inside the class  
		public enum Season { WINTER, SPRING, SUMMER, FALL}  
		
		public enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
		//main method  
		
		public void Enum_Class() {
			
		}
		public static void main(String[] args) {
			//traversing the enum  
			
			System.out.println(Season.WINTER);
			System.out.println(Season.valueOf("SUMMER"));
			Season[] sea = Season.values();
			
			for (Season s : Season.values())  
			System.out.println(s);  
			
			System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
			
			System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal()); 
			System.out.println("Index of SUMMER is: "+Season.valueOf("SPRING").ordinal());  
			System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());  
			System.out.println("Index of SUMMER is: "+Season.valueOf("FALL").ordinal());  
			
			for (Day s : Day.values())  
				System.out.println(s); 
			
			System.out.println("Single Value Access from Enum");
			
			System.out.println(Day.MONDAY);
			System.out.println(Day.TUESDAY);
			System.out.println(Day.WEDNESDAY);
			System.out.println(Day.THURSDAY);
			System.out.println(Day.FRIDAY);
			System.out.println(Day.SATURDAY);
			System.out.println(Day.SUNDAY);
		}
}
