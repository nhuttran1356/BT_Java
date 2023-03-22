
public class BT_1 {
	public static void main(String[] args) {
		String n1 = "* * * * * * ==================================";
		String n2 = " * * * * *  ==================================";
		String n3 = "==============================================";
		
		for(int i = 0; i < 4; i++) {
			System.out.println(n1);
			System.out.println(n2);
		}
		System.out.println(n1);
		for(int i = 0; i < 6; i++) {
			System.out.println(n3);
		}
	}
}
