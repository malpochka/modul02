package by.epam.modul2.sorting.Zadacha8;

import java.util.Random;

/*Даны дроби: p1/q1;p2/q2..pn/qn(pn,qn-натуральные).Составить программу, которая приводит эти дроби к общему знаменателю и
 * упорядочивает их в порядке возрастания.
 */

public class Zadacha8 {

	public static void main(String[] args) {
		int nod;
		int y;
		int z;
		int a;
		int b;
		int nok;
		int temp;
		Fraction[] mass;
		
		Random rn = new Random();
		mass = new Fraction[4];

		mass[0] = new Fraction();
		mass[1] = new Fraction();
		mass[2] = new Fraction();
		mass[3] = new Fraction();

		for (int i = 0; i < mass.length; i++) {
			mass[i].numerator = rn.nextInt(10);
			mass[i].denomenator = rn.nextInt(20);
		}
		
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i].numerator + "/" + mass[i].denomenator + "; ");
		}
		
		y = nod(mass[0].denomenator, mass[1].denomenator);
		z = nod(y, mass[2].denomenator);
		nod = nod(z, mass[3].denomenator);
		a = nok(mass[0].denomenator, mass[1].denomenator);
		b = nok(a, mass[2].denomenator);
		nok = nok(b, mass[3].denomenator);
		
		System.out.println();
		System.out.print(nod + "; " + nok);

		for (int i = 0; i < mass.length; i++) {
			mass[i].denomenator = nok;
		}
		
		System.out.println();
		
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i].numerator + "/" + mass[i].denomenator + "; ");
		}
		
		for (int i = 0; i < mass.length - 1; i++) {
			for (int j = mass.length - 1; j > 0; j--) {
				if (mass[j - 1].numerator > mass[j].numerator) {
					temp = mass[j - 1].numerator;
					mass[j - 1].numerator = mass[j].numerator;
					mass[j].numerator = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i].numerator + "/" + mass[i].denomenator + "; ");
		}
	}
	
	public static int nod(int x1, int x2) {
		if (x2 == 0) {
			return x1;
		} else {
			return nod(x2, x1 % x2);
		}
	}
	
	public static int nok(int y1, int y2) {
		int c;
		int d;

		d = nod(y1, y2);
		c = (y1 * y2) / d;

		return c;
	}
}
