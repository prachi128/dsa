import java.util.*;

public class digitsofNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = n;
		int count = 0;
		while (x != 0) {
			count++;
			x = x/10;
		}

		while (count != 0) {
			System.out.println(n/(int)(Math.pow(10, count-1)));
			n = n % (int)(Math.pow(10, count-1));
			count--;
		}
	}
}