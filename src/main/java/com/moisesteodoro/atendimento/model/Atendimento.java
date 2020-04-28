package com.moisesteodoro.atendimento.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Atendimento {

    private String sumario;
    private LocalDate criacao;
    private String descricao;
    private TipoAtendimento tipo;
    private Cliente cliente;
    private Operador responsavel;
    
}