package br.edu.ifms.crudspring.model;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Professor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    UUID id;
    String nome;
    @ManyToOne
    @JoinColumn(name = "turma_id")
    Turma turma;

}
