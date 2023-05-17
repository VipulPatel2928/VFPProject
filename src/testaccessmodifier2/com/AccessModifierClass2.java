package testaccessmodifier2.com;

import testaccessmodifier1.com.AccessModifierClass;

public class AccessModifierClass2 {
	
	
	public static void main(String[] args) {
		AccessModifierClass accessModifierClass = new AccessModifierClass();
		//System.out.println(accessModifierClass.getNamePrivateString());//Private and can't be access outside of the class
		//System.out.println(accessModifierClass.getNameDefaultString());//Default and can't be access outside of the package
		//System.out.println(accessModifierClass.getNameProtectedString());//Protected and can't be access outside of the package
		System.out.println(accessModifierClass.getNamePublicString());
	}
}
