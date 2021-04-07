package by.epam.modul2.sorting;

import java.util.Random;
import java.util.Scanner;

//Сортировка Шелла.Дан массив n действительных чисел.Требуется упорядочить его по возрастанию.

public class Zadacha6 {
	public static void main(String[] args) {
		int n;
		int[] mass;
		int step;
		int tmp;

		n = enterFronConsole("Введите количество элементов в массиве ");

		Random rn = new Random();

		mass = new int[n];

		for (int i = 0; i < n; i++) {
			mass[i] = rn.nextInt(20);
		}
		for (int j = 0; j < mass.length; j++) {
			System.out.print(mass[j] + "; ");
		}
		for (step = n / 2; step > 0; step /= 2) { // Сортировка Шелла
			for (int i = step; i < n; i++) {
				for (int j = i - step; j >= 0 && mass[j] > mass[j + step]; j -= step) {
					tmp = mass[j];
					mass[j] = mass[j + step];
					mass[j + step] = tmp;
				}
			}
		}
		System.out.println();
		for (int j = 0; j < mass.length; j++) {
			System.out.print(mass[j] + "; ");
		}
	}

	public static int enterFronConsole(String message) {
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
}