/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.ExameDAO;
import br.com.cary.entity.Exame;
import br.com.cary.entity.ExameComposicao;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class ExameControl {
    
    public void salvarExame(Exame ex) throws CampoVazioException {
        if(ex.getNomeExame().equals("")) {
            throw new CampoVazioException("Preencha os campos obrigatórios!");
        }
        ExameDAO.getInstance().salvar(ex);
    }
    
    public void salvarItem(ExameComposicao item) {
        ExameDAO.getInstance().salvar(item);
    }
}
