/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Reginaldo
 */
@Entity
@Table(name = "tb_entradas")
public class Entrada {

    private Long codigo;
    private Fornecedor fornecedor;
    private Funcionario funcionario;
    private Setor setor;
    private String memorando;
    private Double frete;
    private Double valorTotal;
    private Double valorFinal;
    private Long notaFiscal;
    private Date dataEntrada;
    
    @Id
    @GeneratedValue
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @ManyToOne
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @ManyToOne
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @ManyToOne
    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Column(length = 120)
    public String getMemorando() {
        return memorando;
    }

    public void setMemorando(String memorando) {
        this.memorando = memorando;
    }

    public Double getFrete() {
        return frete;
    }

    public void setFrete(Double frete) {
        this.frete = frete;
    }

    @Column(name = "valor_total")
    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Column(name = "nota_fiscal")
    public Long getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(Long notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    @Column(name = "data_entrada")
    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    @Column(name = "valor_final")
    public Double getValorFinal() {
        return valorTotal + frete;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

}
