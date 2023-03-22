import java.util.Scanner;

public class BT_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n;i++) {
			sum += i;
		}
		System.out.println("Tổng của n là " + sum);
	}
}
