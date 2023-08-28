package demopackage;

public class CoreBrush2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a code to check the multiples of 2 / not in an array

		int [] arr= {2000289765,11,13,15,7,2,4,8,17,100,15,102,112,98,114,5,106,88,177,96};



		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.println("multiple of 2 in an array : "+arr[i]);
				break;//exits the for loop and control comes out
			}


			else 

			{
				System.out.println("not multiple of two : "+ arr[i]);
			}
		}
	}
}



