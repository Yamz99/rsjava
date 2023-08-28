package demopackage;

public class InterviewMinimumnumber {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{166,46,5},{3,266,10},{9,6,11}};
		int min =a[0][0];
		
		
		//to find the min number in matrix traverse through
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				
			{
			
				System.out.println("all elements:"+a[i][j]);
				
				if (a[i][j]<min)
					
				{
					min=a[i][j];
				}
					
				
			}		
		}
		System.out.println(min);
	}

}
