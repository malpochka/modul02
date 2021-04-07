package by.epam.modul2.dekomp;

import java.util.Scanner;

/*На плоскости заданы своими координатами n точек. Написатьметод(метоы), определяющие, между какими из пар точек
 * самое большое расстояние. Указание:Координаты точек занести в массив.*/

public class Zadacha4 {

	public static void main(String[] args) {
		int n;
		double max;
		int[] x;
		int[] y;

		n = enterFromConsole("Введите количество точек");
		System.out.println("X: ");
		x = coordinates(n);
		System.out.println(" ");
		System.out.println("Y: ");
		y = coordinates(n);

		max = distance(x, y, n);

		System.out.println(" ");
		System.out.println("Максимальное расстояние равно " + max);

		points(x, y, n, max);
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

	public static int[] coordinates(int x) {
		int[] x1;

		int a;
		int b;

		a = 0;
		b = 10;

		x1 = new int[x];
		for (int i = 0; i < x; i++) {
			x1[i] = a + (int) (Math.random() * b);

			System.out.print(x1[i] + " ; ");
		}
		return x1;
	}

	public static double distance(int[] x1, int[] y1, int z) {
		double d;
		int i;
		int j;
		double max;

		max = (Math.sqrt(Math.pow((x1[2] - x1[1]), 2) + Math.pow((y1[2] - y1[1]), 2)));
		System.out.println(" ");

		for (i = 0; i < z - 1; i++) {
			for (j = i + 1; j < z; j++) {
				d = (Math.sqrt(Math.pow((x1[j] - x1[i]), 2) + Math.pow((y1[j] - y1[i]), 2)));
				if (d > max) {
					max = d;
				}
			}
		}
		return max;
	}

	public static void points(int[] x1, int[] y1, int z, double m) {
		double d;
		for (int i = 0; i < z - 1; i++) {
			for (int j = i + 1; j < z; j++) {
				d = (Math.sqrt(Math.pow((x1[j] - x1[i]), 2) + Math.pow((y1[j] - y1[i]), 2)));
				if (d == m) {

					System.out.println("Самое большое расстояние между точкой: " + "X:" + x1[i] + ";" + "Y:" + y1[i]
							+ ";" + " и точкой: " + "X:" + x1[j] + "; " + "Y:" + y1[j]);
				}

			}
		}
	}
}
