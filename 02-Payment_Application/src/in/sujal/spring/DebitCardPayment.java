package in.sujal.spring;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit card payment processed......");
		System.out.println(billAmt+" is received Succefully.....");
		return true;
	}

}
