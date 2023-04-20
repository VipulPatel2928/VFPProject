package testwrapper.com;

public class PrimitiveToWrapper {

	public static void main(String[] args) {
		int i = 100;
		System.out.println(i);
		
		Integer j =Integer.valueOf(i);
		System.out.println(j);
		
		String str = j.toString();
		System.out.println(str);
		
		System.out.println(i+10);
		System.out.println(j+20);
		System.out.println(str+30);
		
		i = 300;
		System.out.println(Integer.valueOf(i).toString()+90);
        
		
		String str1 = "1000";
		
		System.out.println(Integer.parseInt(str1)+900);
	
		int p = 1000;
		
		System.out.println(String.valueOf(p)+900);
		
	
	}

}
