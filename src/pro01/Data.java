package pro01;

class Data {
	int value;
	static int count;
	private int x;
	public int y;
	int z;
	int m;
	
	Data() {}
	
	Data(int x) {
		m = x;
	}
	
	void printData() {
		System.out.println("m: " + m);
	}
	
	void print() {
		System.out.println("value: " + value);
		System.out.println("count: " + count);
		
	}

}
