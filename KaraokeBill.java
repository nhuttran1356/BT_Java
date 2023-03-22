import java.util.Scanner;

public class KaraokeBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Nhập giờ bắt đầu và giờ kết thúc
        System.out.print("Nhập giờ bắt đầu (24h): ");
        int startTime = sc.nextInt();
        System.out.print("Nhập giờ kết thúc (24h): ");
        int endTime = sc.nextInt();

        // Tính thời gian sử dụng dịch vụ
        int timeUsed = endTime - startTime;

        // Tính giá tiền cho thời gian sử dụng trong 3 giờ đầu tiên
        int price = 0;
        if (timeUsed <= 3) {
            price = timeUsed * 30000;
        } else {
            price = 3 * 30000 + (int) Math.ceil((timeUsed - 3) * 0.3 * 30000);
        }

        // Nhập số chai nước được sử dụng
        System.out.print("Nhập số chai nước được sử dụng: ");
        int numOfDrinks = sc.nextInt();

        // Tính giá tiền cho nước
        int drinkPrice = numOfDrinks * 10000;

        // Tính tổng chi phí
        int total = price + drinkPrice;

        // Giảm giá nếu vào cửa từ 9:00 - 17:00
        if (startTime >= 9 && endTime <= 17) {
            total *= 0.8;
        }

        // In kết quả
        System.out.println("Tổng chi phí: " + total + " VNĐ");
	}
}
