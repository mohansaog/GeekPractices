package String;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String newstr =new String();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(newstr.indexOf(c) < 0)
				newstr = newstr+c;
		}
		System.out.println(newstr);
	}

}
