package demopackage;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=3;i++)
			
		{
			System.out.println("outerloopstart");
			
			for(int j=1;j<=2;j++)
				
			{
				System.out.println("INNER loopstart");
			}
			
			System.out.println("OUTER END");
		}
			
	}

}

//print 
//1 2 3 4 
//5 6 7
//8 9
//10
