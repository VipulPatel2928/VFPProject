package testaccessmodifier1.com;

public class AccessModifierClass2 {
	
	
	public static void main(String[] args) {
		AccessModifierClass accessModifierClass = new AccessModifierClass();
		//System.out.println(accessModifierClass.getNamePrivateString());//Private and can't be access outside of the class
		System.out.println(accessModifierClass.getNameDefaultString());
		System.out.println(accessModifierClass.getNameProtectedString());
		System.out.println(accessModifierClass.getNamePublicString());
	}
}
