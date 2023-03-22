import java.util.Scanner;

public class BT_4 {
	public static void main(String[] args) {
		System.out.println("Nhập số nguyên");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Tổng các chữ số là: " + sumN(n));
	}
	public static int sumN(int n) {
		int tong = 0;
		while(n>0) {
			int sodu = n%10;
			n /= 10;
			tong += sodu;
		}
		return tong;
	}
}
