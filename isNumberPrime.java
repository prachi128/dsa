import java.util.*;

public class isNumberPrime {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int factors = 0;
			for (int i=2; i<n; i++) {
				if (n % i == 0) {
					factors++;
					break;
				}
			}
			if (factors > 0) {
				System.out.println("not prime");
			}
			else {
				System.out.println("prime");
			}
			
			t--;
		}
		
	}
}