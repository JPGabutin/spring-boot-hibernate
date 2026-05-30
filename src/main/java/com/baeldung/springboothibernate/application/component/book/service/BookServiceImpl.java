package com.baeldung.springboothibernate.application.component.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baeldung.springboothibernate.application.component.book.domain.Book;
import com.baeldung.springboothibernate.application.component.book.domain.BookRepository;
import com.baeldung.springboothibernate.application.component.book.domain.BookService;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.list();
    }

}
