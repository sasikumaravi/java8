package java8;

public class StaticExample {
	static int count=100;
	public StaticExample() {
		count++;
		System.out.println(count);
	}
	static {
		System.out.println("This is static block");
	}
	static {
		System.out.println("This is block");
	}
	static {
		System.out.println("This is block");
	}
}