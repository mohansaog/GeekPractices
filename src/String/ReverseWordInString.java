package String;

public class ReverseWordInString {

	public static void main(String[] args) {
		String str = "mohan lal sao";
		String[] newChar = str.split(" ");
		int i=0;
		int j=newChar.length - 1;
		
		while(i < j) {
			String temp = newChar[i];
			newChar[i] = newChar[j];
			newChar[j] = temp;
			i++;j--;
		}

		for(int k = 0;k < newChar.length;k++) {
			System.out.print(newChar[k] + " ");
		}
	}

}
