import java.util.Scanner;

public class BT_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chữ cần chuyển ");
		String mess = sc.nextLine();
		System.out.println("Chuyển từ " + mess + " thành " +mess.toUpperCase());
	}
}
