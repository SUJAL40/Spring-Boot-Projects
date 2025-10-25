package in.sujal.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
        // Step 1: Load the Spring configuration file (Beans.xml)
        // -------------------------------------------------------
        // The ClassPathXmlApplicationContext class is used to create
        // and start the Spring IOC Container.
        // It reads the "Beans.xml" file from the class-path (src/main/resources)
        // and creates all the bean objects defined inside that file.
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Step 2: Get the bean object from IOC container
        // -----------------------------------------------
        // Spring IOC Container manages all the objects (beans).
        // We can get a bean by:
        //   - bean id: context.getBean("paymentService")
        //   - or by class type: context.getBean(PaymentService.class)
        // Here we are fetching the object of PaymentService class.
        PaymentService service = context.getBean(PaymentService.class);

        // Step 3: Use the bean object
        // ----------------------------
        // The PaymentService class internally depends on IPayment interface.
        // Spring automatically injects (sets) the proper implementation
        // like CreditCardPayment or DebitCardPayment into PaymentService
        // as defined in Beans.xml.
        //
        // So when we call service.doPayment(195.00),
        // it actually calls the payment method of the injected payment class.
        service.doPayment(195.00);

        // Step 4: IOC container takes care of object life-cycle and dependency injection
        // -------------------------------------------------------------------------------
        // - You don’t manually create objects using 'new'
        // - Spring creates and manages them based on your configuration (Beans.xml)
        // - This is called "Inversion of Control" because the control of creating
        //   and managing objects is given to the Spring framework.
        
        
	}

}
