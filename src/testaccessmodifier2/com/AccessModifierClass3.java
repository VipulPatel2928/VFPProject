package testaccessmodifier2.com;

import testaccessmodifier1.com.AccessModifierClass;

public class AccessModifierClass3 extends AccessModifierClass{
	
	
	public static void main(String[] args) {
		
		AccessModifierClass3 accessModifierClass = new AccessModifierClass3();
		//System.out.println(accessModifierClass.getNamePrivateString());//Private and can't be access outside of the class
		//System.out.println(accessModifierClass.getNameDefaultString());//Default and can't be access outside of the package
		System.out.println(accessModifierClass.getNameProtectedString());
		System.out.println(accessModifierClass.getNamePublicString());
	}
}
