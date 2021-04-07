package by.epam.modul2.dekomp;

//Написать метод(методы) для вычесления суммы факториалов всех нечетных чисел от 1 до 9.
public class Zadacha7 {

	public static void main(String[] args) {
		int x;
		int f;
		int sum;
		
		sum = 0;
		f = 0;
		
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				x = i;
				f = fac(x);
				sum = sum + f;
				System.out.println(f);
			}
		}
		System.out.println("Сумма факториалов равна: " + sum);
	}

	public static int fac(int y) {
		int result = 1;
		for (int i = 1; i <= y; i++) {
			result = result * i;
		}
		    return result;
	}
}
