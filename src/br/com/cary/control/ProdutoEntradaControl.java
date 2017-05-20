/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.ProdutoEntradaDAO;
import br.com.cary.entity.ProdutoEntrada;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class ProdutoEntradaControl {
    
    public void salvar(ProdutoEntrada pent) throws CampoVazioException {
        if(pent.getEntrada() == null) {
            throw new CampoVazioException("Nenhuma entrada vinculada aos produtos!");
        }
        ProdutoEntradaDAO.getInstance().salvar(pent);
    }
}
