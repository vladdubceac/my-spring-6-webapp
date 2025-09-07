package md.vladdubceac.spring6webapp.services;

import md.vladdubceac.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
