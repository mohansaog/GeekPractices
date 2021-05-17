package Split;

public class Split_Concept {

	public static void main(String[] args) {
		
		String str = "geekss@for@geekss"; 
        String[] arrOfStr = str.split("@",3); 
        //System.out.println(arrOfStr[1]);
        for(int i=arrOfStr.length-1;i>=0;i--) {
        	System.out.println(reverseString(arrOfStr[i]));
        }
		/*
		 * for (String a : arrOfStr) System.out.println(a);
		 */
	}

	private static char[] reverseString(String string) {
		char[] toCharArray = string.toCharArray();
		for(int i=toCharArray.length-1,j=0; j<i;i--,j++) {
			char temp = toCharArray[i];
			toCharArray[i] = toCharArray[j];
			toCharArray[j] = temp;
		}
			
		return toCharArray;
	}

	

}
