package Exception_concept; 

public class CustomeException {

	public static void main(String[] args) {
		try {
			vaidate(14);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void vaidate(int i) throws InvalidException{
		if(i < 18)
			throw new InvalidException("invalid age");
		else
			System.out.println("welcome to vote");
	}

}
