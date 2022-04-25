package emt.labs.lab02.service;

import emt.labs.lab02.model.Author;
import emt.labs.lab02.model.Country;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> findById(Long id);

    List<Author> findAll();

    Optional<Author> save(String name, String surname, Country country);

    void deleteById(Long id);
}
