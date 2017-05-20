/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.EntradaParcelaDAO;
import br.com.cary.entity.EntradaParcela;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class EntradaParcelaControl {
    
    
    public void salvar(EntradaParcela ent) throws CampoVazioException {
        if(ent.getEntrada().getCodigo() == null) {
            throw new CampoVazioException("Nenhuma entrada vinculada!");
        }
        EntradaParcelaDAO.getInstance().salvar(ent);
    }
}
