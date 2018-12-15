
public class CheckPrime {

	public static void main(String[] args) {

		int n =21;
		if (n <= 1) {
			System.out.println("not a prime");
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.println("not a prime");			
		}
			System.out.println("its a prime");

	}
		
	}

}
