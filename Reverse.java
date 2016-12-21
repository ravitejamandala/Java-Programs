import java.util.Scanner;

class Reverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for (int i = 0; i < test; i++) {
			int number = in.nextInt();
			int reverse = 0, t = 0;
			while (number != 0) {
				t = number % 10;
				reverse = 10 * reverse + t;
				number = number / 10;
			}
			System.out.println("\n" + reverse);
		}
	}
}
