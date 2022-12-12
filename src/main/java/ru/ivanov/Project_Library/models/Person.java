package ru.ivanov.Project_Library.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Cascade;


import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Имя не должно быть путым")
    @Size(min = 2, max = 100, message = "Имя не должно быть короче 2 и длинее 100 символов")
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_date")
    @NotNull(message = "дата рождения не должна быть пустой")
    private int birth_date;

    @OneToMany(mappedBy = "owner")
    private List<Book> books;


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Person() {
    }
    public Person(String fullName, int birth_date) {
        this.fullName = fullName;
        this.birth_date = birth_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(int birth_date) {
        this.birth_date = birth_date;
    }


}