package by.epam.modul2.odnmassiv;

import java.util.Scanner;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных
*и нулевых элементов.*/

public class Zadacha3 {

	public static void main(String[] args) {
		int n;
		int[] d;
		int i;
		int a;
		int b;
		int j;
		int z;
		int y;

		y = 0;
		z = 0;
		j = 0;
		a = -10;
		b = 20;

		n = enterFromConsole("Введите количество элементов в массиве");
		d = new int[n];

		for (i = 0; i < n; i++) {
			d[i] = a + (int) (Math.random() * b);
			System.out.println(d[i]);

			if (d[i] < 0) {
				j++;
			}
			if (d[i] > 0) {
				y++;
			}
			if (d[i] == 0) {
				z++;
			}
		}
		System.out.println("Количество отрицательных элементов равно " + j);
		System.out.println("Количество положительных элементов равно " + y);
		System.out.println("Количество нулевых элементов равно " + z);

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
