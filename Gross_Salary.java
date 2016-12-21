import java.util.Scanner;

class Gross_Salary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double basicSalary, HRA, DA, t,grossSalary=0;
		t = in.nextDouble();
		for (int i = 0; i < t; i++) {
			basicSalary = in.nextDouble();
			if (basicSalary < 1500) {
				HRA = (0.1 * basicSalary);
				DA = (0.9 * basicSalary);
				grossSalary = basicSalary + HRA + DA;
				System.out.print(grossSalary);
			} else {
				HRA = 500;
				DA = (0.98 * basicSalary);
				grossSalary = basicSalary + HRA + DA;
				System.out.print(grossSalary);
			}
		}
	}
}
