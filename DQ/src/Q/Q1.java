package Q;

//гу:23331668
public class Q1 {
	public static void main(String arg[]) {
		Q1 q =new Q1();
		q. Multiple(10000);

	}
	public void  Multiple(int max) {
		int i = 1;
		int sum = 0;
		while(i < max) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i; 
				
			}
	i++; 
		}
		

		System.out.println("гу:"+sum );
		
	}

}
