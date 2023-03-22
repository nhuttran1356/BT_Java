import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BT_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var list = new ArrayList<Integer>();
		var listchan = new ArrayList<Integer>();
		var listle = new ArrayList<Integer>();
		System.out.println("Nhập số phần tử vào mảng ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập từng phần tử thứ " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
			list.add(arr[i]);
		}
		System.out.println("Mảng sau khi nhập " + list);
		
		for (int i = 0; i < n; i++) {
			if(arr[i] % 2 == 0)
				listchan.add(arr[i]);
			else 
				listle.add(arr[i]);
		}
		
		System.out.println("Chẳn " + listchan);
		System.out.println("Lẻ " + listle);
	}
}
