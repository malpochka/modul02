package by.epam.modul2.dekomp;

//Написать метод(методы) проверяющий,являются ли данные три числа взаимно простыми.
public class Zadacha6 {

	public static void main(String[] args) {
		int[] mas;
		int nod;
		int nod2;

		mas = new int[] { 324, 125, 42 };
		nod = NOD(mas[0], mas[1]);
		nod2 = NOD(nod, mas[2]);

		if (nod2 == 1) {
			System.out.println("Данные три числа взаимно простые");
		} else {
			System.out.println("Данные три числа не являются взаимно простыми");
		}

	}

	public static int NOD(int x1, int x2) {
		if (x2 == 0) {
			return x1;
		} else if (x1 == 0) {
			return x2;
		} else {
			return NOD(x2, x1 % x2);
		}
	}
}
