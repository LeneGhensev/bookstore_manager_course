package com.leneghensev.bookstoremanager.service;

import com.leneghensev.bookstoremanager.dto.MessageResponseDTO;
import com.leneghensev.bookstoremanager.entity.Book;
import com.leneghensev.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Livro criado com o ID:" + savedBook.getId()).build();
    }
}
