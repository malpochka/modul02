package by.epam.modul2.mnogomassiv;

//Найти положительные элементы главной диагонали матрицы.
public class Zadacha10 {

	public static void main(String[] args) {
		int mass[][];
		int a;
		int b;

		a = -5;
		b = 10;

		mass = new int[6][6];

		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = a + (int) (Math.random() * b);
			}
		}
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				System.out.print(mass[i][j] + "\t ");
			}
			System.out.println();
		}
		System.out.print("Положительные элементы главной диагонали равны: ");

		for (int i = 0; i < mass.length; i++) {
			if (mass[i][i] > 0) {
				System.out.print(mass[i][i] + "; ");

			}
		}
	}

}
