package test;

class Thing {
	private String name;
	private int price;
	
	Thing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "name: " + name + ", price: " + price;
	}

}
