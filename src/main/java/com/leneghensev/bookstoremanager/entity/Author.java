package com.leneghensev.bookstoremanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //indica que é uma entidade JPA (tabela no banco).
@Data //gera automaticamente os getters, setters, métodos equals e hashCode. @Dataé como ter implícitos @Getter,
// @Setter, @ToString, @EqualsAndHashCodee @RequiredArgsConstructoranotações na classe
@Builder //mecanismo para usar o padrão Builder sem escrever código clichê. Usado para construção de objetos de forma segura.
@NoArgsConstructor
@AllArgsConstructor

public class Author {

    @Id //toda entidade tem que ter uma chave primária, com essa notação, indica o id como chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para indicar que a cada inserção no banco de dados, o ID deve ser gerado automaticamente.
    private Long id;

    @Column(nullable = false, unique = true)//indica pro banco não permitir esse valor vazio e que esse item é único)
    private String name;

    @Column(nullable = false)//indica pro banco não permitir esse valor vazio)
    private Integer age;
}
