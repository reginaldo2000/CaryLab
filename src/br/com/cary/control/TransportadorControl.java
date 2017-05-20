package br.com.cary.control;

import br.com.cary.dao.TransportadorDAO;
import br.com.cary.entity.Transportador;
import br.com.cary.exceptions.CampoVazioException;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo
 */
public class TransportadorControl {

    public void salvar(Transportador t) throws CampoVazioException {
        if (t.getCodigo() != null) {
            TransportadorDAO.getInstance().atualizar(t);
        } else {
            if (t.getNome().isEmpty() || t.getRota().isEmpty()) {
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                TransportadorDAO.getInstance().salvar(t);
            }
        }
    }

    public void editar(Transportador t) throws CampoVazioException {
        if (t.getCodigo() == null) {
            throw new CampoVazioException("Selecione um transportador!");
        } else {
            if (t.getNome().isEmpty() || t.getRota().isEmpty()) {
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                TransportadorDAO.getInstance().atualizar(t);
            }
        }
    }

    public void excluir(Transportador t) throws CampoVazioException {
        if (t.getCodigo() == null) {
            throw new CampoVazioException("Selecione um transportador!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o transportador?", "Atenção", 0, 3, null);
            if (opcao == JOptionPane.YES_OPTION) {
                TransportadorDAO.getInstance().excluir(t);
            }
        }
    }

}
