package com.example.lib.service;

import com.example.lib.model.Book;
import com.example.lib.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).get();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
