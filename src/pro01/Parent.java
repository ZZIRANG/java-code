package pro01;

class Parent {
	int data = 10;
	private int dataA;
	int a = 10;
	
	Parent() {}
	
	Parent(int dataA) {
		this.dataA = dataA;
	}
	
	void printA() {
		System.out.println("dataA: " + dataA);
	}
	
	void Parent() {
		System.out.println("parent constructor is called");
	}
	
	void printParent() {
		System.out.println("I am parent");
	}
	
	void print() {
		System.out.println("I am parent print");
	}
	
	void show() {
		System.out.println("I am parent show");
	}
	
	void print1() {
		System.out.println("parent - print method");
	}
	
	void test() {
		System.out.println("Parent - test method");
	}
	
	void print2() {
		System.out.println("Parent: print()");
	}
	
	void show2() {
		System.out.println("Parent: show()");
	}

}
