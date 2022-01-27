package pro01;

class Person {
	static int count;
	String name;
	
	private String name2;
	private String phone;
	
	Person( ) {}
	
	Person(String name, String phone) {
		this.name2 = name;
		this.phone = phone;
	}
	
	void Person() {
		count++;
	}
	
	void printPerson() {
		System.out.println("name: " + name2);
		System.out.println("phone: " + phone);
	}
	
	static void printCount() {
		System.out.println("count: " + count);
	}

}
