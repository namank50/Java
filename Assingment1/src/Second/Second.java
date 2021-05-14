package Second;
public class Second {

	public static void main(String[] args) {
		System.out.println("Armstrong number between 100-999 are -");
		for (int i = 100; i <= 999; i++) {
			int b = i;
			int sum = 0;
			while (b > 0) {
				int a = b % 10;
				sum = sum + (a * a * a);
				b = b / 10;
			}
			if (sum == i)
				System.out.println(i);
		}
	}

}
