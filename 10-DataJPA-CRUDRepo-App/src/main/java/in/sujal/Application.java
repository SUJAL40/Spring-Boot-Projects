package in.sujal;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sujal.entity.Book;
import in.sujal.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
		//IOC container will return implementing class object
		System.out.println(repo.getClass().getName());
		
//		Book b = new Book();
//		b.setBookId(101);
//		b.setBookName("SPRING");
//		b.setBookPrice(25_000.00);
//		repo.save(b);
//		System.out.println("Record Inserted.....");
		
		//To retrieve data form database
		
		Optional<Book> id = repo.findById(101);
		//repo.findById() give Optional object to avoid null pointer exception
		System.out.println(id.toString());
	}

}
