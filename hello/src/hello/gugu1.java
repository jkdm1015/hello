package hello;

public class gugu1 {

	public static void main(String[] args) {
		System.out.println("±¸±¸´Ü");
		for (int i = 2; i < 10; i += 4) {
			for (int j = 1; j < 10; j++) {
				System.out.println(
						i+"X"+j+"="+(i*j)+"\t"
						+(i+1)+"X"+j+"="+((i + 1)*j)+"\t"
						+(i+2)+"X"+j+"="+((i+2)*j)+"\t"
						+(i+3)+"X"+j+"="+((i+3)*j)+"\t");
			}
			System.out.println();
		}
	}
}
