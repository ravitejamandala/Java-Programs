import java.util.*;

class Right {
	static double length(double x1, double y1, double x2, double y2) {
		double a = x2 - x1;
		double b = y2 - y1;
		return Math.pow(a, 2) + Math.pow(b, 2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test, c = 0;
		test = in.nextInt();
		for (int i = 0; i < test; i++) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double k = length(x1, y1, x2, y2);
			double l = length(x2, y2, x3, y3);
			double m = length(x3, y3, x1, y1);
			if (k == l + m || l == k + m || m == k + l)
				c++;
		}
		System.out.print(c);
	}
}