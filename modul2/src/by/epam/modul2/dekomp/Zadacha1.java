package by.epam.modul2.dekomp;

import java.util.Scanner;

/*Написать метод(методы)для нахождения  наибольшего общего делителя и наименьшего общего кратного
 * двух натуральных чисел: {НОК(А,В)=А*В/НОД(А,В)}
 */

public class Zadacha1 {

	public static void main(String[] args) {
		int a;
		int b;
		int nod;
		int nok;

		a = enterFromConsole("Введите натуральное число");
		b = enterFromConsole("Введите натуральное число");

		nod = NOD(a, b);
		System.out.println("НОД= " + nod);

		nok = NOK(a, b);
		System.out.println("НОК=  " + nok);
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
		} else if (x1 == 0) {
			return x2;
		} else {
			return NOD(x2, x1 % x2);
		}
	}

	public static int NOK(int y1, int y2) {
		int c;
		int d;

		d = NOD(y1, y2);
		c = (y1 * y2) / d;

		return c;
	}

}
