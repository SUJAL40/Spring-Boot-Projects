package in.sujal.spring.beans;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}
	
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit card payment processed......");
		System.out.println(billAmt+" is received Succefully.....");
		return true;
	}

}
