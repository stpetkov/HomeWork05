package Task54;

import java.util.Scanner;

public class Main {
	static void evenORodd(int a) {
		if (a % 2 == 0) {
			System.out.print("The number " + a + " is Even !");
		} else {
			System.out.print("The number " + a + " is Odd !");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		System.out.print("Enter number : ");
		int number = sc.nextInt();
		evenORodd(number);
		sc.close();
	}

}
