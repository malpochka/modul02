package by.epam.modul2.odnmassiv;

import java.util.Scanner;

/*Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами. */

public class Zadacha6 {

	public static void main(String[] args) {
		double[] d;
		double a;
		double b;
		int n;
		int i;
		double sum;

		sum = 0;
		n = enterFromConsole("Введите кол-во чисел в массиве");

		a = -0.25;
		b = 10.0;

		d = new double[n];
		for (i = 0; i < n; i++) {
			d[i] = a + (Math.random() * b);
			System.out.println(d[i]);

			if (isPrime(i)) {
				sum = sum + d[i];
			}
		}
		System.out.println("Summ: " + sum);
	}

	public static int enterFromConsole(String message) {
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

	public static boolean isPrime(int x) {
		int temp;
		
		if (x < 2)
			return false;
		
		for (int i = 2; i <= x / 2; i++) {
			temp = x % i;
			if (temp == 0) {
				return false;
			}
		}
		return true;
	}
}