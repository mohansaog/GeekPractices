package testing;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class test1 {
	public static void main(String[] args) {
		  TreeMap<Float, Float> tm = new TreeMap<>();
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt(); 
		  String[] sarr;
		  String s = sc.nextLine();
		  for(int i =0;i<n;i++) { 
			   // Math 12:00 14:00 }
			  sarr = s.split(" ");
			  Float f1 = toConvertFloat(sarr[1]);
			  Float f2 = toConvertFloat(sarr[2]);
			  tm.put(f1, f2);
		  }
		 
		 Float max= 0f;
		 int count = 0;
		 System.out.println(tm);
		 for(Map.Entry<Float, Float> entry : tm.entrySet()) {
			 if((entry.getKey()) > max) {
				 max = entry.getValue();
				 count++;
			 }
		 }
		 System.out.println(count);
	}

	private static Float toConvertFloat(String string) {
		String[] sarr = string.split(":");
		String p = sarr[0]+sarr[1];
		return Float.parseFloat(p);
	}
}