package by.epam.modul2.dekomp;

import java.util.Scanner;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
public class Zadacha2 {

	public static void main(String[] args) {
		int a1;
		int a2;
		int a3;
		int a4;
		int nod;
		int y;
		int z;

		a1 = enterFromConsole("Введите натуральное число");
		a2 = enterFromConsole("Введите натуральное число");
		a3 = enterFromConsole("Введите натуральное число");
		a4 = enterFromConsole("Введите натуральное число");

		y = NOD(a1, a2);
		z = NOD(y, a3);
		nod = NOD(z, a4);

		System.out.println(nod);
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

	public static int NOD(int x1, int x2) {

		if (x2 == 0) {
			return x1;
		} else {
			return NOD(x2, x1 % x2);
		}

	}
}
