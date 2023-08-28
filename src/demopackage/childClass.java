package demopackage;

public class childClass extends parentClass{

	public void engine ()
	{
		System.out.println("child engine");
	}
	
	public void color ()
	{
		System.out.println(colour);
	}
	
//overriding method in parentClass
	
	public void audiosystem ()
	{
		System.out.println("child audiosystem");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClass cd = new childClass();
		cd.color();
		cd.brake();
		cd.audiosystem();
		cd.getacessmodify();
		
	}
}
