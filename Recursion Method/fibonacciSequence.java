import java.util.*;

public class fibonacciSequence {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		
		int n = myInput.nextInt();
		System.out.println(fibonacci(n));
		myInput.close();
	}

	public static int fibonacci(int n) {
		if ( n==1){
			return 1; 
		}
		else if (n==2){
			return 1; 
		}
		else 
			return (fibonacci(n-1)+fibonacci(n-2));		
	}
}
