package by.epam.modul2.mnogomassiv;

import java.util.Random;

//Отсортировать строки матрицы по возростанию и убыванию значений элементов.
public class Zadacha12 {

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
		System.out.println("Сортировка по возрастанию:");
		System.out.println();

		for (int c = mass.length - 1; c >= 1; c--) {
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < mass.length; j++) {
					if (mass[j][i] > mass[j][i + 1]) {
						buff = mass[j][i];
						mass[j][i] = mass[j][i + 1];
						mass[j][i + 1] = buff;
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Сортировка по убыванию:");
		System.out.println();

		for (int c = mass.length - 1; c >= 1; c--) {
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < mass.length; j++) {
					if (mass[j][i + 1] > mass[j][i]) {
						buff = mass[j][i + 1];
						mass[j][i + 1] = mass[j][i];
						mass[j][i] = buff;
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
	}
}