package by.epam.modul2.odnmassiv;

import java.util.Scanner;

/*В массиве целых чисел с количеством элементов n найти наиболее частовстречающееся число. Если таких чисел несколько, 
 * то определить наименьшее из них. */

public class Zadacha9 {

	public static void main(String[] args) {
		int n;
		int[] array;
		int min;
		int repeat;
		int a;
		int b;
		int count;
		
count=0;
		repeat = 0;
		min = 0;
		a = 0;
		b = 10;

		n = enterFromConsole("Введите количество элементов в массиве");
		array = new int[n];
		for (int i = 1; i < array.length; i++) {
			array[i] = a + (int) (Math.random() * b);
			System.out.print(array[i] + "; ");
		}

		for (int j = 0; j < array.length-1; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[j] == array[i]) {
					count++;
					
				}
			}
		
		
		if(count>min) {
			min=count;
			repeat=array[j];
		}	
		}
		
		System.out.println("  ");
		System.out.print(repeat);
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
