package interfacetest;

class ChildBook implements Book {
	private String title;
	private String author;
	
	ChildBook() {}
	
	ChildBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println("** Info for books **");
	}
	
	public void showTitle() {
		System.out.println("title: " + title);
		System.out.println("author: " + author);
	}

}
