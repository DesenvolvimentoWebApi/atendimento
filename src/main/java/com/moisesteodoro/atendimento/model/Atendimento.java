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

/** 
 * Um atendimento é uma interação iniciada pelo cliente e atendida por um operador.
 */

@Data
@NoArgsConstructor
@Entity
public class Atendimento {

    /**
     * Identificação do objeto
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Breve descrição para quem o operador possar iniciar o atendimento
     * @see #descricao
     */

    private String sumario;

    /**
     * Data e hora da criação do atendiemento
     */
    private LocalDate criacao;
    
    /**
     * Descrição detalhada do atendimento
     * @see #sumario
     */

    private String descricao;

    /**
     * Tipo de atendimento de acordo com as opções disponíveis em {@link com.moisesteodoro.atendimento.model.TipoAtendimento Tipo de Atendimento}
     */
    @Enumerated(EnumType.STRING)
    private TipoAtendimento tipo;

    /**
     * Cliente que requisitou o atendimento 
     */
    @ManyToOne
    private Cliente cliente;

    /**
     * Operador responsável por dar prosseguimento ao atendimento
     */
    @ManyToOne
    private Operador responsavel;

}