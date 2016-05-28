package validatorPackage;

import java.util.Scanner;

public class validator {
	static Scanner scan = new Scanner(System.in);

	public static int readValidInt() {
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.print("Please enter a valid category #: ");
		}
		int x = scan.nextInt();
		scan.nextLine();
		return x;
	}

	public static int getValidInt(int min, int max) {
		int i = readValidInt();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1-6): ");
			i = readValidInt();
		}
		return i;
	}
	public static String readYorN(String x, String y) {
		String z = scan.nextLine();

		while (!(z.equalsIgnoreCase(x) || z.equalsIgnoreCase(y))) {
			System.out.print("Invalid option, use 'y' or 'n': ");
			z = scan.nextLine();
		}
		return z;
	}
}