package by.epam.modul2.mnogomassiv;

/*Сформировать случайную матрицу m x n, состоящая из нулей и единиц, причем в каждом столбце число
*единиц равно номеру столбца.*/

public class Zadacha14 {

	public static void main(String[] args) {
		int[][] mass;

		mass = new int[10][10];
		for (int j = 0; j < 10; j++) {
			for (int i = j + 1; i < 10; i++) {
				mass[j][i] = 1;
			}
		}
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}

	}
}
