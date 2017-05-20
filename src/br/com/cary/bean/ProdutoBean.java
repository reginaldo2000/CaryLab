
package br.com.cary.bean;

import br.com.cary.control.ProdutoControl;
import br.com.cary.entity.Produto;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.ProdutoExistenteException;
import br.com.cary.exceptions.RelacionamentoException;

/**
 *
 * @author Reginaldo
 */
public class ProdutoBean {
    
    private Produto produto;
    private ProdutoControl pc;
    
    public ProdutoBean() {
        produto = new Produto();
        pc = new ProdutoControl();
    }
    
    public void salvar() throws CampoVazioException, ProdutoExistenteException, RelacionamentoException {
        pc.salvar(produto);
    }
    
    public void editar() throws CampoVazioException, ProdutoExistenteException {
        pc.editar(produto);
    }

    public void excluir() throws CampoVazioException {
        pc.excluir(produto);
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
