package by.epam.modul2.mnogomassiv;

import java.util.Random;

//Найти наибольший элемент матрицы и заменить все нечетные элементы на него.
public class Zadacha15 {

	public static void main(String[] args) {
		int[][] mass;
		int max;

		max = 0;
		Random rn = new Random();
		mass = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				mass[i][j] = rn.nextInt(20);
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}
		System.out.println("Новая матрица:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (mass[i][j] > max) {
					max = mass[i][j];
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (mass[i][j] % 2 != 0) {
					mass[i][j] = max;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}
	}
}
