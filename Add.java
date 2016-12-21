import java.util.Scanner;

class Add {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b;
		int t;
		t = in.nextInt();
		for (int i = 1; i <= t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(a + b);
		}
	}
}
