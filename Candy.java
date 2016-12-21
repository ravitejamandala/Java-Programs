import java.util.*;

class Candy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int a = n / k;
			int b = n % k;
			if (n != k)
				System.out.print(a + " " + b);
			else
				System.out.print(n +"0");
		}
		in.close();
	}
}
