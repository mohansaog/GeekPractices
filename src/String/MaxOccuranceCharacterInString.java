 package String;

public class MaxOccuranceCharacterInString {

	public static void main(String[] args) {
		String str = "mohanlalsao";
		MaxOccurance(str);
	}

	private static void MaxOccurance(String str) {
		int max = 256;
		int min = -1;
		char c = ' ';
		int temp[] = new int[max];
		for(int i=0;i<str.length();i++) {   
			temp[str.charAt(i)]++;
		}
		for(int i=0;i<str.length();i++) {
			if(temp[str.charAt(i)] > min) {
				min = temp[str.charAt(i)];
				c = str.charAt(i);
			}
				
		}
		
		System.out.println(c+"  "+min);
		
	}

}
