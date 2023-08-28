package demopackage;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] [] = new int [3][3];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		
		a[1][0]=4;
		a[1][1]=5;
		a[1][2]=6;
		
		a[2][0]=7;
		a[2][1]=8;
		a[2][2]=9;
	
		// printing specific value
		
		//System.out.println("static value in arrary a :"+a[2][0]);
		
//second way of declaring multi dim arr
		
		int b[][] = {{99,144,12} ,{22,33,44}};


for (int i=0;i<2;i++)//row
	
{
	for (int j=0;j<3;j++)//column
		
	{
		System.out.println(b[i][j]);
	}
		
}
	}

}
