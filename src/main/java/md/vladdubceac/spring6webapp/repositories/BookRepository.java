package md.vladdubceac.spring6webapp.repositories;

import md.vladdubceac.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
