package testcommandlinearguments.com;

import java.util.function.BiConsumer;

public class Hello {
	public static void main(String []args){
		System.out.println("Hello");
		System.out.println("Let's Print All the arguments");
        for(int i=0;i<args.length;i++)  
        System.out.println(args[i]);  
		int sum = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		System.out.println("Sum = :"+sum);
		}   
}
