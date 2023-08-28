package demopackage;

public class IndianTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to access the methods of the interface we need to create object of that interface , each interface we need different objects
		CentralTraffic a = new IndianTraffic(); //implementing interface at first
		IndianTraffic loc = new IndianTraffic();//object of own class
		ContinentalTraffic ct = new IndianTraffic();//implementing interface at first
		a.blueReady();
		a.greenGo();
		a.redStop();
		loc.Localcountry();
		ct.Trainsymbol();
		

	}

	//defining own class method 
	
	public void Localcountry()
	{
		System.out.println("local country method");
	}
	
	
	//interface methods below
	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Implemented from Continentaltraffic - so Trains go");
	}

	@Override
	public void greenGo() {
	System.out.println("Greensignal ");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red signal");
	}

	@Override
	public void blueReady() {
		// TODO Auto-generated method stub
		System.out.println("blue signals");
		
	}

}
