package by.epam.modul2.sorting;

/*Сортировка вставками.Дана последовательность чисел а1,а2,...аn.Требуется поставить числа в порядке возрастания.
 * Примечание:Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 * Двоичный поиск оформить в виде отдельной функции. */

public class Zadacha5 {

	public static void main(String[] args) {
		int[] mass;

		mass = new int[] { 2, 5, 3, 9, 6, 8, 4, 1, 7, 10 };

		insertionSort(mass);
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i]);

		}
	}

	public static int[] insertionSort(int[] array) {

		for (int key = 0; key < array.length; key++) {
			int value = array[key];
			int i = key - 1;
			for (; i >= 0; i--) {
				if (value < array[i]) {
					array[i + 1] = array[i];
				} else {

					break;
				}
			}

			array[i + 1] = value;
		}
		return array;
	}

}
