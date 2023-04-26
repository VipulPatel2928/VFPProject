package teststring.com;

public class ConcatTest_StringBuffer_StringBuilder {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		System.out.println("Start Time :" + startTime);
		
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 100000000; i++) {
			sb.append("Tpoint");
		}
		
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 100000000; i++) {
			sb2.append("Tpoint");
		}
		
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

	}

}
