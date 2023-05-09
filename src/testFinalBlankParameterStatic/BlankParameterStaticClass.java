package testFinalBlankParameterStatic;

public class BlankParameterStaticClass {

	final float f;
	
	final static String bankName;
	
	public BlankParameterStaticClass(float f) {
		this.f= f;
	}
	
	static {
		bankName ="Axis";
	}
	
	public void display(final int k) {
		System.out.println(k);
		//Remove the comment to see the compiler error
		//k =100;
		System.out.println("Bank Name :"+bankName);
		
		System.out.println("value of f :"+f);
	}
	
	public static void main(String[] args) {
		
		BlankParameterStaticClass objBlankParameterStaticClass = new BlankParameterStaticClass(4.14f);
		objBlankParameterStaticClass.display(15);

	}

}
