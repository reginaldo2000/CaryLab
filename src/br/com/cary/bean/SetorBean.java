/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.SetorControl;
import br.com.cary.entity.Setor;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class SetorBean {
    
    private Setor setor;
    private SetorControl sc;
    
    public SetorBean() {
        setor = new Setor();
        sc = new SetorControl();
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    public void salvar() throws CampoVazioException {
        sc.salvar(setor);
    }
    
    public void editar() throws CampoVazioException {
        sc.editar(setor);
    }
    
    public void excluir() throws CampoVazioException {
        sc.excluir(setor);
    }
}
