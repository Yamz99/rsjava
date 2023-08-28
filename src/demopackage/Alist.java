package demopackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alist {

	int i=90;
	public int j=67;
	
	 public void abc()
	{
		System.out.println("hello diff class");
	}
	
	final void getdata()
	{
		System.out.println("hello final example function");
	}
	
	protected void specifier()
	{
		System.out.println("accessing protected method from parent class from child class");
	}
	
	 int p=6799999;
	
	// default - can be accessed any were only in same package , different package u cant even if the class is inherited
	//public - can access across all packages
	//private-cant access outside class even in same package
	 //protected - can access the protected method , outside package if the class is inherited
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <String> a = new ArrayList <String> (); 
		
		//new operator allocates memory
		//ArrayList is a class in java , part of import java.util.ArrayList package, to access any methods in class we need to create objects
		a.add("Yamini");
		a.add("Srinivas");
		a.add("Pavan");
		a.add("A Kumar");
	    a.add("Bhanu S");
	    a.add("Susheela");
	    System.out.println();
	    a.remove(5);
	    a.get(1);
	    System.out.println(a.get(2));
	    System.out.println(a.get(3));
	    
	    
	    System.out.println("*******Printing all elements of array********");
//	    for (int i=0;i<a.size();i++)
//	    	
//	    {
//	    	System.out.println(a.get(i));
//	    }
//	    
	    
	    //enhanced for loop
	    
	    for(String allval : a)
	    	
	    {
	    	System.out.println(allval);
	    }
	    
	   System.out.println(a.contains("Pavan")); 
	   
	   //	Converting traditional array into arraylist and checking if it contains Pavan
	   
	   String [] name = {"Selenium","Bhanu","Pavan","test1","Good"};
	   
	                List <String> nameArraylist =Arrays.asList(name);
	    
	                System.out.println("If the converted old array into arraylist contains Pavan ::::" +nameArraylist.contains("Pavan"));
	   }
	
	
	

}
