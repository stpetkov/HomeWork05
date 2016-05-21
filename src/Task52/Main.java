package Task52;

import java.util.Scanner;

public class Main {
	static void greet(String name) {
		System.out.print("Greeting, " + name + " !");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter your name : ");
		String name1 = sc.nextLine();
		greet(name1);
		sc.close();
	}
}
