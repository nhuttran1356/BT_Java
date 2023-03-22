import java.util.Scanner;

public class BT_2 {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1. dec to bin");
		System.out.println("2. bin to dec");
		int a = 0;
		a = sc.nextInt();
		if (a == 1)
			dectobin();
		else if (a == 2)
			bintodec();

	}

	public static void dectobin() {
		String bin = "";
		System.out.println("Input Decimal");
		int b = sc.nextInt();
		while (b > 0) {
			bin = (b % 2) + bin;
			b /= 2;
		}
		System.out.println("dec to bin " + bin);
	}

	public static void bintodec() {
		int dec = 0;
		System.out.println("Input Binary");
		int b = sc.nextInt();
		int base = 1;
		while (b > 0) {
			int last_digit = b % 10;
			b /= 10;
			dec += last_digit * base;
			base *= 2;
		}
		System.out.println("bin to dec " + dec);
	}
}
