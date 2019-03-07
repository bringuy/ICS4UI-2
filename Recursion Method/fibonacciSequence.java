public class fibonacciSequence {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.println(fibonacci(a, b));
	}

	public static int fibonacci(int a, int b) {
		return fibonacci(a, a + b);
	}
}
