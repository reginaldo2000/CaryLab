
package br.com.cary.dao;

import br.com.cary.entity.Produto;
import br.com.cary.entity.TabelaProduto;
import br.com.cary.util.ConectaDB;
import br.com.cary.util.GenericDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Reginaldo
 */
public class TabelaProdutoDAO extends GenericDAO {

    public static TabelaProdutoDAO getInstance() {
        return new TabelaProdutoDAO();
    }

    public List<TabelaProduto> listaTabelasPrecoProduto(Produto p) {
        Session s = ConectaDB.getSessionFactory().openSession();
        try {
            Criteria c = s.createCriteria(TabelaProduto.class);
            c.add(Restrictions.eq("produto", p));
            return c.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }
        return null;
    }
    
    

}
