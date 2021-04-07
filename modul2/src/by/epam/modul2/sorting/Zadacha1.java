package by.epam.modul2.sorting;

/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объеденить их в один массив,
 * включив второй массив между к-м и (к+1)-м элементами первого, при этом не используя дополнительный массив.
 */

public class Zadacha1 {

	public static void main(String[] args) {
		int[] mass1;
		int[] mass2;
		int[] mass3;
		int count;
		int c;
		int k;

		c = 0;
		count = 0;
		k = 2;

		mass1 = new int[] { 1, 2, 3, 4, 5, 6 };
		mass2 = new int[] { 8, 6, 9, 7 };
		mass3 = new int[mass1.length + mass2.length];

		for (int i = 0; i <= k; i++) { // Объединение массивов
			mass3[i] = mass1[i];
			count++;
		}
		for (int j = 0; j < mass2.length; j++) {
			mass3[count++] = mass2[j];
		}
		for (int i = 0; i < mass3.length; i++) {
			if (mass3[i] > 0) {
				c++;
			}
		}
		for (int j = c; j < mass3.length; j++) {
			mass3[j] = mass1[mass1.length - (k + 1)];
			k--;
		}
		System.out.println(c);
		System.out.println();
		for (int g = 0; g < mass3.length; g++) {
			System.out.print(mass3[g] + "; ");
		}
	}
}
