import java.util.ArrayList;
import java.util.Scanner;

public class BT_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập từng phần tử thứ " + (i + 1) + ": ");
			arr.add(sc.nextInt());
		}
		System.out.println("Mảng sau khi nhập: " + arr);
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j)) {
					arr.remove(j);
					j--;
				}
			}
		}
		System.out.println("Mảng sau khi xóa phần tử trùng lặp: " + arr);
	}
}
