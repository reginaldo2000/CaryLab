package br.com.cary.control;

import br.com.cary.dao.EntradaDAO;
import br.com.cary.entity.Entrada;
import br.com.cary.exceptions.CampoVazioException;

/**
 *
 * @author Reginaldo
 */
public class EntradaControl {

    public void salvar(Entrada ent) throws CampoVazioException {
        if (ent.getMemorando().isEmpty()) {
            throw new CampoVazioException("O campo 'Memorando' é obrigatório!");
        }
        EntradaDAO.getInstance().salvar(ent);
    }

    public void cancelar(Entrada ent) {
        EntradaDAO.getInstance().excluir(ent);
    }
}
