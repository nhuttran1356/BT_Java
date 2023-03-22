import java.util.Random;
import java.util.Scanner;

public class BT_17 {
	public static void main(String[] args) {
		Random random = new Random();
		int secretNumber = random.nextInt(1000) + 1; // Số bí mật là một số ngẫu nhiên từ 1 đến 1000
//		System.out.println("Số bí mật " + secretNumber);
		Scanner sc = new Scanner(System.in);
		System.out.print("Hãy đoán số từ 1 đến 1000: ");
		int guess = sc.nextInt();
		int count = 0 ; 
		// Vòng lặp kiểm tra kết quả đoán
		while (guess != secretNumber) {
			count++;
			if (guess < secretNumber) {
				System.out.println("Bạn đang đoán số nhỏ hơn số tôi đang nghĩ đến. Hãy đoán lại!");
			} else {
				System.out.println("Bạn đang đoán số lớn hơn số tôi đang nghĩ đến. Hãy đoán lại!");
			}
			guess = sc.nextInt();
		}

		// In kết quả nếu đoán đúng
		System.out.println("Chúc mừng! Bạn đã đoán đúng số " + secretNumber + "!");
		System.out.println("Bạn đã đoán sai: " + count + " lần");
	}
}