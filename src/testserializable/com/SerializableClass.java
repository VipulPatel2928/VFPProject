package testserializable.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableClass implements Serializable{
	 float interestRate;
	 String bankName;
	 String branchAddress;
	 String customerName;
	 int accountNumber;
	 
	 public SerializableClass(float interestRate,
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
		public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
			SerializableClass obj = new SerializableClass(6.69f, "ICICI", "Surat", "Vipul Patel", 1234567890);
			
		   // Serializing 
	       FileOutputStream file = new FileOutputStream("xyz.txt"); 
	       ObjectOutputStream objectoutputstream = new ObjectOutputStream(file);
	       objectoutputstream.writeObject(obj);
	    
	       // De-serializing 
	       FileInputStream file1 = new FileInputStream("xyz.txt");
	       ObjectInputStream objectinputstream = new ObjectInputStream(file1);
	       SerializableClass b = (SerializableClass)objectinputstream.readObject();//down-casting object
	       b.display();
		}


}
