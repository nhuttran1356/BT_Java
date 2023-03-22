import java.util.Scanner;

public class BT_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap vi tri kangaroo thu nhat x1: ");
		int x1 = sc.nextInt();
		System.out.print("Nhap van toc kangaroo thu nhat v1: ");
		int v1 = sc.nextInt();
		System.out.print("Nhap vi tri kangaroo thu hai x2: ");
		int x2 = sc.nextInt();
		System.out.print("Nhap van toc kangaroo thu hai v2: ");
		int v2 = sc.nextInt();

		// Tính khoảng cách ban đầu giữa hai con kangaroo
		int s = Math.abs(x1 - x2);
		// Vận tốc giữa hai con kangaroo
		int v = Math.abs(v1 - v2);
		// Tính thời điểm gặp nhau của 2 con kangaroo
        int t = s / v ;
        
		// Nếu vận tốc của kangaroo đứng yên thì chúng không bao giờ gặp nhau
		if (v1 == v2 && x1 != x2) {
			System.out.println("Không gặp nhau");
		} else {
			//  số lần nhảy cần thiết để hai con kangaroo gặp nhau 

			if (x1 + t * v1 == x2 + t * v2) {
				System.out.println("Có gặp nhau");
				int x = x1 + (v1 * t);
				System.out.println("Gặp nhau ở x = " + x + " Vào thời điểm t = " + t);
			} else {
				System.out.println("Không gặp nhau");
			}
		}
	}
}
