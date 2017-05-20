/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.ProdutoEntradaControl;
import br.com.cary.entity.ProdutoEntrada;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class ProdutoEntradaBean {
    
    private ProdutoEntrada produtoEntrada;
    private ProdutoEntradaControl pec;
    
    public ProdutoEntradaBean() {
        produtoEntrada = new ProdutoEntrada();
        pec = new ProdutoEntradaControl();
    }
    
    public void salvar() throws CampoVazioException {
        pec.salvar(produtoEntrada);
    }

    public ProdutoEntrada getProdutoEntrada() {
        return produtoEntrada;
    }

    public void setProdutoEntrada(ProdutoEntrada produtoEntrada) {
        this.produtoEntrada = produtoEntrada;
    }
    
    
}
