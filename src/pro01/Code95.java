package pro01;

public class Code95 {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.kind = "Sonata";
		myCar.color = "white";
		myCar.year = 2015;
		
		Car yourCar = new Car();
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2015;
		
		System.out.println(myCar);
		System.out.println(yourCar);

	}

}
