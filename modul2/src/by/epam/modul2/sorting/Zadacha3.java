package by.epam.modul2.sorting;

/*Сортировка выбором.Дана последовательность чисел а1<=a2<=...<=an.Требуется переставить числа так, 
 * чтобы они были расположены по убыванию.*/

public class Zadacha3 {

	public static void main(String[] args) {
		int[] mass;
		int max;
		int v;

		mass = new int[] { 2, 4, 6, 8, 9, 10, 12, 14, 15, 16 };

		for (int i = 0; i < mass.length; i++) {
			v = i;
			max = mass[i];
			for (int j = i + 1; j < mass.length; j++) {
				if (mass[j] > max) {
					v = j;
					max = mass[j];
				}
			}
			mass[v] = mass[i];
			mass[i] = max;
		}

		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + "; ");
		}
	}
}
