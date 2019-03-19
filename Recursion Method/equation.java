
public class equation {

	public static void main(String[] args) {
		int x = 3;
		System.out.println(seq(x));
	}

	public static int seq(int x) {
		if (x == 1)
			return 7;
		else
			return 3 * seq(x - 1) - 5;
	}
}
