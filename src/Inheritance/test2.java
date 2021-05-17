package Inheritance;

class A {
	int i;
	  public void honk() {                   
	    System.out.println(i);
	  }
}
public class test2 extends A{
	int j;
	public void honk() {                   
	    System.out.println(j);
	  }

	public static void main(String[] args) {
		
		test2 myCar = new test2();
		myCar.i=1;
		myCar.j = 2;
		myCar.honk();
	}

}
