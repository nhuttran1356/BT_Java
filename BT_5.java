package bt_5;

import java.util.Scanner;

public class BT_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap xA");
		int xA = sc.nextInt();
		
		System.out.println("Nhap yA");
		int yA = sc.nextInt();
		
		System.out.println("Nhap xB");
		int xB = sc.nextInt();
		
		System.out.println("Nhap yB");
		int yB = sc.nextInt();
		System.out.println("Độ dài AB là: " + doDai(xA, yA, xB, yB));
	}
	public static double doDai(int x1,int y1,int x2,int y2) {
		return Math.sqrt((x2*x2 - x1*x1)+(y2*y2 - y1*y1));
	}
		
}
