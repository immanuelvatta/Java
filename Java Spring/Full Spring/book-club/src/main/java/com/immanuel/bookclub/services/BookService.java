package com.immanuel.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immanuel.bookclub.models.Book;
import com.immanuel.bookclub.repositories.BookRepository;

import jakarta.validation.Valid;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepository;

    public void newBook(@Valid Book book) {
        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }

    public void updateBook(@Valid Book book) {
        bookRepository.save(book);
    }

}
