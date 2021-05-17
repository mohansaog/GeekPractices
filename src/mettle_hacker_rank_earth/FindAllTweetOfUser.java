package mettle_hacker_rank_earth;

import java.util.ArrayList;
import java.util.List;

public class FindAllTweetOfUser {

	public static void main(String[] args) {
		String str1 = "#sachin is the best";
		String str2 = "our #sachin best";
		String  match = "#sachin";
		List<String> tweets = new ArrayList<String>();
		tweets.add(str1);
		tweets.add(str2);
		int count = 0;
		for(String s : tweets) {
			if(s.contains(match))
				count++;
		}
		System.out.println(count);
		
	}

}
