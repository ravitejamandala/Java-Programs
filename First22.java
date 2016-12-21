import java.util.*;

class First {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = a - b;
		if (c % 10 == 9)
			System.out.print(c - 1);
		else
			System.out.print(c + 1);
		in.close();
	}
}
