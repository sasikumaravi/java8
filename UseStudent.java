package java8;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		Student.insName="OneSoft Technology";
		
		
		s1.name= "Sasi";
		s1.age= 22;
		
		Student s2 = new Student();
	
		s2.name= "Mathi";
		s2.age= 23;
		
		Student s3 = new Student();
	
		s3.name= "Dhana";
		s3.age= 20;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
