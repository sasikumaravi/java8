package java8;

public interface Furniture {
	public default void printMaterial() {
		System.out.println("Material is Iron");
	}
	public static void printNetPrice(int price,int tax) {
		System.out.println(price+price*tax/100);
	}
	public String printQuality(String material);
}
