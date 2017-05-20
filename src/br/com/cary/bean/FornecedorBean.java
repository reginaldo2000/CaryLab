/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.FornecedorControl;
import br.com.cary.entity.Fornecedor;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Yago
 */
public class FornecedorBean {
    private Fornecedor fornecedor;
    private FornecedorControl fc;
    
    public FornecedorBean(){
        fornecedor = new Fornecedor();
        fc = new FornecedorControl();
    }
    
    public void salvar() throws CampoVazioException{
        fc.salvar(fornecedor);
    }
    
    public void editar() throws CampoVazioException{
        fc.atualizar(fornecedor);
    }
    
    public void excluir() throws CampoVazioException{
        fc.excluir(fornecedor);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornec) {
        this.fornecedor = fornec;
    }
    
    
}
