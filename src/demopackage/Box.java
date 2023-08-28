package demopackage;

public class Box {
	
	
	double width;
	double height;
	double length;
	
	String name;
	int age;
	
	
	Box(String name,int age)
	
	{
		System.out.println(name + age);
		this.name= name; //this.classvar=localvar , this refers to this class
		this.age=age;
		
		// name=name1;
		//age=age1; --- if variable names are diffrent we donot use this keyword
	}
	
	
	
	Box(double w, double h,double l) // parameterized constructor --- constructor recieving these parameters while object creation
	
	{
	
	
		width=w;
		height=h;
		length=l;	
		
		System.out.println("three param");
	}
	
	Box()
	
	{
		this(6,7,8);
		System.out.println("empty constructor");
			
	}
	
Box(String s)
	
	{
	System.out.println("String cons");
		System.out.println(s);
		
		
	}

	//compute and return volume
	
	double volume()
	{
		return width* height*length;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calculate dimension of box
		
		Box mybox1= new Box(2,3,4); //initializing constructor with these parameters
		Box mybox2= new Box(10,10,10);
		Box mybox3=new Box();
		Box mybox4=new Box("SweetHeart Pav");
		Box initializeclassvar=new Box("Bhanu",99);
		Box my5=new Box("hey",88);
		
		double vol;
		
		vol=mybox1.volume(); // mybox1 object is initilaized with above values during object creation -- 
		//now calling the volume metod with these parameter values
		
		System.out.println("volume of first object:"+vol);
		
		vol=mybox2.volume();
		
		System.out.println("volume of second object:"+vol);
		
		System.out.println(my5.name);
		System.out.println(my5.age);
		// compiler will call implict constructor if you have not defined constructor block 
		//when ever you create an object constructor is called 
		//block of code when ever an object is created 

	}
	}
	

