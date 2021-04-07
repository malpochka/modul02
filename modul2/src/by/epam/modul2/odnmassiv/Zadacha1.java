package by.epam.modul2.odnmassiv;

import java.util.Scanner;

//В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Zadacha1 {

	public static void main(String[] args) {

		int k;
		int i;
		int sum;

		sum = 0;
		k = enterFronConsole("Введите число К");

		int[] n;
		n = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (i = 1; i <= 9; i++) {
			if (n[i] % k == 0) {
				sum = sum + n[i];
				System.out.println(sum);
			}

		}
	}

	public static int enterFronConsole(String message) {
		int x;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		x = sc.nextInt();
		return x;
	}

}
