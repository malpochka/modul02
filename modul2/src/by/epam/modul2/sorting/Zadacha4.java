package by.epam.modul2.sorting;

/*Сортировка обменами.Дан массив чисел.Требуется переставить числа в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количество перестановок. */

public class Zadacha4 {

	public static void main(String[] args) {
		int[] mass;
		int temp;
		int count;

		count = 0;
		mass = new int[] { 1, 2, 5, 6, 9, 10, 3, 7, 8 };

		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = mass.length - 1; j > 0; j--) {
				if (mass[j - 1] > mass[j]) {
					temp = mass[j - 1];
					mass[j - 1] = mass[j];
					mass[j] = temp;
					count++;
				}
			}
		}
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + "; ");
		}
		System.out.println();
		System.out.println("Количество перестановок:  " + count);
	}
}
