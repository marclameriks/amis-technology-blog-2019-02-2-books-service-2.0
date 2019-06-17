package nl.amis.demo.services.books_service.application;

import nl.amis.demo.services.books_service.domain.Book;
import nl.amis.demo.services.books_service.infrastructure.persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBook(String id) {
        return bookRepository.findById(id).orElseGet(Book::new);
    }

    public void addBook(Book whiskey) {
        bookRepository.save(whiskey);
    }

    public void updateBook(String id, Book whiskey) {
        bookRepository.save(whiskey);
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

}
