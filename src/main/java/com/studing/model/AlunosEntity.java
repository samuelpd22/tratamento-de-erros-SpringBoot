package com.studing.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table ( name = "SM_ALUNOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AlunosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String nome;


    @Column
    private String classe;
}
