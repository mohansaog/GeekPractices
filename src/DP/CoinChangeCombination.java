package DP;

public class CoinChangeCombination {

	public static void main(String[] args) {
		int[] denoms = { 2, 3, 5, 6 };
		int amt = 10;
		ccg(denoms, amt);
	}

	private static void ccg(int[] denoms, int amt) {

		int[] strg = new int[amt + 1];
		strg[0] = 1;
		for (int i = 0; i < denoms.length; i++) {
			for (int j = denoms[i]; j <= amt; j++) {
				strg[j] = strg[j] + strg[j - denoms[i]];
			}
		}
		System.out.println("output " + strg[amt]);

	}

}
