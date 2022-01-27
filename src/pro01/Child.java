package pro01;

class Child extends Parent {
	int data = 20;
	private int dataB;
	
	Child() {}
	
	Child(int dataA, int dataB) {
		super(dataA);
		this.dataB = dataB;
	}
	
	void Child() {
		System.out.println("child constructor is called");
	}
	
	void printChild() {
		System.out.println("I am child");
	}
	
	void printB() {
		System.out.println("dataB: " + dataB);
	}
	
	void printData() {
		System.out.println("data from Parent: " + super.data);
		System.out.println("data from Child: " + this.data);
		System.out.println("data from Child: " + data);
	}
	
	void print() {
		super.print();
	}
	
	void print1() {
		System.out.println("child - print method");
	}
	
	void check() {
		System.out.println("Child - check method");
	}

}
