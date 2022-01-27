package pro01;

public class Code111 {

	public static void main(String[] args) {
		Book b1 = new Book("Peter Pan", 10000);
		Book b2 = new Book("Aladdin", 9000);
		
		System.out.println(b1.getTitle() + ", " + b1.getPrice());
		System.out.println(b2.getTitle() + ", " + b2.getPrice());

	}

}
