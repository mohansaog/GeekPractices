package logger;

import java.util.logging.Logger;

public class Log_Youtube_1 {

	private static final Logger LOGGER = Logger.getLogger(Log_Youtube_1.class.getName());
	
	public static void main(String[] args) {
		String str1 = "23:24:38";
		String[] str2 = {"22:33:44","21:34:35","20:34:21"};
		int n = str2.length;
		int a;
		String[] strarr1 = str1.split(":");
		for(int i=0;i<n;i++) {
			String[] pp = str2[i].split(":");
			a = Integer.parseInt(strarr1[0]) - Integer.parseInt(pp[i]);
			System.out.println(a);
			a = 0;
		}
		
		
		
	}

}
