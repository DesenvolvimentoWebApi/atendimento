package com.moisesteodoro.atendimento.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private TipoAtendimento tipo;
    private Cliente cliente;
    private Operador responsavel;
    
}