
public class BT_3 {
	public static void main(String[] args) {
		System.out.println(System.getProperty("java.vendor"));
		String[] key = { "java.version", "java.runtime.version", "java.vendor", "java.vendor.url", "java.home",
				"java.class.parth" };
		for (int i = 0; i < key.length; i++) {
			System.out.println(key[i].replace(".", " ") +" "+ System.getProperty(key[i]));
		}
	}
}
