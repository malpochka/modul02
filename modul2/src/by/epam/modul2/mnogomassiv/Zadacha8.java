package by.epam.modul2.mnogomassiv;

import java.util.Scanner;

/*В числовой матрице поменять столбцами два любых столбца, т.е. все элементы одного столбца поставить на
 * соответствующую им позицию другого столбца, а его элементы переместить в первый столбец. Номера столбцов
 * вводить пользователем с клавиатуры.*/

public class Zadacha8 {

	public static void main(String[] args) {
		int[][] mass;
		int n;
		int m;
		int buff;

		mass = new int[][] { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 } };

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j <= mass.length; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}

		n = enterFromConsole("Введите номер 1-го столбца:");
		m = enterFromConsole("Введите номер 2-го столбца:");

		for (int i = 0; i < mass.length; i++) {
			buff = mass[i][n];
			mass[i][n] = mass[i][m];
			mass[i][m] = buff;

		}

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j <= mass.length; j++) {
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
