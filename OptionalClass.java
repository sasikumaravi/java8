package java8;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String b="Thala";
		Optional<String> check=Optional.ofNullable(b);
		System.out.println(Optional.empty());
		System.out.println(check.get());
//		if(check.isEmpty()==true) {
//			System.out.println("Hellelo");
//		}
//		else {
//			System.out.println(b.toUpperCase());
//		}
		//check.ifPresent (System.out::println);
//		if(check.isPresent()==true) {
//			
//			System.out.println(b.toUpperCase());
//		}
//		else {
//			System.out.println("Value is Null");
//		}
		//System.out.println(check.orElse("Nothing to Solve"));
		//System.out.println(check.orElseThrow(()->new NullPointerException()));
//		System.out.println(check.isPresent());
		
	}
}
