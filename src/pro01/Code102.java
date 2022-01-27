package pro01;

public class Code102 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(10);
		Student s3 = new Student(25, "David");
		Student s4 = new Student(20, "Paul", 92.5);
		
		s1.printStudent2();
		s2.printStudent2();
		s3.printStudent2();
		s4.printStudent2();

	}

}
