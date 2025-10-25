package in.sujal.spring;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("CreditCard payment processed......");
		System.out.println(billAmt+" is received Succefully.....");
		return true;
	}

}
