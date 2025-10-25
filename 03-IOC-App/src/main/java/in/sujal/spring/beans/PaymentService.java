package in.sujal.spring.beans;

public class PaymentService {
	
	public PaymentService() {
		System.out.println("PaymentService :: 0-Constructor");
	}
	
	private IPayment payment;
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
	//To perform setter injection - setter method inside PaymentService.class
	public void setPayment(IPayment payment) {
		System.out.println("Setter method called");
		this.payment = payment;
	}
	
	public void doPayment(double billPay) {
		boolean status = payment.processPayment(billPay);
		//payment is injected object
		if(status) {
			System.out.println("Receipte Printed.....");
		}else {
			System.out.println("Card Declined!!!!!!");
		}
	}

}
