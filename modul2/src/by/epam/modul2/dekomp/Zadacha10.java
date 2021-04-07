package by.epam.modul2.dekomp;

import java.util.Scanner;

/*Дано натурально число N.Написать метод(методы) для формирования массива,элементами которого являются
 *цифры числа N.*/

public class Zadacha10 {

	public static void main(String[] args) {
		int n;
		int[] mass;
		int g;

		n = enterFromConsole("Введите натуральное число: ");
		g = numer(n);
		mass = new int[g];
		mass = numfromN(n, mass);

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

	@SuppressWarnings("unused")
	public static int numer(int y) {
		int count;
		int temp;
		count = 0;
		temp = y;
		while (y > 0) {
			temp = y % 10;
			y = y / 10;
			count++;
		}
		return count;
	}

	public static int[] numfromN(int x, int[] mass1) {
		int tmp;
		tmp = x;

		while (x > 0) {
			tmp = x % 10;
			x = x / 10;

			for (int i = mass1.length - (mass1.length - 1); i > 0; i--) {
				mass1[i] = tmp;
				System.out.print(mass1[i] + "; ");
			}
		}
		return mass1;
	}
}
