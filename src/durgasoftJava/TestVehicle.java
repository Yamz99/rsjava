package durgasoftJava;

public class TestVehicle extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BusVehicle b =new BusVehicle();
		CarVehicle c= new CarVehicle();
		
		System.out.println(b.getnoOfwheels());
		System.out.println(c.getnoOfwheels());
		
		TestVehicle t1= new TestVehicle();
		

		
	}

}
