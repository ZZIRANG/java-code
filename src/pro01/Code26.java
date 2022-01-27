package pro01;

public class Code26 {

	public static void main(String[] args) {
		int hap, j, k, L;
		j = k = L = 0;
		hap = ++j + k++ + ++L;
		System.out.println(hap); //2
		System.out.println(j); //1
		System.out.println(k); //1
		System.out.println(L); //1

	}

}
