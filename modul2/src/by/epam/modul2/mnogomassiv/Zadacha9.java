package by.epam.modul2.mnogomassiv;

import java.util.Random;

/*Задана матрица неотрицательных чисел.Посчитать сумму элементов в каждом столбце. Определить, 
 * какой столбец содержит максимальную сумму. */

public class Zadacha9 {

	public static void main(String[] args) {
		int[][] mass;
		int sum;
		int sum_max;
		int sum_j;

		Random rn = new Random();
		mass = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				mass[i][j] = rn.nextInt(10);
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		sum_max = -1;
		sum_j = 0;
		for (int j = 0; j < 6; j++) {
			sum = 0;
			for (int i = 0; i < 6; i++) {
				sum = sum + mass[i][j];
				if (sum > sum_max) {
					sum_max = sum;
					sum_j = j;
				}
			}

		}
		System.out.print("Наибольшая сумма равна " + sum_max + " в столбце: " + sum_j);
		System.out.println();
	}
}
