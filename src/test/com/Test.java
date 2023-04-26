package test.com;

/**
 * @author Vipul Patel Class modified on 26/04/2023 for chnaging fun1 logic
 * 
 * @author Mohit Mahajan Class modified on 26/12/2023 for chnaging fun2 logic
 * 
 */
public class Test {

	public static void main(String[] args) {
		
    byte b = 0 ;
    System.out.println(b);
    int age = 60;
    String bankName = "Axis";
    short s = -129;
    System.out.println(s);
    
    int i = 1299;  //Primitive
    System.out.println(i);
    Integer i1 = i; // primitive to Wrapper : Autoboxing
    System.out.println(i1);
    System.out.println(i1.floatValue());
    
    long l = 12999999999l;
    System.out.println(l);
    
    float f = 125.987654321f; //up to six decimal
    System.out.println(f);
    
    double d = 125.987654321; // up to 15 decimal
    System.out.println(d);
    
    char c = 'A';
    System.out.println(c);
    
    char c1 = 81;
    System.out.println(c1);
    
    boolean boole = false;
    System.out.println(boole);
    
    if(boole) {
    	System.out.println("Boolean variable value is true");
    }
    else {
    	System.out.println("Boolean variable value is false");
	}
    
    
    String price = "125";
    String price1 = "250";
    
    System.out.println(price + price1);
    
    // two classes will come in the picture 1. String class and 2. Integer
    
    int p = Integer.parseInt(price);
    int p1 = Integer.parseInt(price1);
    

    
    System.out.println(p + p1);
    
	}

}
