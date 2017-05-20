/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.UsuarioDAO;
import br.com.cary.entity.Usuario;
import br.com.cary.exceptions.AutenticacaoException;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.view.FormPrincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo
 */
public class UsuarioControl {

    private UsuarioDAO udao;

    public UsuarioControl() {
        udao = new UsuarioDAO();
    }

    public void salvar(Usuario us) throws CampoVazioException {
        if (us.getCodigo() != null) {
            udao.atualizar(us);
        } else {
            if (us.getNomeUsuario().isEmpty() || us.getSenha().isEmpty()) {
                throw new CampoVazioException("Preencha todos os campos obrigatórios(*)!");
            } else {
                udao.salvar(us);
            }
        }
    }

    public void editar(Usuario us) throws CampoVazioException {
        if (us.getCodigo() == null) {
            throw new CampoVazioException("Por favor, selecione um usuário!");
        } else {
            if (us.getNomeUsuario().isEmpty() || us.getSenha().isEmpty()) {
                throw new CampoVazioException("Preencha todos os campos obrigatórios(*)!");
            } else {
                udao.atualizar(us);
            }
        }
    }

    public void excluir(Usuario us) throws CampoVazioException {
        if (us.getCodigo() == null) {
            throw new CampoVazioException("Por favor, selecione um usuário!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o usuário?", "???", 0, 3, null);
            if (opcao == JOptionPane.YES_OPTION) {
                udao.excluir(us);
            }
        }
    } 
    
    public void autenticar(Usuario us) throws AutenticacaoException {
        if(!UsuarioDAO.getInstance().autenticar(us)) {
            throw new AutenticacaoException();
        }
    }
    
}
