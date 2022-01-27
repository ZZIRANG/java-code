package pro01;

public class Code126 {

	public static void main(String[] args) {
		Student s1 = new Student("Alice", new Score(90, 80));
		
		Score a = new Score(88, 93);
		Student s2 = new Student("Bob", a);
		
		Student s3 = new Student();
		Score b = new Score(78, 70);
		s3.setName("Paul");
		s3.setScore(b);
		
		s1.incScore(3, 5);
		
		s1.printStudent3();
		s2.printStudent3();
		s3.printStudent3();

	}

}
