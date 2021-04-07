package by.epam.modul2.dekomp;

/*Задан массив D.Определить следующие суммы:D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
 * Пояснение:Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * с номерами от k до m. */

public class Zadacha8 {

	public static void main(String[] args) {
		int[] mass;
		int s1;
		int s2;
		int s3;

		mass = new int[] { 2, 4, 6, 8, 10, 12 };

		s1 = sum(mass);
		s2 = sum2(mass);
		s3 = sum3(mass);

		System.out.println("Первая сумма: " + s1 + "; " + "Вторая сумма: " + s2 + "; " + "Третья сумма: " + s3 + "; ");
	}

	public static int sum(int[] mass1) {
		int sm = 0;
		for (int i = 0; i < 3; i++) {
			sm = sm + mass1[i];
		}
		return sm;
	}

	public static int sum2(int[] mass1) {
		int sm = 0;
		for (int i = 2; i < 5; i++) {
			sm = sm + mass1[i];
		}
		return sm;
	}

	public static int sum3(int[] mass1) {
		int sm = 0;
		for (int i = 3; i < 6; i++) {
			sm = sm + mass1[i];
		}
		return sm;
	}
}
