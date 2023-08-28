package demopackage;

public class Corebrush3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an object
		//String is a literal
		
		String s2="hello";
		
		//new
		
		String s3 = new String("Welcome");
		
		String s4 = new String("Home");
		
		String s1= "Rahul shetty academy";
		
		System.out.println("string is a collection of characters,priniting elements at each index");
		
		for(int i=0;i<s1.length();i++)
			
		{
			System.out.println(s1.charAt(i));
		}
		
		//print reverse string
		System.out.println("*********Printing reverse string ******");
		for(int i=s1.length()-1;i>=0;i--)
			
		{
			System.out.println(s1.charAt(i));
		}
		
		
		System.out.println("before string is split : " + s1);
		
		System.out.println("splitting string based on space:these will be stored in diff indexes of array");
	String [] spiltedname=s1.split(" ");
	
	System.out.println(spiltedname[0]);
	System.out.println(spiltedname[1]);
	System.out.println(spiltedname[2]);
	
	
	System.out.println("spiltting based on shetty : " + s1);
	
	String [] spiltedname1=s1.split("shetty");
	System.out.println(spiltedname1[0]);
	System.out.println(spiltedname1[1]);
	
	System.out.println("using trim method of string class : ") ;
	System.out.println(spiltedname1[1].trim());
	
	
	}

}
