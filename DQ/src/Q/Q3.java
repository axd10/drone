package Q;

public class Q3 {

	public static void main(String args[]) {

		int pf = 0;
		long max = 600851475143L;

		boolean tf = true;

		int size = (int) Math.sqrt(max);
		int size2 = 0;

		for (int i = size; i > 1; i--) {
			tf = true;
			if (max % i == 0) {
				size2 = (int) Math.sqrt(i);
				for (int j = 2; j <= size2; j++) {
					if (i % j == 0) {
						tf = false;
						break;
					}
				}
				if (tf) {
					pf = i;
					break;
				}

			}
		}

		System.out.println("최대소인수  : " + pf);

	}
}
