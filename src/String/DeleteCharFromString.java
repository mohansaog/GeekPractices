package String;

public class DeleteCharFromString {

	public static void main(String[] args) {
		String str = "India is great";
		String str1 = "in";
		int n = str1.length();
		for(int i=0;i<n;i++) {
			str = str.replace(Character.toString(str1.charAt(i)), "");
			str = str.replace(Character.toString(str1.charAt(i)).toUpperCase(), "");
		}
		System.out.println(str);

	}

}
