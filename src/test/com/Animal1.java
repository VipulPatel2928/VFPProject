package test.com;

public class Animal1 {
	public int size;
	public String color;
	public boolean b;
	public void setSize(int size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public static boolean b1;

	public void display() {
		System.out.println("Size : "+size);
		System.out.println("Color : "+color);
		
	}

	public Animal1(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public Animal1() {
		System.out.println("This is Animal1 Constuctor");
	}
	
    public void Animal1() {
		System.out.println("This is Animal1 Method");
	}
	
public static void main(String[] args) {
	Animal1 animal1 = new Animal1();
    animal1.display();
    System.out.println("Reference Variable<------------------------------------------------->");
    animal1.size = 10;
    animal1.color = "Black";
    animal1.display();
    System.out.println("Reference Variable<------------------------------------------------->");
    
    System.out.println("Method<------------------------------------------------->");
    animal1.setSize(500);
    animal1.setColor("Blue");
    animal1.display();
    System.out.println("Method<------------------------------------------------->");
    
    System.out.println("Constructor <------------------------------------------------->");
    Animal1 animal11 = new Animal1(5000,"Pink");
    animal11.display();
    System.out.println("Constructor <------------------------------------------------->");
    
    animal1.Animal1();
    animal11.Animal1();
}
}
