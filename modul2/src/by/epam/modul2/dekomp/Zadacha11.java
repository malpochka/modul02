package by.epam.modul2.dekomp;

import java.util.Scanner;

//Написать метод(методы),определяющий, в каком из данных двух чисел больше цифр;  
public class Zadacha11 {

	public static void main(String[] args) {
		int n;
		int g;
		int n1;
		int g1;

		n = enterFromConsole("Введите первое число:");
		g = enterFromConsole("Введите второе число:");

		n1 = numer(n);
		g1 = numer(g);

		if (n1 > g1) {
			System.out.println("Больше цифр в первом числе");
		} else {
			System.out.println("Больше цифр во втором числе");
		}
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

}
