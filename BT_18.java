import java.util.Scanner;

public class BT_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số tiền hiện tại: ");
		double P = sc.nextDouble(); //P là số tiền anh X đang có hiện tại.
		
		System.out.println("Nhập số tiền muốn có trong tương lai: ");
		double S = sc.nextDouble(); //P là số tiền anh X đang có hiện tại.
		
		System.out.println("Nhập lãi suất: ");
		double r = sc.nextDouble() / 12; //Lãi suất theo tháng 0 - 100%
		
		double n = Math.log(S/P) / Math.log(1 + r); // Công thức từ công thức tính lãi kép  
		
		System.out.println("Cần phải đợi " + Math.round(n) + " năm để có được số tiền muốn có");
	}
}
