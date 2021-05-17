package String;

public class FrequencyEachCharWithNum {

	public static void main(String[] args) {
		// AAABBCDDA
		// 3A2BC2DA
		String str = "AAABBCDDA";

		StringBuilder newStr = new StringBuilder();

		int n = str.length();
		for (int i = 0; i < n; i++) {
			int count = 1;
			while ((i + 1) < n && (str.charAt(i) == str.charAt(i + 1))) {
				i++;
				count++;
			}
			if (count == 1) {
				newStr.append(str.charAt(i));
			} else {
				newStr.append(count);
				newStr.append(str.charAt(i));
			}

		}
		System.out.println(newStr);
	}

}
