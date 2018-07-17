
public class condition {

	public static void exercise() {
		int a = 25;
		int b = 5;

		if (a == 0)

			if (a < 0) {
				System.out.print("This is greater than 0");
			} else {
				System.out.print("This is less than 0");
			}
	}

	public static void Hello() {

		int a = 11;
		int b = 6;
	}

	public static int sum(int a, int b, boolean multiply) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		if (multiply) {
			return a * b;
		} else {
			return a + b;
		}
	}
}
