/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.FinanceiroDAO;
import br.com.cary.entity.Financeiro;

/**
 *
 * @author Reginaldo
 */
public class FinanceiroControl {
    
    public void salvar(Financeiro finc) {
        FinanceiroDAO.getInstance().salvar(finc);
    }
}
