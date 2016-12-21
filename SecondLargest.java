import java.util.Scanner;

class SecondLargest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, t;
		t = in.nextInt();
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			if ((a > b && b > c) || (c > b && b > a))
				System.out.print(b);
			else if ((b > a && a > c) || (c > a && a > b))
				System.out.print(a);
			else
				System.out.print(c);
		}
		in.close();
	}

}
