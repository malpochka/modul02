package by.epam.modul2.dekomp;

/*Даны числа X,Y,Z,T-длины сторон четырехугольника.Написать метод(методы) вычисления его площади,если
 * угол между сторонами X и Y-прямой.*/

public class Zadacha9 {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		int t;
		double S;
		double s1;

		x = 5;
		y = 7;
		z = 10;
		t = 12;

		s1 = x * y * 0.5;
		S = square2(z, t, x, y) + s1;
		System.out.print("Площадь четырехугольника равна : " + S);

	}

	public static double diag(int a, int b) {
		double dd;
		dd = Math.sqrt((a * a + b * b));

		return dd;
	}

	public static double square2(int c, int d, int f, int g) {
		double s2;
		double ddd = diag(f, g);

		s2 = 0.25 * Math.sqrt((ddd + c + d) * (ddd + c - d) * (ddd + d - c) * (c + d - ddd));

		return s2;
	}

}
