/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.FornecedorPrecoCustoControl;
import br.com.cary.entity.FornecedorPrecoCusto;

/**
 *
 * @author Reginaldo
 */
public class FornecedorPrecoCustoBean {
    
    private FornecedorPrecoCusto precoCusto;
    private FornecedorPrecoCustoControl fpcc;
    
    public FornecedorPrecoCustoBean() {
        precoCusto = new FornecedorPrecoCusto();
        fpcc = new FornecedorPrecoCustoControl();
    }
    
    public void cadastrar() {
        fpcc.cadastrarPrecoCusto(precoCusto);
    }
    
    public FornecedorPrecoCusto getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(FornecedorPrecoCusto precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    
}
