package com.leneghensev.bookstoremanager.repository;

import com.leneghensev.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    //classe que faz o gerenciamento da Entity com o banco de dados
}
