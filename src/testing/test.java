package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class test {

	class Tweets{
		String name;

		public Tweets(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	public static void main(String args[]) {
	
		/*
		 * hashtag - #sachin tweet - #sachin is a great player #sachin retired
		 * 
		 * getTweets (String hashtag) addTweet( String hashtag, String tweet)
		 */
		
		String hashtag = "#sachin tweet";
		String tweet1 = "#sachin is a great player";
		String tweet2 = " #sachin retired";
		
		addTweet(hashtag,tweet2);
		
		
	}
	private static void addTweet(String hashtag, String tweet2) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put(hashtag,tweet2);
		String match = "#sachin";
		
		/*for(String a : hm) {
			if(a.contains(match)) {
				System.out.println(a);
			}*/
		
	}
	
}
