package by.epam.modul2.mnogomassiv;

import java.util.Scanner;

/*Магическим квадратом порядка n называется квадратная матрица размера n x n, составленная из числе 1,2,3...n²
*так, что суммы по каждому столбцу,каждой строке и каждой из двух больших диагоналей равны между собой.
*Построить такой квадрат. Пример магического квадрата порядка 3:
*6 1 8
*7 5 3
*2 9 4*/
public class Zadacha16 {

	public static void main(String[] args) {
		int[][] mass;
		int n;
		int nan;
		int num;

		num = 1;

		n = enterFromConsole("Введите количество строк и столбцов в матрице:");
		nan = n * 3 / 2;

		mass = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mass[(j - i + nan) % n][(i * 2 - j + n) % n] = num++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mass[i][j] + "\t");
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
