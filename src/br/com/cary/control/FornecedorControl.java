/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.FornecedorDAO;
import br.com.cary.entity.Fornecedor;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.PhoneException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yago
 */
public class FornecedorControl {
    public void salvar(Fornecedor fornec) throws CampoVazioException{
        if(fornec.getCodigo() != null){
            FornecedorDAO.getInstance().atualizar(fornec);
        }else{
            if(fornec.getNomeFantasia().isEmpty() || fornec.getEndereco().isEmpty() || fornec.getNumero().isEmpty() || fornec.getCidade().isEmpty()){
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            }else{
                FornecedorDAO.getInstance().salvar(fornec);
            }
        }
    }
    
    public void atualizar(Fornecedor fornec) throws CampoVazioException{
        if(fornec.getCodigo() == null){
            throw new CampoVazioException("Selecione um fornecedor!");
        }else{
            if(fornec.getNomeFantasia().isEmpty() || fornec.getEndereco().isEmpty() || fornec.getNumero().isEmpty() || fornec.getCidade().isEmpty()){
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            }else{
                FornecedorDAO.getInstance().atualizar(fornec);
            }
        }
    }
    
    public void excluir(Fornecedor fornec) throws CampoVazioException{
        if (fornec.getCodigo() == null) {
            throw new CampoVazioException("Selecione um fornecedor");
        }else{
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o fornecedor!", "Atenção", 0,3, null);
            if (opcao == JOptionPane.YES_OPTION) {
                FornecedorDAO.getInstance().excluir(fornec);
            }
        }
    }
}
