import java.util.Scanner;

public class BT_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number (10 to 99): ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number (10 to 99): ");
		int num2 = sc.nextInt();

		int num1_unit = num1 % 10;
		int num1_ten = num1 / 10;
		int num2_unit = num2 % 10;
		int num2_ten = num2 / 10;

		if (num1_unit == num2_unit || num1_unit == num2_ten || num1_ten == num2_unit || num1_ten == num2_ten) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
