package by.epam.modul2.odnmassiv;

import java.util.Random;
import java.util.Scanner;

/*Дана последовательность целых чисел а1,а2,...аn. Образовать новую последовательность, выбросив из исходной те члены
 * которые равны min(а1,а2,...аn). */

public class Zadacha8 {

	public static void main(String[] args) {
		int[] d;
		int[] mass;
		int n;
		int min;
		int c;
		int count;

		count = 0;
		c = 0;
		n = enterFromConsole("Введите количество чисел в массиве");

		Random rn = new Random();
		
		d = new int[n];
		
		for (int i = 0; i < n; i++) {
			d[i] = rn.nextInt(10);
			System.out.print(d[i] + "; ");
		}
		min = d[0];
		
		for (int j = 0; j < d.length; j++) {
			if (d[j] < min) {
				min = d[j];
			}
		}
		System.out.println("");
		System.out.println("Min = " + min);

		for (int j = 0; j < d.length; j++) {
			if (d[j] != min) {
				count++;
			}
		}
		mass = new int[count];
		
		for (int i = 0; i < d.length; i++) {
			if (d[i] > min) {
				mass[c] = d[i];
				c++;
			}
		}
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + "; ");
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
