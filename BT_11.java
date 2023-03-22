import java.util.Scanner;

public class BT_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n ");
		int n = sc.nextInt();
		int max = 0;
		double log = Math.log(n) / Math.log(2);
		for(int i = 1; i <= n; i++) {
			if(i < log)
				max = i;	
		}
		System.out.println("Số lớn nhất nhỏ hơn log2("+ n + ")là: " + max);
	}
}
