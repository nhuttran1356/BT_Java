import java.util.Scanner;

public class BT_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một chuỗi: ");
		String str = sc.nextLine();

		// In ra độ dài của chuỗi
		System.out.println("Độ dài của chuỗi là: " + str.length());

		System.out.println("Nhập vị trí cần lấy ký tự: ");
		int index = sc.nextInt();
		if (index >= 0 && index < str.length()) {
			// In ra ký tự tại vị trí index
			System.out.println("Ký tự tại vị trí " + index + " là: " + str.charAt(index));
		}

		// Kiểm tra xem chuỗi str có chứa chuỗi "abcdef" hay không

		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c' || str.charAt(i) == 'd'
					|| str.charAt(i) == 'e' || str.charAt(i) == 'f') {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Chuỗi " + str + " có chứa chuỗi 'abcdef'");
		else
			System.out.println("Chuỗi " + str + " không chứa chuỗi 'abcdef'");

	}
}
