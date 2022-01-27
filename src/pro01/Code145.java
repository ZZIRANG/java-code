package pro01;

public class Code145 {

	public static void main(String[] args) {
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(2.2);
		
		double c1Area = c1.Pi * c1.getRadius() * c1.getRadius();
		double c2Area = c2.Pi * c2.getRadius() * c2.getRadius();
		
		System.out.println("c1Area: " + c1Area);
		System.out.println("c2Area: " + c2Area);

	}

}
