package com.gymSystem.apirestt.models;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name= "TB_INFORMACOES")
public class Informacoes implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private Integer matricula;

    private BigDecimal dataNascimento;

    private BigDecimal CPF;

    private String Status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public BigDecimal getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(BigDecimal dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getCPF() {
        return CPF;
    }

    public void setCPF(BigDecimal CPF) {
        this.CPF = CPF;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
