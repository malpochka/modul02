package by.epam.modul2.mnogomassiv;

import java.util.Scanner;

/*Сформировать квадратную матрицу порядка n по заданнаму образцу(n-четное):
*{1  2   3.. n
* n n-1 n-2..1
* 1  2   3.. n
* n n-1 n-2..1
* ...........
* n n-1 n-2..1}
*/

public class Zadacha4 {

	public static void main(String[] args) {
		int n;
		int c;
		int num;

		c = 0;
		n = enterFromConsole("Введите n, при условии,что n-четное");

		num = n;
		
		int[][] mass = new int[n][n];
		
		for (int i = 0; i < n; i += 2) {
			for (int j = 0; j < n; j++) {
				mass[i][j] = c + 1;
				c++;
			}
			c = 0;
		}
		for (int i = 1; i < n; i += 2) {
			for (int j = 0; j < n; j++) {
				mass[i][j] = num;
				num--;
			}
			num = n;
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
