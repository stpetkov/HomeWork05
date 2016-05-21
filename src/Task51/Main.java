package Task51;

import java.util.Scanner;

public class Main {
	static int maxNumber(int a, int b) {
		if (a > b) {
			return (a);
		} else if (a < b) {
			return (b);
		} else {
			return (a);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int n2 = sc.nextInt();
		System.out.print("Enter third number : ");
		int n3 = sc.nextInt();
		System.out.print("The biggest number is : " + maxNumber(maxNumber(n1, n2), n3));
	}

}
