package by.epam.modul2.dekomp;

import java.util.Scanner;

/*Два простых числа называются "близнецами", если они отличаются друг от друга на 2(например, 41 и 43).Найти и напечатать
 * все пары "близнецов" из отрезка[n,2n], где n--заданное натуральное число больше 2. Для решения задачи использовать
 * декомпозицию. */

public class Zadacha13 {

	public static void main(String[] args) {
		int n;

		n = enterFromConsole("Введите натуральное число больше >2: ");

		number(n);
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

	public static void number(int x) {
		int y;
		y = 0;
		
		System.out.println("Первое" + "|" + "Второе");
		System.out.println("-------------");
		
		for (int i = x; i <= 2 * x; i++) {
			y = i + 2;
			System.out.println(i + "    |   " + y);
		}
	}
}
