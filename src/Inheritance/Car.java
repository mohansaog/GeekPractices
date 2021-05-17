package Inheritance;

class Vehicle {
	  protected String brand = "Ford";
	  public void honk() {
	    System.out.println("Tuut, tuut!");
	  }
	}

	class Car extends Vehicle {
	  private String modelName = "Mustang";
	  public void honk() {
		    System.out.println("Tuut");
		  }
	  public static void main(String[] args) {
	    Vehicle myFastCar = new Car();
	    myFastCar.honk();
	   // System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
	}