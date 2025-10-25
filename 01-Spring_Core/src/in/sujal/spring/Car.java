package in.sujal.spring;

public class Car extends Engin{
	
	private IEngin eng;
	
	public Car(IEngin eng) {
		//process of starting one class object to another class object
		//injection throw constructor -> constructor injection		
		this.eng = eng;
	}
	
	/*
	if injection through setter method -> setter injection
	public void setEng(IEngin eng){
	this.eng = eng;
	}
	replace in car class
	car c = new car();
	c.setEng(new DiselEngin());
	c.drive();	
	*/
	
	/*
	 * field injection 
	 * c.eng = new PetrolEngin(); 
	 * 
	 */
	public void drive() {
		
		//car is extending properties form engin ,now car can't extend property form 
		//another class -> this is not recommended (we can't use inheritance in future)
		//car is tightly coupled with engin
//		int status = super.start();
		
		//what if we create object of engin
//		Engin e = new Engin();
//		int status = e.start();
		//if they made change in constructor of engin it affect on car class
		// tightly coupled 
		
		
		int status = eng.start();
		if(status>=1) {
			System.out.println("Journey started......");
		}else {
			System.out.println("Engin problem!!!!!!");
		}
	}
}
