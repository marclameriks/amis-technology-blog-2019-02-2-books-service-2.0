package nl.amis.demo.services.books_service.infrastructure.persistence;

import nl.amis.demo.services.books_service.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
}

