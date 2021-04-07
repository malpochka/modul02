package by.epam.modul2.mnogomassiv;

import java.util.Scanner;

//Дана матрица.Вывести к-ю строку и р-й столбец матрицы.
public class Zadacha3 {

	public static void main(String[] args) {
		int k;
		int p;
		int mass[][];

		mass = new int[][] { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 },
				{ 17, 18, 19, 20 } };
		for (int i = 0; i < mass.length; i++) {
			System.out.println();
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
		}
		System.out.println();

		k = enterFromConsole("Введите номер строки");
		p = enterFromConsole("Введите номер столбца");

		if (k < 5) {
			for (int j = 0; j < mass.length - 1; j++) {
				System.out.print(mass[k][j] + "\t");
			}
		} else {
			System.out.print("Такой строки  в данной матрице нет, попробуйте еще раз ");
		}
		System.out.println();
		if (p < 4) {
			for (int i = 0; i < mass.length; i++) {
				System.out.println(mass[i][p] + "\t");
			}

		} else {
			System.out.print("Такого столбца в данной матрице нет, попробуйте еще раз");
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
}
