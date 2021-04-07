package by.epam.modul2.mnogomassiv;

//Дана квадратная матрица. Вывести на экран элементы, стоящи по диагонали.
public class Zadacha2 {

	public static void main(String[] args) {
		int mass[][];
		mass = new int[][] { { 1, 2, 3, 4, }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Диагональ");

		for (int i = mass.length - 1; i >= 0; i--) {
			System.out.print(mass[i][mass.length - i - 1] + " ");
		}

		System.out.println();
		System.out.println("Диагональ");

		for (int i = 0; i < mass.length; i++) { // Главная диагональ
			System.out.print(mass[i][i] + " ");
		}
	}

}
