package demopackage;

//one try can be followed by mutiplle catch blocks 
//catch should be an immediate block after try
// we can have multiple catch blocks

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 7;
		int c = 0;
//create array
		int arr[] = new int[5];

		try {
// gives arithmetic exceptions
//	float k=b/c;
//	System.out.println(k);

			System.out.println(arr[7]);
		}

		catch (ArithmeticException et) {

			System.out.println("caught Arithmetic exception");
		}

		catch (ArrayIndexOutOfBoundsException es) {

			System.out.println("caught ArrayIndexoutofbounds exception");
		}

		catch (Exception e) {

			// retry again

			System.out.println("I catched the error/exception");
		}

		// code execution should not be terminated
		// when an exception occurs hence we should handle the exception and the rest of
		// the code should run

		finally {
			System.out.println("delete cookies");
			// THis block is executed irrespective of exception thrown or not } //
		}

		System.out.println("end of program after exceptions");

	}

}
