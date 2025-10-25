package in.sujal.spring.beans;

public class PetrolEngin implements IEngin{
	
	public PetrolEngin() {
		System.out.println("PertrolEngin :: 0-Constructor");
	   }
	
	public int start() {
		System.out.println("PertrolEngin Started.....");
		return 1;
	}
}
