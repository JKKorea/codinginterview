package codinginterview;

public class Fibonacci {
	
	public static int fibonacci(int n) {
		// Recursive (no dynamic programming)
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1)+ fibonacci(n-2);
	}
	
	public static int fibonacciFaster(int n){
		// Dynamic programming
		return fibonacciRec(n, new int[n+1]);
	}
	
	private static int fibonacciRec(int n, int[] cache) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(cache[n] != 0){
			return cache[n];
		}
		cache[n] = fibonacciRec(n-1, cache) + fibonacciRec(n-2, cache);
		return cache[n]; 
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(10));
		System.out.println(fibonacciFaster(10));
	}
}
