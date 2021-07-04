package com.leneghensev.bookstoremanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id //toda entidade tem que ter uma chave primária, com essa notação, indica o id como chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para indicar que a cada inserção no banco de dados, o ID deve ser gerado automaticamente.

    private Long id;

    @Column(nullable = false, unique = true)//indica pro banco não permitir esse valor vazio e que esse item é único)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publisherName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) // direcionar que um livro tem só um autor.
    // E usa a estratégia Lazy para fazer o Join, melhorando a performance. E usou a estratégia de cascade pra fazer a
    // inserção, atualização e remoção: toda vez que insere, atualiza ou remove um livro automaticamente altera um autor.
    @JoinColumn(name = "author_id") //para dizer qual coluna do banco de Dados vai fazer o relacionamento
    private Author author;

}
