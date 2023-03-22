import java.util.Scanner;

public class BT_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so muon tim uoc ");
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder(" ");
		System.out.println("Uoc cua " + n + " la ");

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				sb.append(i + " "); 
		}
		System.out.println(sb);
	}
}
