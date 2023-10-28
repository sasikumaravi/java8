package java8;

public class Chair implements Furniture{
//	public void printMaterial() {
//		System.out.println("Material is Steel");
//	}
	public String printQuality(String material) {
		if(material.equalsIgnoreCase("steel")) {
			return "Good Product";
		}
		else {
			return "Bad Product";
		}
		
	}
}
