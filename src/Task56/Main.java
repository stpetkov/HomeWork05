package Task56;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("How many strings ?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("String(" + i + ") : ");
			String sth = sc.nextLine();
			arr[i] = sth;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " | ");
		}
		sc.close();
	}

}
