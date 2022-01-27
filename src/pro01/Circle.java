package pro01;

class Circle {
	final static double Pi = 3.141592;
	private double radius;
	
	Circle() {}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return this.radius * this.radius * Pi;
	}
	
	double perimeter() {
		return 2 * Pi * this.radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}

}
