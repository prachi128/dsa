import java.util.*;

public class reverseNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		while (n != 0) {
			int x = n%10;
			System.out.println(x);
			n = n/10;
		}
	}
}