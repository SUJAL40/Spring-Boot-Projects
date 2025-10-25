package in.sujal.spring.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: Constructor");
	}

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("CreditCard payment processed......");
		System.out.println(billAmt+" is received Succefully.....");
		return true;
	}

}
