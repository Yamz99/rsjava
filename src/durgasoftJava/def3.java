package durgasoftJava;

public class def3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doStuff();
		System.out.println(10 / 0);
	}

	public static void doStuff() {
		doMoreStuff();
		// Thread.sleep(1000); // checked exception- compiler during compilation checks
		// if the programmer
		// has handles this line or not as while this thread is sleeping chances are
		// another thread might interupt
		// hence the programmer shud've handled this

		System.out.println("hi");
	}

	public static void doMoreStuff() {
		System.out.println("doMorestuffcompleted");
	}

}
