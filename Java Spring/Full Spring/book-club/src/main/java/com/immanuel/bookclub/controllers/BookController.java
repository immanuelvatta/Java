package com.immanuel.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.immanuel.bookclub.models.Book;
import com.immanuel.bookclub.models.User;
import com.immanuel.bookclub.services.BookService;
import com.immanuel.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

    @Autowired
    BookService bookService;
    @Autowired
    UserService userService;

    @GetMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book, Model model, HttpSession session) {

        if (session.getAttribute("user_id") == null) {
            return "redirect:/";
        } else {
            User user = userService.getUserById((Long) session.getAttribute("user_id"));
            model.addAttribute("user", user);
            return "book-new.jsp";
        }
    }

    @PostMapping("/books/create")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model,
            HttpSession session) {
        if (result.hasErrors()) {
            if (session.getAttribute("user_id") == null) {
                return "redirect:/initial";
            }
            User user = userService.getUserById((Long) session.getAttribute("user_id"));
            model.addAttribute("user", user);
            return "book-new.jsp";
        } else {
            User user = userService.getUserById((Long) session.getAttribute("user_id"));
            model.addAttribute("user", user);
            book.setUser(user);
            bookService.newBook(book);
            return "redirect:/books";
        }
    }

    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
        User user = userService.getUserById((Long) session.getAttribute("user_id"));
        model.addAttribute("user", user);
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "book-display.jsp";
    }
    
    @GetMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "book-edit.jsp";
    }
    
    @PutMapping("/books/update/{id}")
    public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result){
        if (result.hasErrors()){
            return "book-edit.jsp";
        }else{
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }
    
    @DeleteMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
        Book book = bookService.getBookById(id);
        if (book.getUser().getId() == (Long) session.getAttribute("user_id")){
            bookService.deleteBook(book);
        }
        return "redirect:/books";
    }

}
