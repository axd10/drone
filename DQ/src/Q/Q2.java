package Q;

public class Q2 {
	public static void main(String args[]) {
		int arr[] = new int[2];
		int sum = 0;
		arr[0] = 1;
		arr[1] = 2;
		int temp = 0, tot = 0;
		while (sum < 400) {
			sum = arr[0] + arr[1];
			if (arr[0] % 2 == 0) {
				tot += arr[0];
			}
			arr[0] = arr[1];
			arr[1] = sum;

		}
		System.out.println("гу:" + tot);

	}

}
