package by.epam.modul2.odnmassiv;

//Даны действительные числа а1, а2,...аn.Поменять местами наибольший и наименьший элемент.
public class Zadacha4 {

	public static void main(String[] args) {
		int[] d;
		int a;
		int b;
		int max;
		int min;
		int c;
		int j;
		int i;

		max = 0;
		min = 0;
		a = 0;
		b = 20;

		d = new int[20];
		for ( i = 0; i < 20; i++) {
			d[i] = a + (int) (Math.random() * b);
			System.out.print(d[i]+";");
			
			if (d[i] > d[max]) {
				max = i;
			}
			if (d[i] < d[min]) {
				min = i;
			}
		}
		System.out.println();
		System.out.println("Max = " + d[max]);
		System.out.println("Min = " + d[min]);

		c = d[max];
		d[max] = d[min];
		d[min] = c;

		for (j = 0; j < 20; j++) {
			System.out.print(d[j]+";");
		}
	}
}
