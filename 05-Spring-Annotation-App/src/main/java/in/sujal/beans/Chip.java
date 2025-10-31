package in.sujal.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		System.out.println("Chip:contructor");
	}
	public String chipType() {
		return "32-Bit";
	}

}
