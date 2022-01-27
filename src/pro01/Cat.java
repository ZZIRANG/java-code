package pro01;

class Cat {
	String name;
	String color;
	
	Cat() {
		System.out.println("Default constructor is called");
	}
	void printCat() {
		System.out.println("name: " + name);
		System.out.println("color: " + color);
	}
}