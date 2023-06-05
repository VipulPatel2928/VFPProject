package testcloneable.com;

public class CloneableClass implements Cloneable{
	 float interestRate;
	 String bankName;
	 String branchAddress;
	 String customerName;
	 int accountNumber;
	 
	 public CloneableClass(float interestRate,
	 String bankName,
	 String branchAddress,
	 String customerName,
	 int accountNumber) {
			this.interestRate = interestRate;
			this.bankName = bankName;
			this.branchAddress = branchAddress;
			this.customerName = customerName;
			this.accountNumber = accountNumber;
	}
	 
	public void display() {
		System.out.println("interestRate :"+interestRate);
		System.out.println("bankName :"+bankName);
		System.out.println("branchAddress :"+branchAddress);
		System.out.println("customerName :"+customerName);
		System.out.println("accountNumber :"+accountNumber);
	}
		public static void main(String[] args) throws CloneNotSupportedException {
			CloneableClass obj = new CloneableClass(6.69f, "Axis", "Surat", "Vipul Patel", 1234567890);
			obj.display();
			System.out.println("-----------------Clone Process started-----------------");
			CloneableClass obj1 = null;   
			obj1 = (CloneableClass) obj.clone(); //// down-casting as clone() return type is Object
			obj1.display();
		}
}
