package demopackage;

public class staticVar {

	String name;
	String address;
	static String city;
	static int i;

	static {
		city = "Blore";
		i = 0;

	}

	staticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(address + " " + city);
	}

	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticVar obj = new staticVar("Yam", "nagarbhavi");
		staticVar obj1 = new staticVar("Pav", "Hoskerehalli");
		staticVar obj2 = new staticVar("Bhanu", "Vngr");
		obj.getAddress();
		obj1.getAddress();
		obj2.getAddress();

		getCity();
		staticVar.getCity();
		
		// can i access static methods using objects ? , yes , compiler will give a warning 
		//but however it executes and this is not a good practice
		// accessing static methods using objects
		
		obj2.getCity();
		obj1.getCity();
		obj.getCity();
		
		

	}

}
