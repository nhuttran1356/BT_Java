import java.util.Scanner;

public class BT_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("------- MENU -------");
			System.out.println("1. Giải phương trình bậc 1");
			System.out.println("2. Giải phương trình bậc 2");
			n = sc.nextInt();
			switch (n) {
			case 0:
				System.out.println("Thoát chương trình");
				break;
			case 1:
				pt1();
				break;
			case 2:
				pt2();
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ.");
				break;
			}
		} while (n != 0);
	}

	public static void pt1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		double a = sc.nextDouble();

		System.out.println("Nhập b: ");
		double b = sc.nextDouble();
		System.out.println(a + "x + " + b + " = 0");

		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình có vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
		} else {
			double x = -b / a;
			System.out.println("Phương trình có nghiệm: x = " + x);
		}
	}

	public static void pt2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập hệ số b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập hệ số c: ");
		double c = sc.nextDouble();
		System.out.println(a + "x^2 + " + b + "x +" + c +" = 0");
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình có vô số nghiệm.");
				} else {
					System.out.println("Phương trình vô nghiệm.");
				}
			} else {
				double x = -c / b;
				System.out.println("Phương trình có nghiệm: x = " + x);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm.");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép: x = " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm: x1 = " + x1 + ", x2 = " + x2);
			}
		}
	}
}
