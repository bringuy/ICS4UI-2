public class EuclidAlgorithm {

	public static void main(String[] args) {
		int a = 88;
		int b = 164;
		System.out.println(euclid(a, b));
	}

	public static int euclid(int a, int b) {
		int gcd = 0;
		if (a == b) {
			gcd = a;
		} else if (a > b) {
			return euclid(b, a - b);
		} else if (b > a) {
			return euclid(a, b - a);
		}
		return gcd;
	}
}
