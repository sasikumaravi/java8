package java8;

public class UseFurniture {
	public static void main(String[] args) {
		Furniture.printNetPrice(5000, 10);
		Chair c1=new Chair();
		c1.printMaterial();
		System.out.println(c1.printQuality("steel"));
	}

}
