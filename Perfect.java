import java.util.Scanner;
class Perfect {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int k = 0; k < t; k++) {
			int a = in.nextInt();
			int b = in.nextInt();
			for (int i = a; i <= b; i++) {
				int number = i;
				int sqrt = (int) Math.sqrt(number);
				if (sqrt * sqrt == number) {
					System.out.println(sqrt);
				}
			}
		}
		in.close();
	}
}
