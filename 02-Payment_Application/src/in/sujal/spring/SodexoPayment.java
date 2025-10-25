package in.sujal.spring;

public class SodexoPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodexo payment processed......");
		System.out.println(billAmt+" is received Succefully.....");
		return true;
	}

}
