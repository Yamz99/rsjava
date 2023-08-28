package demopackage;

public class ExceptionhandlingNaveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//uncaught exception - java.lang.ArithmeticException: / by zero
		//int i=9/0; 
		//System.out.println(i);
		//caught exception during compile time- Un-handled exception type InterruptedException
		//Thread.sleep(2000);
		
		
		//1.try catch block - if u dont write the try catch block the program 
		//will be terminated when it finds an exception and the rest of the code will not runs
		
		try {
			int i=9/0;
			System.out.println(i);
		}
		
		catch(ArithmeticException a)
		{
			a.printStackTrace();
			System.out.println(a.getMessage());
		}
		
		System.out.println("ABC");
	}

}
