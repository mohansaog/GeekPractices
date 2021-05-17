package Arrays;

public class findAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Mohan";
		String str2 = "Mohn";
		ffAna(str1,str2);
				
	}

	private static void ffAna(String str1, String str2) {
		int sum = 0;
		for(int i=0;i<str1.length();i++) {
			sum+=str1.charAt(i);
		}
		for(int i=0;i<str2.length();i++) {
			sum-=str2.charAt(i);
		}
		if(sum == 0)
			System.out.println("hahah");
	}

}
