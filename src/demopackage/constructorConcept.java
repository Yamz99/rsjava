package demopackage;

public class constructorConcept {

	String name;
	String modelnumber;
	int price;
	String engine;
	
	
	constructorConcept (String name,String modelnumber,int price,String engine)
	
	{
		// initializing the class instance variables 
		
		this.name=name;
		this.modelnumber=modelnumber;
		this.price=price;
		this.engine=engine;	
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		constructorConcept ob1= new constructorConcept("Audi","Mc123",50345,"automatic");
		
		System.out.println(ob1.name +" " + ob1.modelnumber +" " +  ob1.price + " " + ob1.engine);
		
		

	}

}
