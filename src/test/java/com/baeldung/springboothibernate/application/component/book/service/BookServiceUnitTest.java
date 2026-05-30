package com.baeldung.springboothibernate.application.component.book.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.baeldung.springboothibernate.application.component.book.domain.Book;
import com.baeldung.springboothibernate.application.component.book.domain.BookRepository;
import com.baeldung.springboothibernate.application.component.book.domain.BookService;

public class BookServiceUnitTest {
    @Test
    void shouldGetAllBooks() {
        BookRepository bookRepository = Mockito.mock(BookRepository.class);
        BookService bookService = new BookServiceImpl(bookRepository);

        String[] bookNames = { "book1", "book2", "book3" };
        List<Book> books = Arrays.stream(bookNames).map(Book::new).collect(Collectors.toList());

        Mockito.when(bookRepository.list()).thenReturn(books);

        assertEquals(3, bookService.getAllBooks().size());
    }
}
