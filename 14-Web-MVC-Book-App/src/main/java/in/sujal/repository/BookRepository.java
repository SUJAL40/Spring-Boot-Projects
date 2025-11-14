package in.sujal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import in.sujal.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
