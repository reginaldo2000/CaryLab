/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.FilialControl;
import br.com.cary.entity.Filial;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class FilialBean {
    
    private Filial filial;
    private FilialControl fc;
    
    public FilialBean() {
        filial = new Filial();
        fc = new FilialControl();
    }
    
    public void salvar() throws CampoVazioException{
        fc.salvar(filial);
    }
    
    public void editar() throws CampoVazioException{
        fc.atualizar(filial);
    }
    
    public void excluir() throws CampoVazioException{
        fc.excluir(filial);
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }
    
    
}
