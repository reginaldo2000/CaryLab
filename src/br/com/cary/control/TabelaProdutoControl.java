
package br.com.cary.control;

import br.com.cary.dao.TabelaProdutoDAO;
import br.com.cary.entity.TabelaProduto;

/**
 *
 * @author Reginaldo
 */
public class TabelaProdutoControl {
    
    public void salvar(TabelaProduto tab) {
        TabelaProdutoDAO.getInstance().salvar(tab);
    }
    
    public void atualizar(TabelaProduto tab) {
        TabelaProdutoDAO.getInstance().atualizar(tab);
    }
    
    public void excluir(TabelaProduto tab) {
        TabelaProdutoDAO.getInstance().excluir(tab);
    }
}
