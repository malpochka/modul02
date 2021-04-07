package by.epam.modul2.dekomp;

import java.util.Scanner;

/*Из заданного числа вычли сумму его цифр.Из результата сново вычли сумму его цифр и тд.Сколько таких действий надо
 * произвести,чтобы получить нуль?Использ.декомпозицию.
 */

public class Zadacha17 {

	public static void main(String[] args) {
		int n;
		int s;
		int c;

		n = enterFromConsole("Введите число:");
		s = numer(n);
		c = quantity(n, s);

		System.out.println("Количество действий: " + c);
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

	public static int numer(int a) {
		int sum;
		int m;

		sum = 0;

		while (a > 0) { // Делим число на цифры

			m = a % 10;
			a = a / 10;
			sum = sum + m;

		}
		return sum;
	}

	public static int quantity(int b, int d) {
		int diff = b;
		int count;
		int s;

		s = d;
		count = 0;

		while (diff > 0) {
			diff = diff - s;
			count++;
		}
		return count;
	}
}
