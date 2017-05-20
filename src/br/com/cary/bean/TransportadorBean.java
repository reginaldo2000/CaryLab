/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.TransportadorControl;
import br.com.cary.entity.Transportador;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class TransportadorBean {
    
    private Transportador transp;
    private TransportadorControl tc;
    
    public TransportadorBean() {
        transp = new Transportador();
        tc = new TransportadorControl();
    }
    
    public void salvar() throws CampoVazioException {
        tc.salvar(transp);
    }
    
    public void editar() throws CampoVazioException {
        tc.editar(transp);
    }
    
    public void excluir() throws CampoVazioException {
        tc.excluir(transp);
    }

    public Transportador getTransp() {
        return transp;
    }

    public void setTransp(Transportador transp) {
        this.transp = transp;
    }

   
    
}
