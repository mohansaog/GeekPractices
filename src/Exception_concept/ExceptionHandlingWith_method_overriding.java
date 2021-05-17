package Exception_concept;


class Parent {
	public void msg() throws Exception{
		System.out.println("parent");
	}
}
public class ExceptionHandlingWith_method_overriding extends Parent{

	public void msg() throws ArithmeticException{
		
		System.out.println("child");
	}
	public static void main(String[] args) throws Exception {
		Parent obj = new ExceptionHandlingWith_method_overriding();
		obj.msg();
	}

}
