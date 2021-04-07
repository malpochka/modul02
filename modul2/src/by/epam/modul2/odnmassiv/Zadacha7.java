package by.epam.modul2.odnmassiv;

import java.util.Scanner;

//Даны действительные числа а1, а2,...аn. Найти max(a1+a2n,a2+a2n-1,...,an+a(n+1)).
public class Zadacha7 {

	public static void main(String[] args) {
		int[] d;
		int a;
		int b;
		int i;
		int n;
		int j;
		int max;

		max = 0;
		n = enterFromConsole("Введите количество элементов в массиве");

		a = 1;
		b = 10;

		d = new int[n];
		for (i = 0; i < n; i++) {
			d[i] = a + (int) (Math.random() * b);
			System.out.print(d[i] + "; ");
		}
		for (j = 0; j < (n + 4); j++) {

			int sum = d[j] + d[1] * n;
			System.out.println(sum);
			n--;
			if (sum > max) {
				max = sum;

			}

		}
		System.out.println("max = " + max);
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
