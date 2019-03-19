
public class Mathematics {

	public static void main(String[] args) {
		int n = 62;
		System.out.println(baseTwo(n));

	}

	public static long baseTwo(int n) {

		if (n == 0)
			return 1;
		else
			return (baseTwo(n - 1) + baseTwo(n - 1));
	}
}
