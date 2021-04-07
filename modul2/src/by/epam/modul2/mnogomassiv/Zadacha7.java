package by.epam.modul2.mnogomassiv;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка N по правилу:
* A[I,J]=sin{I²-J²/N}*/
public class Zadacha7 {

	public static void main(String[] args) {
		double[][] mass;
		int n;

		n = enterFromConsole("Введите n :");

		mass = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mass[i][j] = Math.sin(Math.pow(i, 2) - Math.pow(j, 2) / n);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
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
