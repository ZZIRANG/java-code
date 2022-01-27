package pro02;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Person {
	private String name;
	private int score;
	
	Person(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return "(" + name + ", " + score + ")";
	}

}
