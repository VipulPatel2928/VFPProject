package testaccessmodifier1.com;

public class AccessModifierClass {
	
	private String namePrivateString = "Private";
	String nameDefaultString = "Default";
	String getNameDefaultString() {
		return nameDefaultString;
	}
	void setNameDefaultString(String nameDefaultString) {
		this.nameDefaultString = nameDefaultString;
	}
	protected String nameProtectedString = "Protected";
	public String namePublicString = "Public";
	
	public String getNamePublicString() {
		return namePublicString;
	}
	public void setNamePublicString(String namePublicString) {
		this.namePublicString = namePublicString;
	}
	protected String getNameProtectedString() {
		return nameProtectedString;
	}
	protected void setNameProtectedString(String nameProtectedString) {
		this.nameProtectedString = nameProtectedString;
	}
	private String getNamePrivateString() {
		return namePrivateString;
	}
	private void setNamePrivateString(String namePrivateString) {
		this.namePrivateString = namePrivateString;
	}
	public static void main(String[] args) {
		AccessModifierClass accessModifierClass = new AccessModifierClass();
		System.out.println(accessModifierClass.getNamePrivateString());
		System.out.println(accessModifierClass.getNameDefaultString());
		System.out.println(accessModifierClass.getNameProtectedString());
		System.out.println(accessModifierClass.getNamePublicString());
	}
}
