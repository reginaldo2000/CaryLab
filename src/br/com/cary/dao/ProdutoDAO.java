package br.com.cary.dao;

import br.com.cary.entity.Produto;
import br.com.cary.exceptions.ProdutoExistenteException;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import cary.utility.Alertas;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Reginaldo
 */
public class ProdutoDAO extends GenericDAO {

    private Session s = null;

    public static ProdutoDAO getInstance() {
        return new ProdutoDAO();
    }

    public Produto pesquisaProduto(Produto p) {
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Produto.class);
            c.add(Restrictions.eq("codigo", p.getCodigo()));
            if (c.uniqueResult() != null) {
                return (Produto) c.uniqueResult();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Alertas.mensagemErro("Erro ao pesquisar o produto!\n" + e.getMessage());
        } finally {
            s.close();
        }
        return null;
    }

    public Long getLastCodigo() {
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Produto.class);
            c.addOrder(Order.desc("codigo"));
            c.setMaxResults(1);
            Produto p = (Produto) c.uniqueResult();
            return p.getCodigo();
        } catch (Exception e) {
            //e.printStackTrace();
            //Alertas.mensagemErro("Erro ao gerar o código do produto!\n"+e.getMessage());
        } finally {
            s.close();
        }
        return null;
    }

    public List<Produto> listaProdutosOrdenados(String consulta) {
        try {
            s = ConectaDB.getSessionFactory().openSession();
            Criteria c = s.createCriteria(Produto.class);
            if (consulta != null) {
                c.add(Restrictions.like("descricao", consulta + "%"));
            }
            c.addOrder(Order.asc("descricao"));
            return c.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
