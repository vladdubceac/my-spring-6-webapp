package md.vladdubceac.spring6webapp.services;

import md.vladdubceac.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
