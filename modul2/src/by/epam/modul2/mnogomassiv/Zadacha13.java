package by.epam.modul2.mnogomassiv;
//Отсортировать столбцы матрицы по убыванию и возрастанию.

import java.util.Random;

public class Zadacha13 {

	public static void main(String[] args) {
		int mass[][];
		int buff;

		Random rn = new Random();
		mass = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				mass[i][j] = rn.nextInt(20);
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Сортировка по возрастанию:"); // пузырьковая сортировка
		System.out.println();
		for (int c = mass.length - 1; c >= 1; c--) {
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < mass.length; j++) {
					if (mass[i][j] > mass[i + 1][j]) {
						buff = mass[i][j];
						mass[i][j] = mass[i + 1][j];
						mass[i + 1][j] = buff;
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Сортировка по убыванию:");
		System.out.println();

		for (int c = mass.length - 1; c >= 1; c--) {
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < mass.length; j++) {
					if (mass[i + 1][j] > mass[i][j]) {
						buff = mass[i + 1][j];
						mass[i + 1][j] = mass[i][j];
						mass[i][j] = buff;
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}
	}
}
