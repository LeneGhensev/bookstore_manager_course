package com.leneghensev.bookstoremanager.controller;

import com.leneghensev.bookstoremanager.dto.MessageResponseDTO;
import com.leneghensev.bookstoremanager.entity.Book;
import com.leneghensev.bookstoremanager.repository.BookRepository;
import com.leneghensev.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //indica que a classe representa um controller
@RequestMapping("/api/v1/books") //indica o endereço da aplicação
public class BookController {

    private BookService bookService;

    @Autowired //injeção de dependência
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }
}
