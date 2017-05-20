/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.UsuarioControl;
import br.com.cary.entity.Usuario;
import br.com.cary.exceptions.AutenticacaoException;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class UsuarioBean {

    private Usuario usuario;
    private UsuarioControl uc;

    public UsuarioBean() {
        usuario = new Usuario();
        uc = new UsuarioControl();
    }

    public void salvar() throws CampoVazioException {
        uc.salvar(usuario);
    }

    public void editar() throws CampoVazioException {
        uc.editar(usuario);
    }

    public void excluir() throws CampoVazioException {
        uc.excluir(usuario);
    }
    
    public void autenticarUsuario() throws AutenticacaoException {
        uc.autenticar(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
