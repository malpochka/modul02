package by.epam.modul2.sorting;

/*Даны две последовательности а1<=а2<=...<=аn, b1<=b2<=...<=bn.Образовать из них новую последовательность чисел так, чтобы
 * она тоже была не убывающей.Дополнительный массив не использовать.*/

public class Zadacha2 {

	public static void main(String[] args) {
		int[] mass1;
		int[] mass2;
		int[] mass3;
		int count;

		count = 0;
		mass1 = new int[] { 1, 2, 3, 4, 5 };
		mass2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		mass3 = new int[mass1.length + mass2.length];

		for (int i = 0; i < mass1.length; i++) {                           //Объединение массивов
			mass3[i] = mass1[i];
			count++;
		}
		for (int j = 0; j < mass2.length; j++) {
			mass3[count++] = mass2[j];
		}
		for (int i = 0; i < mass3.length; i++) {
			System.out.print(mass3[i] + " ");
		}
		for (int i = mass3.length - 1; i >= 1; i--) {                           //Пузырьковая сортировка
			for (int j = 0; j < i; j++) {
				if (mass3[i] < mass3[j])
					mass3[i] = mass3[i] + mass3[j] - (mass3[j] = mass3[i]);
			}
		}
		System.out.println();
		for (int i = 0; i < mass3.length; i++) {
			System.out.print(mass3[i] + " ");
		}
	}
}
