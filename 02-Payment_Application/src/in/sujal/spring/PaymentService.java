package in.sujal.spring;

public class PaymentService {
	
	IPayment payment;
	public PaymentService(IPayment payment) {
		// TODO Auto-generated constructor stub
		this.payment = payment;
	}
	
	public void doPayment(double billPay) {
		boolean status = payment.processPayment(billPay);
		if(status) {
			System.out.println("Payment Receipted.....");
		}else {
			System.out.println("Payment Declined!!!!!!");
		}
	}

}
