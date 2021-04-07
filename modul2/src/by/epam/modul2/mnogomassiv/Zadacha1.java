package by.epam.modul2.mnogomassiv;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
public class Zadacha1 {

	public static void main(String[] args) {
		int[][] mass;
		mass = new int[][] { { 2, 5, 9, 8, 6 }, { 3, 8, 6, 2, 3 }, { 5, 3, 6, 9, 1 }, { 2, 8, 6, 1, 0 },
				{ 5, 7, 2, 2, 1 } };
		for (int i = 0; i < mass.length; i++) {
			System.out.println();
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");

			}
		}
		System.out.println();
		System.out.println("Требуемые по условию столбцы матрицы:");

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j += 2) {
				if (mass[0][j] > mass[mass[i].length - 1][j]) {
					System.out.print(mass[i][j] + "\t");
				}
			}
			System.out.println();

		}
	}
}
