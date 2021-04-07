package by.epam.modul2.mnogomassiv;

import java.util.Random;

/*Матрицу 10х20 заполнить случайными числами от 0 до 15.Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается 3 и более раз.
 */

public class Zadacha11 {

	public static void main(String[] args) {
		int mass[][];
		int c;

		Random rn = new Random();
		mass = new int[10][20];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				mass[i][j] = rn.nextInt(15);
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}
		System.out.print("Номер строки:  ");

		for (int i = 0; i < 10; i++) {
			c = 0;
			for (int j = 0; j < 20; j++) {
				if (mass[i][j] == 5) {
					c = c + 1;
					if (c >= 3) {
						System.out.print(i + "; ");
					}
				}
			}
		}
		System.out.println();
	}
}
