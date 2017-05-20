
package br.com.cary.control;

import br.com.cary.dao.FuncionarioDAO;
import br.com.cary.entity.Funcionario;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.PhoneException;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo
 */
public class FuncionarioControl {
    
    public void salvar(Funcionario func) throws CampoVazioException, PhoneException {
        if(func.getCodigo() != null) {
            FuncionarioDAO.getInstance().atualizar(func);
        } else {
            if(func.getNome().isEmpty()) {
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                FuncionarioDAO.getInstance().salvar(func);
            }
        }
    }
    
    public void atualizar(Funcionario func) throws CampoVazioException, PhoneException {
        if(func.getCodigo() == null) {
            throw new CampoVazioException("Selecione um funcionário!");
        } else {
            if(func.getNome().isEmpty()) {
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                FuncionarioDAO.getInstance().atualizar(func);
            }
        }
    }
    
    public void excluir(Funcionario func) throws CampoVazioException {
        if(func.getCodigo() == null) {
            throw new CampoVazioException("Selecione um funcionário!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o funcionário!", "Atenção", 0,3, null);
            if(opcao == JOptionPane.YES_OPTION) {
                FuncionarioDAO.getInstance().excluir(func);
            }
        }
    }
    
}
