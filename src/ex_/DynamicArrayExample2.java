package ex_;

public class DynamicArrayExample2 {

	public static void main(String[] args) {
		int data[][] = new int[3][];
		data[0] = new int[4];
		data[1] = new int[5];
		data[2] = new int[3];
		
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		data[0][3] = 4;
		data[1][0] = 5;
		data[1][1] = 6;
		data[1][2] = 7;
		data[1][3] = 8;
		data[1][4] = 9;
		data[2][0] = 10;
		data[2][1] = 11;
		data[2][2] = 12;
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
