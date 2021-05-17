package Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "aab";
		checkAnagram(str1,str2);

	}
	//using charAt(i)
	private static void checkAnagram(String str1, String str2) {

		int count = 0;
		for(int i=0;i<str1.length();i++)  
			count = count+str1.charAt(i);
		for(int i=0;i<str2.length();i++)
			count = count -  str2.charAt(i);
		if(count==0)
			System.out.println("yahoo");
		else 
			System.out.println("na hooo");
	}

}
