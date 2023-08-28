package demopackage;

public class Methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodsdemo d1 = new Methodsdemo();//creating object of class
		
		d1.getdata();
		String name =d1.getname();
		System.out.println(name);
		
		//accessing method in a different class
		Method3 d2= new Method3();
		d2.name3();//calling method by object
		getvalues(); //calling a static method without the help of object
	}

	//Why method ? - to execute lines of code , which can be reused
	
	// should not create method inside the main block
	//method can be run on demand- hence outside the main block
	// java will not alllow to declare method inside main block
		
	public void getdata()
	{
		System.out.println("same class method public");
	}
	
	public String getname()
	{
		return "Bhanu Srinivas";
	}
	
	// to access method of same class without creating object we need to declare the method as static
	// the method moves to class level and is not tied to objects
	public static void getvalues()
	{
		System.out.println("Static method accessed without the object");
	}
	
	
}
