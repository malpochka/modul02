package by.epam.modul2.sorting;

/*Пусть даны две неубывающие последовательности действительных чисел а1<=a2<=...<=an, b1<=b2<=...<=bm. Требуется указать те места,
 * на которые нужно вставлять элементы последовательности b1<=b2<=..<=bm в первую послеовательность так, чтобы новая 
 * последовательность оставалась возрастающей. */

public class Zadacha7 {

	public static void main(String[] args) {
		int[] mass1;
		int[] mass2;
		int[] mass3;
		int count;
		int temp;
		
		count = 0;
		mass1 = new int[] { 1, 3, 5, 7, 10, 12 };
		mass2 = new int[] { 2, 4, 6, 8, 11, 13 };

		mass3 = new int[mass1.length + mass2.length];

		for (int i = 0; i < mass1.length; i++) { // Объединение массивов
			mass3[i] = mass1[i];
			count++;
		}
		for (int j = 0; j < mass2.length; j++) {
			mass3[count++] = mass2[j];
		}

		for (int i = 0; i < mass3.length - 1; i++) {
			for (int j = mass3.length - 1; j > 0; j--) {
				if (mass3[j - 1] > mass3[j]) {
					temp = mass3[j - 1];
					mass3[j - 1] = mass3[j];
					mass3[j] = temp;
				}
			}
		}
		for (int i = 0; i < mass3.length; i++) {
			System.out.print(mass3[i] + " ");
		}
		System.out.println();
		System.out.print("Места на которые нужно вставлять элементы второй последовательности: ");
		for (int i = 0; i < mass3.length; i++) {
			int a = mass3[i];
			for (int j = 0; j < mass2.length; j++) {
				if (a == mass2[j]) {

					System.out.print(i + "; ");
					break;
				}
			}
		}
	}
}
