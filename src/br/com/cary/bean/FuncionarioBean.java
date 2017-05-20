/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.bean;

import br.com.cary.control.FuncionarioControl;
import br.com.cary.entity.Funcionario;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.DataException;
import br.com.cary.exceptions.PhoneException;

/**
 *
 * @author Reginaldo
 */
public class FuncionarioBean {

    private Funcionario funcionario;
    private FuncionarioControl fc;

    public FuncionarioBean() {
        funcionario = new Funcionario();
        fc = new FuncionarioControl();
    }

    public void salvar() throws CampoVazioException, PhoneException {
        fc.salvar(funcionario);
    }

    public void editar() throws CampoVazioException, PhoneException {
        fc.atualizar(funcionario);
    }

    public void excluir() throws CampoVazioException {
        fc.excluir(funcionario);
    }

    public void validarData() throws DataException {

    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
