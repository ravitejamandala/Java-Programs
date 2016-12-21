import java.util.*;

class FindRemainder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a,b;
			a = in.nextInt();
			b = in.nextInt();
			System.out.print(a%b);
		}
	}
}
