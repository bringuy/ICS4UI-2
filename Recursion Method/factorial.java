//calculate the factorial of a number;
public class factorial {

	public static void main(String[] args) {
		System.out.println(findFactorial(5));
	}

	public static int findFactorial(int n) {
		if (n == 1)
			return 1;
		else
			return (findFactorial(n - 1) * n);
	}
}
