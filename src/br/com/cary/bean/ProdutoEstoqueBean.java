/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.ProdutoEstoqueControl;
import br.com.cary.dao.ProdutoEstoqueDAO;
import br.com.cary.entity.ProdutoEstoque;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class ProdutoEstoqueBean {

    private ProdutoEstoque produtoEstoque;
    private ProdutoEstoqueControl produtoEstoqueControl;

    public ProdutoEstoqueBean() {
        produtoEstoque = new ProdutoEstoque();
        produtoEstoqueControl = new ProdutoEstoqueControl();
    }

    public void salvar() throws CampoVazioException {
        produtoEstoqueControl.salvar(produtoEstoque);
    }

    public void atualizarEstoque() throws CampoVazioException {
        if (ProdutoEstoqueDAO.getInstance().verificaSeExiste(produtoEstoque) == null) {
            produtoEstoqueControl.salvar(produtoEstoque);
        } else {
            produtoEstoqueControl.atualizarEstoque(produtoEstoque);
        }
    }

    public ProdutoEstoque getProdutoEstoque() {
        return produtoEstoque;
    }

    public void setProdutoEstoque(ProdutoEstoque produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

}
