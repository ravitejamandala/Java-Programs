import java.util.*;

class Grade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test;
		test = in.nextInt();
		for(int i=0;i<test;i++) {
			double h = in.nextDouble();
			double cc = in.nextDouble();
			double ts = in.nextDouble();
			if (h > 50 && cc < 0.7 && ts > 5600)
				System.out.print(10);
			else if (h > 50 && cc < 0.7)
				System.out.print(9);
			else if (cc < 0.7 && ts > 5600)
				System.out.print(8);
			else if (h > 50 && ts > 5600)
				System.out.print(7);
			else if (h > 50 || cc < 0.7 || ts > 5600)
				System.out.print(6);
			else
				System.out.print(5);
		}
		in.close();
	}
}
