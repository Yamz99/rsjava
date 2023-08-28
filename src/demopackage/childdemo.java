package demopackage;

public class childdemo extends parentdemo {

	String name = "Bhanu";

	public void getStringdata() {
		// System.out.println(super.name);
		System.out.println(name);
	}

	public void getdata() {
		super.getdata();
		System.out.println("childclass method");

	}

	public childdemo() { // always Super keyword written in child class
							// it should be the first statement in any constructor
							// even without using super method , the moment you create an object --->it
							// checks if in parent class default constructor is defined , if present it will
							// execute that
							// inside 1 constructor we cannot have 2 super keywords
							// inside 1 constructor we cant have super and this

		super(9);

		System.out.println("childcontructor");

	}

	public childdemo(int i) {
		super(1, 89);

		System.out.println("1 para");

	}

	public childdemo(int i, int j) {
		super(2, 99);

		System.out.println("2 para");

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		childdemo cd = new childdemo();
		cd.getdata();
		cd.getStringdata();
	

	}

}
