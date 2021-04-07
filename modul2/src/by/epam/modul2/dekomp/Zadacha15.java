package by.epam.modul2.dekomp;

import java.util.Scanner;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность,
 * (например 1234,5789).Для решения использовать декомпозицию.
 */

public class Zadacha15 {

	public static void main(String[] args) {

		int n;
		int first;
		int last;

		n = enterFromConsole("Введите количество цифр в числе: ");

		first = number1(n);
		last = number2(first, n);
		lastnamber(first, last, n);

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

	public static int number1(int x) {

		boolean b = true;
		int result = 1;
		int num;
		int count = 0;

		while (b) {
			result++;
			count = 0;
			num = result;

			while (num > 0) {
				num = num / 10;
				count++;
			}
			if (count == x) {
				b = false;
			}
		}
		return result;
	}

	public static int number2(int y, int c) {

		int result = y;
		c = c + 1;
		boolean b = true;
		int num;
		int count = 0;

		while (b) {
			result++;
			count = 0;
			num = result;

			while (num > 0) {
				num = num / 10;
				count++;
			}
			if (count == c) {
				b = false;
			}

		}
		return result - 1;
	}

	public static void lastnamber(int a, int b, int c) {

		int result = 0;
		int number = 0;
		int supportNum = 0;
		int divisor = a;
		int j = 0;
		int count = 0;

		for (int i = a; i < b; i++) {
			j = i;
			result = i;
			supportNum = j / a;
			divisor = a;
			count = 0;

			while (j > 0) {
				number = j / divisor;
				j = j % divisor;
				divisor = divisor / 10;

				if (number == supportNum) {
					supportNum++;
					count++;
				}
				if (count == c) {
					System.out.println(result);
				}
			}

		}

	}
}
