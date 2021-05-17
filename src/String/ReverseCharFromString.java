package String;

public class ReverseCharFromString {

	public static void main(String[] args) {
		String str = "Mohan";
		char c[] = str.toCharArray();
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			char p = c[i];
			c[i] = c[j];
			c[j] = p;
			i++;j--;
			}
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+"");
		}
		
	}

}
