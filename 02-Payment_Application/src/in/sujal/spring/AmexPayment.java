package in.sujal.spring;

public class AmexPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Amex payment processed......");
		System.out.println(billAmt+" is received Succefully.....");
		return true;
	}

}
