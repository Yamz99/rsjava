package durgasoftJava;

public class Defaultdifferentflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();
		System.out.println(10/0);
	}

	public static void doMoreStuff() {
		System.out.println("doMorestuffcompleted");
	}

}