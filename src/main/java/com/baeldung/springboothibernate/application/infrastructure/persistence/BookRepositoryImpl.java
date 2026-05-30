package com.baeldung.springboothibernate.application.infrastructure.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baeldung.springboothibernate.application.component.book.domain.Book;
import com.baeldung.springboothibernate.application.component.book.domain.BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository {
    private JpaBookRepository jpaBookRepository;

    public BookRepositoryImpl(JpaBookRepository jpaBookRepository) {
        this.jpaBookRepository = jpaBookRepository;
    }

    @Override
    public List<Book> list() {
        return jpaBookRepository.findAll();
    }

}
