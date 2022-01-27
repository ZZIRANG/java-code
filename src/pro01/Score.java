package pro01;

class Score {
	private int math;
	private int english;
	
	Score() {}
	Score(int math, int english) {
		this.math = math;
		this. english = english;
	}
	
	int getMath() {return math;}
	int getEnglish() {return english;}
    void setMath(int math) { this.math = math;}
    void setEnglish(int english) {this.english = english;}
    void incMath(int n) {this.math += n;}
    void incEnglish(int n) {this.english += n;}
	

}
