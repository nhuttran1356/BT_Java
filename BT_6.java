import java.util.Scanner;

public class BT_6 {
	public static void main(String[] args) {
		System.out.println("Nhap chuoi can dao nguoc");
		Scanner sc = new Scanner(System.in);
		String chuoi = "";
		chuoi = sc.nextLine();
		StringBuilder sb = new StringBuilder(chuoi);
		System.out.println("sau khi dao nguoc " + sb.reverse());
	}
}
