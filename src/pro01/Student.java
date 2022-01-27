package pro01;

class Student extends Person {
	static int numberOfStudent;
	int no;
	String name;
	double score;
	private String name2;
	private int score2;
	private Score score3;
	
	Student(String name, String phone, int score) {
		super(name, phone);
		this.score2 = score;
	}
	
	Student(String name, Score score) {
		this.name2 = name;
		this.score3 = score;
	}
	
	Student(String name, int score) {
		this.name2 = name;
		this.score2 = score;
	}
	
	String getName() {
		return name2;
	}
	
	Score getScore3() {
		return score3;
	}
	
	int getScore() {
		return score2;
	}
	
	void setName(String name) {this.name2 = name;}
	void setScore(Score score) {this.score3 = score;}
	void incScore(int m, int e) {
		score3.incMath(m);
		score3.incEnglish(e);
	}
	
	void printStudent4() {
		printPerson();
		System.out.println("score: " + score2);
	}
	
	void print2() {
		System.out.println(name + "(" + score + ")");
	}
	
	Student() {}
	
	void Student1() {
		numberOfStudent++;
	}
	
	Student(String n, double s) {
		numberOfStudent++;
		name = n;
		score = s;
	}
	
	Student(int n) {
		no = n;
	}
	
	Student(int n, String nm) {
		no = n;
		name = nm;
	}
	
	Student(int n, String nm, double s) {
		no = n;
		name = nm;
		score = s;
	}
	
	void print() {
		System.out.println("name: " + name);
		System.out.println("score: " + score);
		System.out.println("numberOfStudent: " + numberOfStudent);
	}
	
	void printStudent2() {
		System.out.println("no: " + no + ", name: " + name + ", score: " + score);
	}
	
	void printStudent() {
		System.out.println("no: " + no);
		System.out.println("name: " + name);
		System.out.println("score: " + score);
	}
	
	void printStudent3() {
		System.out.println(name2 + ": math(" + score3.getMath() + "), english(" + score3.getEnglish() + ")");
	}
	
	void updateScore(double change) {
		score += change;
	}

}
