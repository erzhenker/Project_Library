package ru.ivanov.Project_Library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ivanov.Project_Library.models.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    List<Book> findByTitleStartingWith(String title);
}
