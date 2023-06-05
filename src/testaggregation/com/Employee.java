package testaggregation.com;

public class Employee{

	int id;  
	String name;  
	Address address;  
	  
	public Employee(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {
		Address address1=new Address("Surat","Gujrat","india");  
		Address address2=new Address("Chandigarh","Punjab","india");  
		  
		Employee e=new Employee(101,"Vipul",address1);  
		Employee e2=new Employee(102,"VP",address2);  
		      
		e.display();  
		System.out.println("---------------------------------");
		e2.display();  

	}

}


