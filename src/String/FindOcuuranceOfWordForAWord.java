package String;

public class FindOcuuranceOfWordForAWord {

	public static void main(String[] args) {
		String str = "mohan lal sao kondatarai se hai mohan";
		String name = "mohan";
		FindOccuranceOfWordForAPerticularWord(str,name);
		
	}

	private static void FindOccuranceOfWordForAPerticularWord(String str,String name) {
		String pp[] = str.split(" ");
		int count = 0;
		for(int i=0;i<pp.length;i++) {
			if(name.equals(pp[i]))
				count++;
		}
		System.out.println(count);
		
	}

}
