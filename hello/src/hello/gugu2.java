package hello;

public class gugu2 {

	public static void main(String[] args) {
		for (int i = 2; i < 7; i += 4) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + 4; k++) {
						System.out.print(k + "*" + j + "=" + (j * k) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
