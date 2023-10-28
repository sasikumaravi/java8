package java8;
public interface Profike {
	public void myName();
	public static String myNative() {
		return "HI";
	}
	public default int myAge(int b) {
		return b;
	}
}
