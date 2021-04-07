package by.epam.modul2.odnmassiv;

/*Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент(освободившиеся
 * элементы заполнить нулями).Дополнительный массив не использовать.*/

public class Zadacha10 {

	public static void main(String[] args) {
		int[] array;
		int j = 2;
		
		array = new int[] { 2, 4, 6, 8, 9, 12, 34, 5, 67 };
		
		System.out.print("First array: ");
		
		for (int g = 0; g < array.length; g++) {
			System.out.print(array[g] + "; ");
		}
		
		for (int i = 1; i <= array.length / 2; i++) {
			array[i] = array[j];
			j = j + 2;
		}
		
		for (int i = array.length - 1; i > array.length / 2; i--) {
			array[i] = 0;
		}
		System.out.println();
		System.out.println();
		System.out.print("Second array: ");

		for (int g = 0; g < array.length; g++) {
			System.out.print(array[g] + "; ");
		}
	}
}
