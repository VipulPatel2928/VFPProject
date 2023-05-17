package testwaystoinitializeobject.com;

public class WaysToTnitializeObject {
	public float interestRate;
	public String bankNameString;
	public int years;
	public String customerNameString;
	public void display() {
		System.out.println("bank Name :"+bankNameString);
		System.out.println("Customer Name :"+customerNameString);
		System.out.println("Interest Rate :"+interestRate);
		System.out.println("Years :"+years);
	}
	
	public WaysToTnitializeObject(String bankNameString,String customerNameString,float interestRate,int years) {
		
		this.bankNameString = bankNameString;
		this.customerNameString = customerNameString;
		this.interestRate = interestRate;
		this.years = years;
	}
	
	public WaysToTnitializeObject() {
		System.out.println("This is default Constructor");
	}
	
	public float getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}


	public String getBankNameString() {
		return bankNameString;
	}


	public void setBankNameString(String bankNameString) {
		this.bankNameString = bankNameString;
	}


	public int getYears() {
		return years;
	}


	public void setYears(int years) {
		this.years = years;
	}


	public String getCustomerNameString() {
		return customerNameString;
	}


	public void setCustomerNameString(String customerNameString) {
		this.customerNameString = customerNameString;
	}


	public static void main(String[] args) {
		WaysToTnitializeObject obj1 = new WaysToTnitializeObject();
		obj1.display();
		System.out.println("--------------------------------------------");
		//By reference variable
        obj1.bankNameString = "Axis";
        obj1.customerNameString = "Vipul";
        obj1.interestRate = 7.25f;
        obj1.years = 7;
        obj1.display();   
        System.out.println("--------------------------------------------");
        //By method
        WaysToTnitializeObject obj2 = new WaysToTnitializeObject();
        obj2.setBankNameString("HDFC");
        obj2.setCustomerNameString("Rutul");
        obj2.setInterestRate(9.9f);
        obj2.setYears(10);
        obj2.display(); 
        System.out.println("--------------------------------------------");
        //By constructor
        WaysToTnitializeObject obj3 = new WaysToTnitializeObject("ICICI","Mike",8.5f,8);
        obj3.display();
	}
}
