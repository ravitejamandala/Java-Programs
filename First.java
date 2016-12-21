import java.util.Scanner;

class First {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for (int i = 0; i < test; i++) {
			int number = in.nextInt();
			int a = number % 10;
			int reverse = 0, t = 0;
			while (number != 0) {
				t = number % 10;
				reverse = 10 * reverse + t;
				number = number / 10;
			}
			int b = reverse % 10;
			System.out.println(a + b);
		}
	}

}
