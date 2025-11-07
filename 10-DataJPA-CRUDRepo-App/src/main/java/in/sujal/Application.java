package in.sujal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sujal.entity.Book;
import in.sujal.repo.BookRepository;

@SpringBootApplication
public class Application {

	private static final String BookRepository = null;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
		//IOC container will return implementing class object
//		System.out.println(repo.getClass().getName());
		
//		Book b = new Book();
//		b.setBookId(101);
//		b.setBookName("SPRING");
//		b.setBookPrice(25_000.00);
//		repo.save(b);
//		System.out.println("Record Inserted.....");
		
		//To retrieve data form database
		
//		Optional<Book> id = repo.findById(101);
//		//repo.findById() give Optional object to avoid null pointer exception
//		System.out.println(id.toString());
		
		//saveAll() it insert multiple record
		
//		Book b2 = new Book();
//		b2.setBookId(102);
//		b2.setBookName("Angular");
//		b2.setBookPrice(2500.00);
//		
//		Book b3 = new Book();
//		b3.setBookId(103);
//		b3.setBookName("Java");
//		b3.setBookPrice(500.00);
//		
//		repo.saveAll(Arrays.asList(b2,b3));
//		
//		System.out.println("Data Saved Successfully.....");
		
		//check id is present or not
		
//		boolean status = repo.existsById(102);
//		System.out.println("Record present ::"+status);
//		
//		//Get record count of table
//		
//		System.out.println("Record Count::"+repo.count());
//		
//		Iterable<Book> all = repo.findAll(); //->select * from table_name
//		for(Book b:all) {
//			System.out.println(b);
//		}
//		
//		//findAllById()
//		
//		Iterable<Book> ids = repo.findAllById(Arrays.asList(101,103));
//		for(Book b:ids) {
//			System.out.println(b);
//		}
//		
		
		//delete the record
		
//		repo.deleteById(105);
		
		//Requirement :: Retrieve books whose price >=1000
		
//		List<Book> books = repo.findByBookPriceGreaterThanEqual(1000.00);
//		for(Book b:books) {
//			System.out.println(b);
//		}
		
		//get all data using custom query -> native query
		
		List<Book> allBooks = repo.getAllBooks();
		for(Book b:allBooks) {
			System.out.println(b);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
