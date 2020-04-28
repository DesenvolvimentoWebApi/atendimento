package com.moisesteodoro.atendimento.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Atendimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sumario;
    private LocalDate criacao;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoAtendimento tipo;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Operador responsavel;
    
}