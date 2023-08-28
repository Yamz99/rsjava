package demopackage;

public interface CentralTraffic {
	
//by default any variables declared in interface will be public
//these are abstract methods- you cannot define body here
	public void greenGo();
	public void redStop();
	public void blueReady();	
}