package by.epam.modul2.odnmassiv;

import java.util.Scanner;

/*Дана последовательность действительных чисел а1,а2,...аN.Заменить все ее члены,большие данного Z,этим числом, 
 * подсчитать количество замен. */

public class Zadacha2 {

	public static void main(String[] args) {
		int n[];
		int Z;
		int i;
		int k;
		
		k = 0;
		Z = Z("Введите значение Z");
		n = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		for (i = 0; i < 10; i++) {
			if (n[i] > Z) {
				n[i] = Z;
				k++;

			}
		}
		System.out.println("Количествозамен равно " + k);
	}


	public static int Z(String message) {
		int d;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		
		d = sc.nextInt();
		return d;
	}

}
