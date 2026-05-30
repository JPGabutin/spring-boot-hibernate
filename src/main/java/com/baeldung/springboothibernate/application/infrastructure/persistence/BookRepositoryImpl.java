package com.baeldung.springboothibernate.application.infrastructure.persistence;

import java.util.List;

import com.baeldung.springboothibernate.application.component.book.domain.Book;
import com.baeldung.springboothibernate.application.component.book.domain.BookRepository;

public class BookRepositoryImpl implements BookRepository {
    private JpaBookRepository jpaBookRepository;

    public BookRepositoryImpl(JpaBookRepository jpaBookRepository) {
        this.jpaBookRepository = jpaBookRepository;
    }

    public List<Book> list() {
        return jpaBookRepository.findAll();
    }

}
