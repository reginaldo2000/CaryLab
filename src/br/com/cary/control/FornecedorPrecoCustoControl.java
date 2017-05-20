
package br.com.cary.control;

import br.com.cary.dao.FornecedorPrecoCustoDAO;
import br.com.cary.entity.FornecedorPrecoCusto;

/**
 *
 * @author Reginaldo
 */
public class FornecedorPrecoCustoControl {

    public void cadastrarPrecoCusto(FornecedorPrecoCusto preco) {
        if (FornecedorPrecoCustoDAO.getInstance().verificaSeExiste(preco) == null) {
            FornecedorPrecoCustoDAO.getInstance().salvar(preco);
        } else {
            FornecedorPrecoCusto aux = FornecedorPrecoCustoDAO.getInstance().verificaSeExiste(preco);
            aux.setPreco(preco.getPreco());
            FornecedorPrecoCustoDAO.getInstance().atualizar(aux);
        }
    }

}
