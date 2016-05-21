package Task57;

import java.util.Scanner;

public class Main {
	public static int factorial(int fc) {
		if (fc < 2) {
			return 1;
		} else {
			return (fc * factorial(fc - 1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n! : ");
		int n = sc.nextInt();
		System.out.print(n + "! = " + factorial(n));
	}

}
