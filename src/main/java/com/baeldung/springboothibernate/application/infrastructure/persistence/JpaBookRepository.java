package com.baeldung.springboothibernate.application.infrastructure.persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baeldung.springboothibernate.application.component.book.domain.Book;

public interface JpaBookRepository extends JpaRepository<Book, UUID> {
}
