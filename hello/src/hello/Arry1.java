package hello;

public class Arry1 {

	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, 
				{ 10, 10, 10, 10, 10 },
				{ 20, 20, 20, 20, 20 } };

		int total = 0;
		float average = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			average = total / (float) (arr.length * arr[i].length);
		}
		System.out.println(total);

		System.out.println(average);
	}
}
