package br.com.cary.control;

import br.com.cary.dao.ProdutoDAO;
import br.com.cary.dao.SetorDAO;
import br.com.cary.entity.Produto;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.ProdutoExistenteException;
import br.com.cary.exceptions.RelacionamentoException;
import javax.swing.JOptionPane;

/**
 *
 * @author Reginaldo
 */
public class ProdutoControl {

    public void salvar(Produto p) throws CampoVazioException, ProdutoExistenteException, RelacionamentoException {
        verificaCodigoExistente(p);
        if (p.getDescricao().isEmpty()) {
            throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
        }
//        if (SetorDAO.getInstance().verificaSetor() == null) {
//            throw new RelacionamentoException("Não há nenhum setor cadastrado, por favor cadastre um setor!");
//        }
        ProdutoDAO.getInstance().salvar(p);

    }

    public void editar(Produto p) throws CampoVazioException, ProdutoExistenteException {
        verificaCodigoInexistente(p);
        if (p.getCodigo() == null) {
            throw new CampoVazioException("Selecione um produto!");
        } else {
            if (p.getDescricao().isEmpty()) {
                throw new CampoVazioException("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                ProdutoDAO.getInstance().atualizar(p);
            }
        }
    }

    public void excluir(Produto p) throws CampoVazioException {
        if (p.getCodigo() == null) {
            throw new CampoVazioException("Selecione um produto!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto?", "Atenção", 0, 3, null);
            if (opcao == JOptionPane.YES_OPTION) {
                ProdutoDAO.getInstance().excluir(p);
            }
        }
    }

    private void verificaCodigoExistente(Produto p) throws ProdutoExistenteException {
        if (ProdutoDAO.getInstance().pesquisaProduto(p) != null) {
            throw new ProdutoExistenteException();
        }
    }

    private void verificaCodigoInexistente(Produto p) throws ProdutoExistenteException {
        if (ProdutoDAO.getInstance().pesquisaProduto(p) == null) {
            throw new ProdutoExistenteException("Este produto não foi cadastrado!");
        }
    }
}
