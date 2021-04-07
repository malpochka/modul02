package by.epam.modul2.dekomp;

import java.util.Scanner;

/*Натурально число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в 
 * степень n, равна самому числу.Найти все числа от 1 до k.Для решения задачи использовать декомпозицию.
 */

public class Zadacha14 {

	public static void main(String[] args) {
		int k;

		k = enterFromConsole("Введите натуральное число больше >1: ");

		quantity(k);

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

	public static void quantity(int a) {
		int count;
		int po;
		double arm;
		int[] mass;

		po = 0;
		count = 0;
		mass = new int[] { 0, 0, 0, 0 };

		for (int i = 1; i < a; i++) {
			for (int n = i; n >= 1; count++) {
				mass[count] = n % 10;
				n /= 10;
				po++;
			}
			arm = Math.pow(mass[0], po) + Math.pow(mass[1], po) + Math.pow(mass[2], po) + Math.pow(mass[3], po);
			if (arm == i) {
				System.out.println(i);
			}
			po = 0;
			count = 0;
		}
	}
}
