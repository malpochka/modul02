package by.epam.modul2.odnmassiv;

//Даны целые числа а1,а2,...аn. Вывести на экран только те числа, для которых а[i]>i..
public class Zadacha5 {

	public static void main(String[] args) {
		int[] d;
		int i;
		int a;
		int b;
		int j;

		j = 0;
		a = 1;
		b = 10;

		d = new int[10];
		for (i = 0; i < 10; i++) {
			d[i] = a + (int) (Math.random() * b);
			System.out.print(d[i] + "; ");
		}
		System.out.println(" ");
		
		for (j = 0; j < 10; j++) {
			if (d[j] > j) {
				System.out.print(d[j] + "; ");
			}

		}

	}
}
