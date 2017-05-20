/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.EntradaParcelaControl;
import br.com.cary.entity.EntradaParcela;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class EntradaParcelaBean {
    
    private EntradaParcela entradaParcela;
    private EntradaParcelaControl epc;
    
    public EntradaParcelaBean() {
        entradaParcela = new EntradaParcela();
        epc = new EntradaParcelaControl();
    }
    
    public void salvarParcelas() throws CampoVazioException {
        epc.salvar(entradaParcela);
    }
    
    public EntradaParcela getEntradaParcela() {
        return entradaParcela;
    }

    public void setEntradaParcela(EntradaParcela entradaParcela) {
        this.entradaParcela = entradaParcela;
    }
    
    
}
