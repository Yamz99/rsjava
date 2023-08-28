package demopackage;

public class thisDemo {

	int a =30;//global var

	public void getdata() {

		int a=20; //local var

		System.out.println(a);
		System.out.println(this.a);
		
		// sum of local var and global var
		
		int b= a+this.a;
		System.out.println("sum is:"+b);
		// this keyword- refers to the current object - object scope lies in class level
		// in the above program when you use this , it refers to the class / global variable
		// super - brings the value from parent class
		//this - brings the value from the current class 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo obj = new thisDemo();
		obj.getdata();

	}

}
