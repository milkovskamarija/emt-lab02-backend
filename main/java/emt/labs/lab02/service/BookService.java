package emt.labs.lab02.service;

import emt.labs.lab02.model.Author;
import emt.labs.lab02.model.Book;
import emt.labs.lab02.model.dto.BookDto;
import emt.labs.lab02.model.enumerations.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Page<Book> findAllWithPagination(Pageable pageable);

    Optional<Book> save(String name, Category category, Long authorId, int availableCopies);

    Optional<Book> save(BookDto bookDto);

    Optional<Book> edit(Long id, String name, Category category, Long authorId, int availableCopies);

    Optional<Book> edit(Long id, BookDto bookDto);

    void deleteById(Long id);

    //MARK BOOK RENTED
    //void markRented(Long id);

}
