import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class BT_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Nhap vao mang
		System.out.println("Nhập số phần tử ");
		int m = sc.nextInt();
		var list = new ArrayList<Integer>();
		int number; // phần tử của mảng
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			System.out.println("Nhập từng phần tử thứ " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			list.add(arr[i]);
		}
		System.out.println("Mảng sau khi nhập " + list);

		System.out.println("-----------------------------------------");
		System.out.println("1. Tính giá trị trung bình             ");
		System.out.println("2. Tìm phần tử lớn nhất, nhỏ nhất      ");
		System.out.println("3. Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng  ");
		System.out.println("4. Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng ");
		System.out.println("5. In ra các phần tử chẵn, lẻ          ");
		System.out.println("6. Thêm một phần tử theo index       ");
		System.out.println("7.  Xóa một phần tử theo index        ");
		System.out.println("Chọn 1 trong các phương án trên: ");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("giá trị trung bình " + cauA(arr));
			break;
		case 2:
			cauB(arr);
			break;
		case 3:
			cauC(arr);
			break;
		case 4:
			cauD(arr);
			break;
		case 5:
			cauE(arr);
			break;
		case 6:
			System.out.println("Mảng cũ trước khi thêm " + list);
			cauF(list);
			break;
		case 7:
			System.out.println("Mảng cũ trước khi xóa " + list);
			cauG(list);
			break;
		}
	}

//Câu A
	public static double cauA(int[] arr1) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		return (double) sum / arr1.length;
	}

//Câu B
	public static void cauB(int[] arr1) {
		int max = arr1[0];
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min)
				min = arr1[0];
			if (arr1[i] > max)
				max = arr1[i];
		}
		System.out.println("Giá trị lớn nhất là: " + max);
		System.out.println("Giá trị nhỏ nhất là: " + min);
	}

// Câu C
	public static void cauC(int[] arr1) {
		int max = arr1[0];
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < 0 && arr1[i] > max)
				max = arr1[i];
			if (arr1[i] < 0 && arr1[i] < min)
				min = arr1[i];
		}
		System.out.println("Giá trị âm lớn nhất là: " + max);
		System.out.println("Giá trị âm nhỏ nhất là: " + min);
	}

// Câu D
	public static void cauD(int[] arr1) {
		int max = arr1[0];
		int min = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > 0 && arr1[i] > max)
				max = arr1[i];
			if (arr1[i] > 0 && arr1[i] < min)
				min = arr1[i];
		}
		System.out.println("Giá trị dương lớn nhất là: " + max);
		System.out.println("Giá trị dương nhỏ nhất là: " + min);
	}

// Câu E
	public static void cauE(int[] arr1) {
		System.out.print("Các phần tử chẵn trong mảng: ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0)
				System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("Các phần tử lẻ trong mảng: ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0)
				System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

// Câu F
	public static void cauF(List<Integer> list) {
		System.out.println("Nhập số muốn thêm vào mảng: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Nhập vị trí phần tử mới cần chèn trong mảng: ");
		int y = sc.nextInt();
		if (y >= 0 && y < list.size())
			list.add(y, x);
		else
			System.out.println("Vị trí không hợp lệ");
		System.out.println("Mảng mới là: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}

// Câu G
	public static void cauG(List<Integer> list) {
		System.out.println("Nhập vị trí phần tử cần xóa trong mảng: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x >= 0 && x < list.size())
			list.remove(x);
		else
			System.out.println("Vị trí không hợp lệ");
		System.out.print("Mảng mới là: ");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
	}

}
