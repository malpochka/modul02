package by.epam.modul2.dekomp;

import java.util.Scanner;

/*Даны натуральные числа K и N. Написать метод(методы) формирования массива A,элементами которого являются числа,
 * сумма цифр которых является K и которые не больше N.
 */

public class Zadacha12 {

	public static void main(String[] args) {
		int K;
		int N;
		int c;

		K = enterFromConsole("Введите первое число:");
		N = enterFromConsole("Введите второе число:");

		c = numer(K, N);

		givemass(K, N, c);

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

	public static int numer(int a, int b) {
		int sum;
		int x;
		int m;
		int count;

		count = 0;
		sum = 0;

		for (int i = 1; i < b; i++) {
			x = i;
			while (x > 0) { // Делим число на цифры
				m = x % 10;
				x = x / 10;
				sum = sum + m;

			}
			// сумма цифр
			if (sum == a) {
				// находим число
				count++;
			}

			sum = 0;
		}

		return count;
	}

	public static void givemass(int d, int f, int g) {
		int sum;
		int x;
		int m;
		int[] mass1;

		mass1 = new int[g];
		sum = 0;

		for (int i = 1; i < f; i++) {
			x = i;
			while (x > 0) { // Делим число на цифры
				m = x % 10;
				x = x / 10;
				sum = sum + m;
			}
			// сумма цифр
			if (sum == d) {
				for (int j = mass1.length - (mass1.length - 1); j > 0; j--) {
					mass1[j] = i;
					System.out.print(mass1[j] + "; ");
				}
			}
			sum = 0;
		}
	}

}
