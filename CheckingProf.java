package java8;

public class CheckingProf {
	public static void main(String[] args) {
		CheckProf ck=new CheckProf();
		System.out.println(ck.myAge(2000));
		ck.myName();
		System.out.println(CheckProf.myNative());
	
	}
}
