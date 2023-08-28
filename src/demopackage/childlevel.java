package demopackage;

public class childlevel extends childClass {
//function overloading
//Arguement type should be different or arguement datatype should be different
	
	
	public void getdata(int a )
	
	{
		System.out.println(a);
	}
	
public void getdata(String b)
	
	{
	System.out.println(b);
	}

public void getdata(int a, int b)

{
	System.out.println(a+b);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childlevel cl = new childlevel();
		cl.getdata(2);
		cl.getdata("Pavan");
		cl.getdata(5, 7);
	}

}
