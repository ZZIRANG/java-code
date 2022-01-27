package pro01;

public class Code149 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.print1();
		p.test();
		
		Child c = new Child();
		c.print1();
		c.check();
		c.test();
		
		Parent x = new Child();
		x.print1();
		x.test();

	}

}
