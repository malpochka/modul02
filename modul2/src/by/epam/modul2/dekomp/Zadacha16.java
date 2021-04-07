package by.epam.modul2.dekomp;
/*Написать программу, определяющую сумму n-значных чисел,содержащих только нечетные цифры.
*Определить также,сколько четных цифр в найденной сумме.Использ.декомпозицию.*/

import java.util.Scanner;

public class Zadacha16 {

	public static void main(String[] args) {
		int n;
		int number1;
		int number2;
		long s;

		n = enterFromConsole("Введите количество цифр в числе:");
		number1 = numer1(n);
		number2 = numer2(n);
		s = givesum(number1, number2);
		System.out.print("Сумма равна: " + s + "; ");
		System.out.println();
		numberofeven(s);
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

	public static int numer1(int x) {

		int k = 1;

		k = (int) (k * Math.pow(10, (x - 1)));
		return k;
	}

	public static int numer2(int y) {
		int m = 1;
		int z = 0;

		for (int i = 0; i < y; i++) {
			z = z + 9 * m;
			m *= 10;
		}
		return z;
	}

	public static long givesum(int a, int b) {
		long sum;
		sum = 0;

		for (int i = a; i < b; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void numberofeven(long z) {
		int count;
		long m;
		count = 0;
		while (z > 0) {
			m = z % 10;
			z /= 10;
			if (m % 2 == 0 & m != 0) {
				count++;
			}

		}
		System.out.println("Количество четных цифр равно: " + count + ";");
	}
}
