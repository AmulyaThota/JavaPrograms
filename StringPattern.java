package PracticeSeleniumJava;

import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("enter the input string"); String input =
		 * scanner.nextLine(); System.out.println("***pring the pattern ***");
		 */
		String input = "java";
		for (int i = 1; i <= input.length(); i++)

		{

		for (int j = input.length(); j > i; j--)

		{

		System.out.print(" ");

		}

		for (int k = i * 2 - 1; k >= 1; k--)

		{

		System.out.print(input.charAt(i - 1));

		}

		System.out.println("");

		}

		}

		

	}
