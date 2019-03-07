public class TraceRecursiveCalls {

	public static void main(String[] args) {
		System.out.println(test1(3, 3, 3));
		System.out.println(test2(5) + "" + test2(6));
		System.out.println(test3(8, 5));
		System.out.println(test4(7));
	}

	public static int test1(int a, int b, int c) {
		if (a == 1)
			return (b + c);
		else
			return (b * test1(a - 1, b + 1, c + 1));
	}

	public static int test2(int x) {
		if (x == 0)
			return 0;
		else
			return (test2(x - 1) + 1);
	}

	public static int test3(int a, int b) {
		if (a < b)
			return (a * b);
		else
			return (test3(a - 1, b + 1));
	}

	public static int test4(int n) {
		if (n <= 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 3;
		else
			return (2 * test4(n - 1) - 3 * test4(n - 2));
	}
}
