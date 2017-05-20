/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.FilialDAO;
import br.com.cary.entity.Filial;
import br.com.cary.exceptions.CampoVazioException;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo
 */
public class FilialControl {
    
    public void salvar(Filial f) throws CampoVazioException{
        if(f.getCodigo() != null) {
            FilialDAO.getInstance().atualizar(f);
        } else {
            if(f.getNomeFilial().isEmpty()) {
                throw new CampoVazioException("Preencha os campos obrigatórios(*)!");
            } else {
                FilialDAO.getInstance().salvar(f);
            }
        }
    }
    
    public void atualizar(Filial f) throws CampoVazioException{
        if(f.getCodigo() == null) {
            throw new CampoVazioException("Por favor, selecione uma filial!");
        } else {
            if(f.getNomeFilial().isEmpty()) {
                throw new CampoVazioException("Preencha os campos obrigatórios(*)!");
            } else {
                FilialDAO.getInstance().atualizar(f);
            }
        }
    }
    
    public void excluir(Filial f) throws CampoVazioException{
        if(f.getCodigo() == null) {
            throw new CampoVazioException("Por favor, selecione uma filial!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a filial?", "Atenção", 0,3, null);
            if(opcao == JOptionPane.YES_OPTION) {
                FilialDAO.getInstance().excluir(f);
            }
        }
    }
}
