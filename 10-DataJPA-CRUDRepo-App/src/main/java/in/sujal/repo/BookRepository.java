package in.sujal.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.sujal.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
	public List<Book> findByBookPriceGreaterThanEqual(Double bookprice);
	
	@Query(value="select * from book",nativeQuery=true)
	public List<Book> getAllBooks();
	
}
