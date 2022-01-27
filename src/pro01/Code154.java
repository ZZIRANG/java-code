package pro01;

public class Code154 {
	
	static void doWork(Parent p) {
	if(p instanceof ChildA) {
		ChildA ca = (ChildA) p;
		ca.print();
		ca.show2();
		ca.showA();
	} else if (p instanceof ChildB) {
		ChildB cb = (ChildB)p;
		cb.print();
		cb.show2();
		cb.showB();
	} else {
		p.print2();
		p.show2();
	}
}

	public static void main(String[] args) {
		Parent p = new Parent();
		ChildA a = new ChildA();
		ChildB b = new ChildB();
		doWork(p);
		doWork(a);
		doWork(b);

	}

}
