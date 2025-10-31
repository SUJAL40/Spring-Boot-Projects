package in.sujal.dto;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Sujal");
		p.setId(101);
		System.out.println(p.getName());
		System.out.println(p.getId());
		System.out.println(p.toString());
	}
}
