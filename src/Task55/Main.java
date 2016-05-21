package Task55;

public class Main {

	public static void main(String[] args) {
		for (int i = 10; i <= 999; i++) {
			if (i >= 10 && i <= 99) {
				if (i / 10 == i % 10) {
					System.out.print(i + " , ");
				}
			} else {
				if (i / 100 == i % 100 % 10) {
					System.out.print(i + " , ");
				}
			}
		}
	}
}
