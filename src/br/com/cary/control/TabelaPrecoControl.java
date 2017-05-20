/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.control;

import br.com.cary.dao.TabelaPrecoDAO;
import br.com.cary.entity.TabelaPreco;
import br.com.cary.exceptions.CampoVazioException;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo
 */
public class TabelaPrecoControl {

    public void salvar(TabelaPreco tabela) throws CampoVazioException {
        if (tabela.getNomeTabela().isEmpty()) {
            throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
        } else {
            TabelaPrecoDAO.getInstance().salvar(tabela);
        }
    }

    public void editar(TabelaPreco tabela) throws CampoVazioException {
        if (tabela.getCodigo() == null) {
            throw new CampoVazioException("Selecione uma tabela de preços!");
        } else {
            TabelaPrecoDAO.getInstance().atualizar(tabela);
        }
    }

    public void excluir(TabelaPreco tabela) throws CampoVazioException {
        if (tabela.getCodigo() == null) {
            throw new CampoVazioException("Selecione uma tabela de preços!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a tabela de preços?", "Atenção", 0, 3, null);
            if (opcao == JOptionPane.YES_OPTION) {
                TabelaPrecoDAO.getInstance().excluir(tabela);
            }
        }
    }
}
