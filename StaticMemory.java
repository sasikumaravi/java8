package java8;

public class StaticMemory {
	int count = 0  ;
	
	public StaticMemory() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		StaticMemory sm1 = new StaticMemory();
		StaticMemory sm2 = new StaticMemory();
		StaticMemory sm3 = new StaticMemory();
		
	}
}
