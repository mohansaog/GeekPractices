package mettle_hacker_rank_earth;

public class makePalindromByReplacement {

	public static void main(String[] args) {
		String s = "092282";
		
		int i=0;
        int j = s.length() - 1;
        String s1  = new String();
        
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                //char c1 = ;
                //char c2= s.charAt(j);
                s1 = s.replace(Character.toString(s.charAt(i)),"9");
                s1 = s.replace(Character.toString(s.charAt(j)),"9");
            }
            i++;j--;
        }
        System.out.println(s);
	}

}
