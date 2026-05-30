package com.baeldung.springboothibernate.application.component.book.domain;

import java.util.List;

public interface BookRepository {
    List<Book> list();
}
