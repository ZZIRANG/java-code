package pro01;

class Point {
	private int X;
	private int Y;
	
	Point() {}
	Point(int x, int y) {
		this.X = x;
		this.Y = y;
		
	}
	
	int getX() {
		return X;
	}
	
	int getY() {
		return Y;
	}
	
	void setX(int x) {
		this.X = x;
	}
	
	void setY(int y) {
		this.Y = y;
	}

}
