import java.util.Scanner;

public class BT_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập năm cần kiểm tra: ");
		int year = sc.nextInt();

		// Kiểm tra xem năm có phải là năm nhuận hay không
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				}
			} else {
				isLeapYear = true;
			}
		}

		// In kết quả
		if (isLeapYear) {
			System.out.println(year + " là năm nhuận.");
		} else {
			System.out.println(year + " không phải là năm nhuận.");
		}
	}
}
