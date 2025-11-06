package in.sujal.repo;

import org.springframework.data.repository.CrudRepository;

import in.sujal.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
