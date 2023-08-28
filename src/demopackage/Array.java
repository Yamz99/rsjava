package demopackage;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first way of declaring array
		//allocating memory and then assigning the values
		
		Alist a=new Alist();
		a.abc();
		System.out.println(a.p);
		
		int [] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		System.out.println(arr[3]);
		
		//second way of declaring array- size need not be known initially
		//the memory is dynamically created- you pass the values
		
		int[] arr1= {0,1,3,4,5,6,7};
		System.out.println(arr1[6]);
		
		//arr1 length= 7;
		System.out.println("******second array*******");
		for(int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}

		
		String [] name = {"Bhanu","Aishu","Pavan","Harshitha"};
		
		
		 for (int j=0;j<name.length;j++)
		 { 
			 System.out.println(name[j]); 
			 
		 }
		 
		//enhanced for loop to print all names in the array which has string
		
		 System.out.println("enhanced forloop");
		for(String s : name)
		{
			System.out.println(s);
		}
		
	}

}
