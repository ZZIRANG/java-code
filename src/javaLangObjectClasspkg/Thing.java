package javaLangObjectClasspkg;

class Thing extends Object {
	private String name;
	private int count;
	Thing() {}
	Thing(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	void print() {
		System.out.println("name: " + name);
		System.out.println("count: " + count);
	}
	
	public boolean equals(Object obj) {
		if(this.name.equals(((Thing)obj).name) && this.count == ((Thing)obj).count) {
			return true;			
		} else {
			return false;
		}
	}

}
