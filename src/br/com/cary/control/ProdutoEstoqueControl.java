/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.ProdutoEstoqueDAO;
import br.com.cary.entity.ProdutoEstoque;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class ProdutoEstoqueControl {
    
    public void salvar(ProdutoEstoque pe) throws CampoVazioException{
        if(pe.getProduto().getCodigo() == null) {
            throw new CampoVazioException("Nenhum produto associado no estoque!");
        }
        if(pe.getSetor().getCodigo() == null) {
            throw new CampoVazioException("Nenhum setor associado no estoque!");
        }
        ProdutoEstoqueDAO.getInstance().salvar(pe);
    }
    
    public void atualizarEstoque(ProdutoEstoque prod) {
        
        ProdutoEstoqueDAO.getInstance().atualizarEstoque(prod);
    }
}
