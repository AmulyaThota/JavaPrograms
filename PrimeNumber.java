package PracticeSeleniumJava;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 6, m = 0, count = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println("The number is not prime");

		} else {
			for (int i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println("The number is not prime");
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println("The given number is prime");
			}

		}

	}
}
