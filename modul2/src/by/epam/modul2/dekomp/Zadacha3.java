package by.epam.modul2.dekomp;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади треугольника.
public class Zadacha3 {

	public static void main(String[] args) {
		double S;
		double a;

		a = enterFromConsole("Введите сторону а");
		S = 6 * Striangle(a);

		System.out.println(S);

	}

	public static double enterFromConsole(String message) {
		double a;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		a = sc.nextDouble();

		return a;
	}

	public static double Striangle(double x) {
		double St;

		St = (Math.pow(x, 2) * Math.sqrt(3)) / 4;

		return St;
	}

}
