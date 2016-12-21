import java.util.*;

class Prime{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for (int k = 0; k < test; k++) {
			int a = in.nextInt();
			int n = in.nextInt();
			for (int j = a; j <= n; j++) {
				int c = 0;
				for (int i = 2; i < j; i++) {
					if (j % i == 0) {
						c++;
						break;
					}
				}
				if (c == 0) {
					System.out.print(j + "\n");
				}
			}
			System.out.print("\n");
		}
	in.close();
	}
}