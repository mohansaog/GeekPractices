package String;

public class FindSpecialCharInString {

	public static void main(String[] args) {
		String str = "mohan123";
		findSpecialSymbol(str);

	}

	private static void findSpecialSymbol(String str) {
		String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(specialCharactersString.contains(Character.toString(c))) {
				System.out.println("yes");
				break;
			}
		}
	}

}
