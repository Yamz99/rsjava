package demopackage;

public class throwsKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		throwsKeyword n = new throwsKeyword();
		n.sum();

		System.out.println("executing further prog after exception ocuured and handled through throws");
	}

	// if we use this then
	// public void sum() throws ArithmeticException {
	// div();
	// }

	public void sum() throws ArithmeticException {

		try {
			div();
		}

		catch (ArithmeticException g) {
		}
	}

	public void div() throws ArithmeticException {
		int k = 9 / 0;// Exception line

		// By using throws keyword , the JVM will finally handle the exception throw
		// from the sequence chain of methods
		// div to sum to main to jvm - when JVM gives the exception it doesnt execute
		// the further code
		// this is the drawback of using only the throws keyword
		// to overcome this we need to handle this somewhere with try catch
	}

}
