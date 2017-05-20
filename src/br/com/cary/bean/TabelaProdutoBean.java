/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.TabelaProdutoControl;
import br.com.cary.entity.TabelaProduto;

/**
 *
 * @author Reginaldo
 */
public class TabelaProdutoBean {
    
    private TabelaProduto tabelaProduto;
    private TabelaProdutoControl tpc;
    
    public TabelaProdutoBean() {
        tabelaProduto = new TabelaProduto();
        tpc = new TabelaProdutoControl();
    }
    
    public void salvar() {
        tpc.salvar(tabelaProduto);
    }

    public void atualizar() {
        tpc.atualizar(tabelaProduto);
    }
    
    public void excluir() {
        tpc.excluir(tabelaProduto);
    }
    
    public TabelaProduto getTabelaProduto() {
        return tabelaProduto;
    }

    public void setTabelaProduto(TabelaProduto tabelaProduto) {
        this.tabelaProduto = tabelaProduto;
    }
    
    
}
