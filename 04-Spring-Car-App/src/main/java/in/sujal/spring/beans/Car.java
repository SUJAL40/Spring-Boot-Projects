package in.sujal.spring.beans;

public class Car{
	
	private IEngin eng;
	
	public Car() {
		System.out.println("Car :: 0-Constructor");
	}
	
	public void setEng(IEngin eng) {
		this.eng = eng;
	}
	
	public void drive() {
		
		int status = eng.start();
		if(status>=1) {
			System.out.println("Journey started......");
		}else {
			System.out.println("Engin problem!!!!!!");
		}
	}
}
