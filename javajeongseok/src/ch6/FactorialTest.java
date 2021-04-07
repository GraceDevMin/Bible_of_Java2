package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(12);
		
		System.out.println(result);

	}
	
	static int factorial(int n) {
		int result = 0;
		
		if (n <= 0 || n > 12) return -1;
		if(n == 1) return 1;
		
		return n * factorial(n-1);
	}

}
