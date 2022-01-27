package pro01;

public class Code121 {

	public static void main(String[] args) {
		Book bk = new Book("Java Programming", 25000);
		bk.printBook();
		bk.setPrice(27000);
		bk.setTitle("Java Programming 2");
		System.out.println("title: " + bk.getTitle());
		System.out.println("price: " + bk.getPrice());

	}

}
