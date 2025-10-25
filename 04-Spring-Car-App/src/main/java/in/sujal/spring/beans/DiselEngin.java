package in.sujal.spring.beans;

public class DiselEngin implements IEngin{
	
   public DiselEngin() {
	System.out.println("DiselEngin :: 0-Constructor");
   }
	
	public int start() {
		System.out.println("DiselEngin Started.....");
		return 1;
	}
}
