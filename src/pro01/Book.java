package pro01;

class Book {
	private String title;
	private int price;
	
	Book() {}
	
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	String getTitle() {
		return title;
	}
	
	int getPrice() {
		return price;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	void printBook() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
	}

}
