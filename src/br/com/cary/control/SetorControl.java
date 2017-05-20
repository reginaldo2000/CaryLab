/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.SetorDAO;
import br.com.cary.entity.Setor;
import br.com.cary.exceptions.CampoVazioException;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo
 */
public class SetorControl {
    
    public void salvar(Setor s) throws CampoVazioException {
        if(s.getCodigo() != null) {
            SetorDAO.getInstance().atualizar(s);
        } else {
            if(s.getNomeSetor().isEmpty()) {
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                SetorDAO.getInstance().salvar(s);
            }
        }
    }
    
    public void editar(Setor s) throws CampoVazioException {
        if(s.getCodigo() == null) {
            throw new CampoVazioException("Selecione um setor!");
        } else {
            if(s.getNomeSetor().isEmpty()) {
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                SetorDAO.getInstance().atualizar(s);
            }
        }
    }
    
    public void excluir(Setor s) throws CampoVazioException {
        if(s.getCodigo() == null) {
            throw new CampoVazioException("Selecione um setor!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o setor?", "Atenção", 0,3,null);
            if(opcao == JOptionPane.YES_OPTION) {
                SetorDAO.getInstance().excluir(s);
            }
        }
    }
}
