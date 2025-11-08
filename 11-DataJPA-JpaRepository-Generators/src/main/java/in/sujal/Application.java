package in.sujal;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sujal.entity.Order_DetailsEntity;
import in.sujal.repository.OrderDetailsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		OrderDetailsRepository repo = context.getBean(OrderDetailsRepository.class);
		
		Order_DetailsEntity entity = new Order_DetailsEntity();
		entity.setOrderBy("Premanand Maharaj");
		entity.setOrderPlacedDate(new Date());
		
		Order_DetailsEntity saved = repo.save(entity);
		System.out.println("✅ Saved: " + saved);
		

		context.close();
	}
}
