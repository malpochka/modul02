package by.epam.modul2.dekomp;

import java.util.Random;
import java.util.Scanner;

/*Составить программу, которая в массиве A[N] находит второе по виличине число(вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).*/

public class Zadacha5 {

	public static void main(String[] args) {
		int n;
		int[] mass;
		int max;
		int secondmax;

		n = enterFromConsole("Введите количество элементов в массиве");
		mass = Element(n);

		max = mass[2];
		secondmax = mass[1];
		for (int i = 3; i < mass.length; i++) {
			if (mass[i] >= max) {
				secondmax = max;
				max = mass[i];
			} else if ((mass[i] > secondmax) & (mass[i] < max)) {
				secondmax = mass[i];
			}
		}
		System.out.println(" ");
		System.out.println("Max= " + max + " Second= " + secondmax);
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

	public static int[] Element(int x) {
		int[] a;
		Random rn = new Random();

		a = new int[x];
		for (int i = 0; i < x; i++) {
			a[i] = rn.nextInt(20);
			System.out.print(a[i] + " ; ");
		}
		return a;

	}
}
