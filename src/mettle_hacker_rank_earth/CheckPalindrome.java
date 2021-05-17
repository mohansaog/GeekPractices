package mettle_hacker_rank_earth;

public class CheckPalindrome {

	public static void main(String[] args) {
		int n = 12321;
		int nn = n;
		int sum = 0;
		while(n > 0) {
			int rem = n%10;
			sum = (sum*10)+rem;
			n = n/10;
		}
		if(sum == nn)
			System.out.println("palindrome");
		else
			System.out.println("not palidrome");
	
	}

}
