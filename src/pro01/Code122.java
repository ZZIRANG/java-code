package pro01;

public class Code122 {
	
	static void add(Point t1, Point t2) {
		Point pt = new Point();
		pt.setX(t1.getX() + t2.getX());
		pt.setY(t1.getY() + t2.getY());
		System.out.println("p1 + p2: (" + pt.getX() + ", " + pt.getY() + ")");
	}

	public static void main(String[] args) {
		Point p1 = new Point(1, 3);
		Point p2 = new Point(5, 8);
		
		System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
		System.out.println("p2: (" + p2.getX() + ", " + p2.getY() + ")");
		add(p1, p2);

	}

}
 