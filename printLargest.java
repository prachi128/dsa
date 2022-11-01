import java.util.*;

public class printLargest {
	public static void main (String[] args) {
		int a = 13;
		int b = 45;
		int c = 36;

		if (a > b && a > c) {
			System.out.println("a is largest");
		}
		else if (b > c) {
			System.out.println("b is largest");
		}
		else {
			System.out.println("c is largest");
		}
	}
}