import java.util.*;

public class printAllPrimes {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt(); 
		int high = scn.nextInt(); 

		int n = low;
		while (n <= high) {
			int factors = 0;
			for (int i=2; i*i<=n; i++) {
				if (n%i == 0) {
					factors++;
					break;
				}
			}
			if (factors == 0) {
				System.out.println(n);
			}
			n++;
		}

	}
}

/*  f1 * f2 = n
	but f1 <= f2
	max value of f1 can be f2
	if f1 = f2, then f1 * f1 = n => f1 = underroot of n
	max value of f1 = underroot of n;
	min value of f1 = 2;
*/